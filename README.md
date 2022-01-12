1. Pull the MYSQL image from Docker Hub and run the image using following command
2. **docker run --name  mysql-urlshortnerservice -e MYSQL_ROOT_PASSWORD=Password1 -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=Password1 -d mysql:5.6**
3. Build the spring boot project to generate the artifact
4. Create docker image for urlshortner by running **docker build -t urlshortner-service .**
5. run the service docker image created and link it to the mysql image for db connection
6. 