# Java App

Dockerized Java Application.

## Prerequisites

- [Docker](https://www.docker.com/get-started)

## Building the App

`gradle build`

## Building the Docker Image

`docker build -t java-app:1.0 .`

- `.` specifies the location of the Dockerfile (current directory).

## Running the Docker Container

`docker run java-app:1.0`
