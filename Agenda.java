/**
*
* @author Edson Rodrigo
* Email: tec.er@outlook.com
* Site: https://digaotutoriais.wordpress.com/
*/
package com.edson.Aula;

public class Agenda {
	
	private String nome;
	private Contato [] contatos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	

	public void imprimirAgenda(){
		
		System.out.println(this.getNome().toUpperCase());
		for(Contato c : contatos){
			System.out.println("_________________________________________");
			c.imprimiContato();
		}
		
	}
}
