# Use a base image that contains Java (OpenJDK)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot jar from the build output to the container
COPY target/Graphqldemo-0.0.1-SNAPSHOT.jar /app/Graphqldemo-0.0.1-SNAPSHOT.jar

# Expose the port that the Spring Boot app will run on (default is 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/Graphqldemo-0.0.1-SNAPSHOT.jar"]
