FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/registry-service-0.0.1-SNAPSHOT.jar /app/registry-service.jar

ENTRYPOINT ["java", "-jar", "registry-service.jar"]
