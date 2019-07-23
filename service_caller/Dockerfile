FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="leonel.da.silva@capgemini.com"

WORKDIR ./app

ADD . .

# Make port 8989 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","target/service_caller-0.0.1-SNAPSHOT.jar"]
