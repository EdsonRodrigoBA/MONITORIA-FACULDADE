
/**
*
* @author Edson Rodrigo
* Email: tec.er@outlook.com
* Site: https://digaotutoriais.wordpress.com/
*/
package com.edson.Aula;

public class Endereco {
	
	private String nomeRua;
	private int numero;
	private String complemento;
	private String bairro;
	
	
	public String getNomeRua() {
		return nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public void imprimirEndereco(){
		System.out.println("Rua: " + this.getNomeRua());
		System.out.println("Bairro: " + this.getBairro());
		//System.out.println("Numero: " + this.getNumero());
		//System.out.println("Complemento: " + this.getComplemento());
	}

}
