FROM openjdk:8-jdk-alpine
EXPOSE 80

COPY src/main/resources/docker-application.properties application.properties
COPY target/api-0.0.1-SNAPSHOT.jar app.jar 

CMD ["java", "-jar", "app.jar"]