FROM ubuntu
EXPOSE 8080
RUN apt-get install -y maven
RUN cd /root
RUN mkdir propostaCredito && cd propostaCredito
RUN git clone https://github.com/github/propostaCredito.git
RUN mvn build
RUN cd target
RUN java -jar propostaCredito.jar
