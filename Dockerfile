FROM openjdk:8-jdk-alpine

COPY target/*SNAPSHOT.jar /app.jar

COPY run.sh /entrypoint.sh

USER root

RUN chmod +x /entrypoint.sh

USER 1000

CMD ["/entrypoint.sh"]
