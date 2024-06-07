# JDBC Docker App

Dockerized application connecting to a JDBC database.

## Prerequisites

- [Docker](https://www.docker.com/get-started)

## Building the App

`gradle build`

## Building the Docker Image

`docker build -t jdbc-docker-app:1.0 .`

- `.` specifies the location of the Dockerfile (current directory).

## Running the Docker Container

`docker run jdbc-docker-app:1.0`

## Dockerfile Example

```dockerfile
FROM openjdk:17
RUN mkdir /jdbc-docker-app
COPY build/libs/basic-java-docker-jbdc-1.0.jar /jdbc-docker-app
WORKDIR /jdbc-docker-app
ENTRYPOINT ["java", "-jar", "basic-java-docker-jbdc-1.0.jar"]
```

## Docker Commands

`docker images` list the docker images

`docker ps` list the containers

## Docker Compose

You can ignore all the above steps and run at the same time the Java app alongside with My Sql container using Docker Compose

`docker-compose up`

## Docker References
Intro to Docker [with Java Examples]: https://www.youtube.com/watch?v=FzwIs2jMESM

Intro to Docker - Part 2 (Networking, Docker Compose): https://www.youtube.com/watch?v=_m9JYAvFB8shttps://www.youtube.com/watch?v=FzwIs2jMESM
