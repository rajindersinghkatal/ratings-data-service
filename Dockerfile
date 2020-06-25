FROM openjdk:8
EXPOSE 8080
ADD target\ratings-data-service-0.0.1-SNAPSHOT.jar ratings-data-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ratings-data-service-0.0.1-SNAPSHOT.jar"]