FROM openjdk:17

#Create a new app directory for my application files
RUN mkdir /jdbc-docker-app

# Copy the app files from host machine to image filesystem
COPY build/libs/basic-java-docker-jbdc-1.0.jar /jdbc-docker-app

# Set the directory for executing future commands
WORKDIR /jdbc-docker-app

# Every Dockerfile must specify at least one CMD command or ENTRYPOINT instruction specifying the default instruction
# Update "app.jar" with your actual JAR name
ENTRYPOINT ["java", "-jar", "basic-java-docker-jbdc-1.0.jar"]
