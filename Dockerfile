FROM openjdk:8-jdk-alpine

ADD target/docker-boot-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar", "/app.jar"]