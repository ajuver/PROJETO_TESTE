FROM ubuntu
EXPOSE 8080
RUN apt-get update
RUN apt-get install -y maven git
RUN git clone https://github.com/michaelbatalha/PROJETO_TESTE.git
RUN cd /PROJETO_TESTE && mvn clean install && java -jar /PROJETO_TESTE/target/propostaCredito-0.0.1-SNAPSHOT.jar