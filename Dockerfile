FROM openjdk:8 AS build
ADD . /src
WORKDIR /src
ARG COMMIT_ID
ENV COMMIT_ID=$COMMIT_ID
RUN ./gradlew --no-daemon service:clean service:build service:bootJar  --info
FROM openjdk:8-jre
EXPOSE 9288
HEALTHCHECK --retries=12 --interval=90s CMD curl -s localhost:9288/health || exit 1
COPY --from=build /src/service/build/libs/service-*.jar /usr/local/bin/service.jar
COPY --from=build /src/run.sh /usr/local/bin/run.sh
RUN chmod +x /usr/local/bin/service.jar
RUN chmod +x /usr/local/bin/run.sh

CMD ["/usr/local/bin/run.sh"]
