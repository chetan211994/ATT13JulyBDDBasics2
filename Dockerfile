FROM maven:3.9.9-eclipse-temurin-11-alpine
RUN apk add jq
RUN apk add curl
COPY src /home/seleniumbddtestframework/src
COPY pom.xml /home/seleniumbddtestframework
COPY testng.xml /home/seleniumbddtestframework
COPY runner.sh runner.sh
RUN dos2unix runner.sh
RUN mvn -f /home/seleniumbddtestframework/pom.xml clean test -DskipTests=true
ENTRYPOINT sh runner.sh