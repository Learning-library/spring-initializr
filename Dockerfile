FROM java:8

COPY target/initializr.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar" ,"/app.jar"]