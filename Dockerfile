FROM openjdk:17-alpine
ARG JAR_FILE=./build/libs/diginom-0.0.1-SNAPSHOT.jar
ARG CONFIG=./src/main/resources/application.yml
ENV WORKDIR=/app

WORKDIR ${WORKDIR}
COPY ${CONFIG} application.yml
COPY ${JAR_FILE} diginom.jar
ENTRYPOINT ["java", "-jar", "diginom.jar"]