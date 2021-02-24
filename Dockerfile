FROM openjdk:8-jdk-alpine
EXPOSE 8000

COPY src/main/resource/docker-application.properties application.properties
COPY target/api-0.0.1-SNAPSHOT.jar app.jar 

CMD ["java", "-jar", "app.jar"]