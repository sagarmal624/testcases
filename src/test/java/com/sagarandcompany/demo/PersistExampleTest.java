package com.sagarandcompany.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PersistExample.class)
public class PersistExampleTest {
    @Test
    public void test() {
//        MockedStatic<PersistExample> mockedStatic = Mockito.mockStatic(PersistExample.class);
//        mockedStatic.when(PersistExample::serlizae).thenReturn("s");
//        Mockito.when(PersistExample.serlizae("test")).thenReturn("ss".getBytes());
    }
}
