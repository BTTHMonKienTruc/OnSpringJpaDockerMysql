FROM maven:3.8.2-jdk-11

RUN mkdir /bezkoder-app

WORKDIR /bezkoder-app

COPY . .

EXPOSE 8080

CMD [ "mvn", "spring-boot:run"]