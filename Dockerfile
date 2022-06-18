FROM openjdk:8
LABEL description="Echo IP Java Application"
EXPOSE 6871
COPY ./target/sample.jar /opt/sample-image.jar
WORKDIR /opt
ENTRYPOINT [ "java", "-jar", "sample-image.jar" ]
