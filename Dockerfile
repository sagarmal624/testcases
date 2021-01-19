FROM openjdk:11
COPY target/demo-0.0.1-SNAPSHOT.war sagarandcompany.war
EXPOSE 8081
ENTRYPOINT ["java","-jar","sagarandcompany.war"]