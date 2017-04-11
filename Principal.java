/**
*
* @author Edson Rodrigo
* Email: tec.er@outlook.com
* Site: https://digaotutoriais.wordpress.com/
*/
package com.edson.Aula;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME UM NOME PARA A SUA AGENDA:");
		String nomeAgenda = sc.nextLine();
		
		agenda.setNome(nomeAgenda);
		
		Contato contatos [] = new Contato [2];
		
		for(int i = 0; i <contatos.length; i++){
			
			Contato contato = new Contato();
			Endereco end = new Endereco();
			Telefone tel = new Telefone();
			
			System.out.println("INFORME UM NOME PARA O " + (i+1) + "° CONTATO: ");
			String nome = sc.nextLine();
			
			System.out.println("INFORME O NOME DA RUA:  ");
			String nomeRua = sc.nextLine();
			
			System.out.println("INFORME O NOME DO BAIRRO: ");
			String bairro = sc.nextLine();
			
			System.out.println("INFORME O DDD DO TELEFONE: ");
			String ddd = sc.nextLine();
			
			System.out.println("INFORME NUMERO DO TELEFONE: ");
			String numTelefone = sc.nextLine();
			
			System.out.println("INFORME O TIPO DE TELEFONE: ");
			String tipoTel = sc.nextLine();
			
			contato.setNome(nome);
			end.setNomeRua(nomeRua);
			end.setBairro(bairro);
			tel.setDdd(ddd);
			tel.setNumero(numTelefone);
			tel.setTipo(tipoTel);
			
			contato.setEndereco(end);
			contato.setTelefone(tel);
			
			
			contatos[i] = contato;
			
		}
		
		agenda.setContatos(contatos);
		agenda.imprimirAgenda();

	}

}
