FROM openjdk:17-jdk-slim

EXPOSE 8080
COPY target/Identity_service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]