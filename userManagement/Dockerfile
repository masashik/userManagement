FROM openjdk:11 as build

ADD target/userManagement-1.0-SNAPSHOT-jar-with-dependencies.jar /

EXPOSE 8000
ENTRYPOINT ["java", "-jar", "userManagement-1.0-SNAPSHOT-jar-with-dependencies.jar"]
