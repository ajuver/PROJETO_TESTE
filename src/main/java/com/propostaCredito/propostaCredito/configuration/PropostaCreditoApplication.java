package com.propostaCredito.propostaCredito.configuration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.propostaCredito.propostaCredito.app.resources.conexaoBanco.ConexaoMySQL;

@Configuration
@SpringBootApplication
@ServletComponentScan
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.propostaCredito", lazyInit = true)
public class PropostaCreditoApplication {

	public static void main(String[] args) throws SQLException {
		
		SpringApplication.run(PropostaCreditoApplication.class, args);
		System.out.println("HOJE");
		
	    Connection con = ConexaoMySQL.getConexaoMySQL();
	    
	    System.out.println("teste");
	    
	    System.out.println(ConexaoMySQL.statusConection());		
		
		  // the mysql insert statement
		  String query = " insert into proposta(nome)"
		+ " values (?)";
		
		  // create the mysql insert preparedstatement
		  PreparedStatement preparedStmt = con.prepareStatement(query);
		  preparedStmt.setString (1, "MICHAEL");
		
		  // execute the preparedstatement
		  preparedStmt.execute();

		 
	}

}
