package br.com.anotacaoleitura;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;



public class ClasseAnotacao {


	public static <T> void main(String[] args) {
    
		BuscaAnotacao ano = new BuscaAnotacao();
		ano.setValue("Tabela de Códigos");
		System.out.println("Nome da Tabela: " + ano.getValue());
		
	}
}
		
	
	
	

	
	


