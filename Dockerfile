FROM openjdk:17.0.0-jdk-slim
EXPOSE 8080
ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

LABEL authors="vs070"

ENTRYPOINT ["java", "-jar","/app.jar"]