FROM openjdk:17-alpine
ARG JAR_FILE=./build/libs/diginom-0.0.1-SNAPSHOT.jar
ENV WORKDIR=/app

WORKDIR ${WORKDIR}
COPY ${JAR_FILE} diginom.jar
EXPOSE ${EXPOSE}
ENTRYPOINT ["java", "-jar", "diginom.jar"]