FROM openjdk:11
COPY target/usermanagement-0.0.1-SNAPSHOT.jar usermanagement-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/usermanagement-0.0.1-SNAPSHOT.jar"]