FROM openjdk:8-jdk-alpine
ADD target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]

#ADD target/02-todo-rest-api-h2-0.0.1-SNAPSHOT.jar 02-todo-rest-api-h2-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["sh", "-c", "java -jar /02-todo-rest-api-h2-0.0.1-SNAPSHOT.jar"]
#docker build -t cosmin/spring-h2:0.0.1-SNAPSHOT .
#docker run -d -p 5000:5000 --restart=always -m 1024m --cpu-quota 50000 cosmin/spring-h2:0.0.1-SNAPSHOT
