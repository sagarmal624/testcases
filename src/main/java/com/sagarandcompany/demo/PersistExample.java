package com.sagarandcompany.demo;

import java.text.SimpleDateFormat;
import java.util.*;

public class PersistExample {
    private static String DATE_FORMAT = "yyyyMMMdd";

    public static void main(String[] args) {

        List<Blob> blobs = new ArrayList<>();
        Blob blob1 = new Blob();
        blob1.setName("Decrypted-trans.tboc.2021Jan18142033.2021Jan17.2021Jan17.failure.txt");
        blob1.setLastUpdateTime(1611023628L);
        Blob blob2 = new Blob();
        blob2.setName("Decrypted-trans.tboc.2021Jan18142033.fytftrdtrdtrdtrd9.failure.txt");
        blob2.setLastUpdateTime(1610937227L);
        blobs.add(blob1);
        blobs.add(blob2);
        System.out.println(isFileExist(blobs, "Decrypted-trans.tboc.", ".failure.txt"));
    }

    private static boolean isFileExist(List<Blob> blobs, String prefix, String suffix) {
        Blob blob = getFile(blobs, getDate(), prefix, suffix);
        return blob != null;
    }

    private static String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC-5"));
        Date calDate = cal.getTime();
        return simpleDateFormat.format(calDate);
    }

    public static Blob getFile(List<Blob> blobs, String date, String prefix, String suffix) {
        Comparator<Blob> comparator = (a, b) -> b.getLastUpdateTime().compareTo(a.getLastUpdateTime());

        return blobs.parallelStream().filter(it -> {
            String name = it.getName();
            return name.startsWith(prefix) && name.contains(date) && name.endsWith(suffix);
        }).sorted(comparator).findFirst().orElse(null);
    }
}

