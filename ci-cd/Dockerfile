FROM openjdk:17

# Chỉ định file JAR cụ thể
COPY ci-cd/target/backend-service.jar backend-service.jar

ENTRYPOINT ["java", "-jar", "backend-service.jar"]

EXPOSE 8080