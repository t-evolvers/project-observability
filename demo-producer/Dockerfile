# Seleccionar la imagen base de Java 17
FROM openjdk:17-jdk-slim

# Copiar los archivos necesarios al contenedor
COPY . /app
WORKDIR /app

# Instalar xargs
RUN apt-get update

# Instalar Gradle y ejecutar la construcción
RUN ./gradlew clean build -x test

# agente opentelemetry
COPY otel/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

# Ejecutar el microservicio
ENTRYPOINT java -jar -javaagent:/opentelemetry-javaagent.jar /app/build/libs/demo-producer-0.0.1-SNAPSHOT.jar