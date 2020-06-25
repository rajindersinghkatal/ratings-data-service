#FROM openjdk:8-jdk-alpine
#EXPOSE 8080
#ADD target/ratings-data-service-0.0.1-SNAPSHOT.jar ratings-data-service-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/ratings-data-service-0.0.1-SNAPSHOT.jar"]
# For Java 8, try this
FROM openjdk:8-jdk-alpine

# For Java 11, try this
#FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/ratings-data-service-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
