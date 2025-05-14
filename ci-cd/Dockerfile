FROM openjdk:17

# Chỉ định file JAR cụ thể
COPY target/backend-service.jar backend-service.jar

ENTRYPOINT ["java", "-jar", "backend-service.jar"]

EXPOSE 9090