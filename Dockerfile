# Use the official Maven image as the base image
FROM maven:3.8-openjdk-17

# Set the working directory in the container
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the application using Maven
RUN mvn clean package

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "target/webflux-0.0.1-SNAPSHOT.jar"]
