# Use an appropriate base image
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/user-service-0.0.1-SNAPSHOT.jar /app/user-service.jar

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/app/user-service.jar"]
