/**
*
* @author Edson Rodrigo
* Email: tec.er@outlook.com
* Site: https://digaotutoriais.wordpress.com/
*/
package com.edson.Aula;

public class Telefone {
	
	private String ddd;
	private String numero;
	private String tipo;
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void imprimirTel(){
		System.out.println("(" + this.getDdd() + ") " + this.getNumero() + "\n" + "TIPO DO TELEFONE: " +this.getTipo());
	}
	
	

}
