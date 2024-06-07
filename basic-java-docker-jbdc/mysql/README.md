# MySQL Docker Setup

## Logging into the MySQL Container

To log into the MySQL container via terminal:

`docker exec -it my-mysql-container mysql -u root -p`

- `-it` makes the terminal interactive.
- `my-mysql-container` is the name of the running container.
- `mysql -u root -p` starts the MySQL client and prompts for the root password.
