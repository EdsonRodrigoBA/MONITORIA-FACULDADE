/**
*
* @author Edson Rodrigo
* Email: tec.er@outlook.com
* Site: https://digaotutoriais.wordpress.com/
*/
package com.edson.Aula;

public class Contato {
	
	private String nome;
	private Telefone telefone;
	private Endereco endereco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void imprimiContato(){
		
		System.out.println("Nome do Contato: " + this.getNome());
		this.getEndereco().imprimirEndereco();
		this.getTelefone().imprimirTel();
	}
	

}
