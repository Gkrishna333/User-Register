FROM openjdk:17-jdk-slim
VOLUME /tmp
EXPOSE 8080
ARG  JAR_FILE=target/user-registrarion-service.jar
ADD  ${JAR_FILE} userregistrarion.jar
ENTRYPOINT ["java","-jar","/userregistrarion.jar"