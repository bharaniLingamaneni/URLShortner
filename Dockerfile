FROM openjdk:8
EXPOSE 8080
ADD target/urlshortner-service.jar urlshortner-service.jar
ENTRYPOINT ["java", "-jar", "urlshortner-service.jar"]