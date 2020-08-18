FROM openjdk:8-jdk-alpine AS builder
RUN mkdir /home/service
COPY target/*.jar /home/service/service.jar
WORKDIR /home/service
RUN jar -xf service.jar

FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=/home/service
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT exec java $JVM_OPTS -cp app:app/lib/* br.com.qualirede.autorizacoes.AutorizacoesProcedimentosApplication
