FROM java:8
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/EkartProductManagement-0.0.1-SNAPSHOT.jar /app/EkartProductManagement.jar
ENTRYPOINT ["java", "-jar", "/app/EkartProductManagement.jar"]