# Creates an image representing the app
# . informs where the Dockerfile is located
`docker build -t jdbc-docker-app:1.0 .`

# Running the image. Docker will create a new container and run the app
`docker run jdbc-docker-app:1.0`
