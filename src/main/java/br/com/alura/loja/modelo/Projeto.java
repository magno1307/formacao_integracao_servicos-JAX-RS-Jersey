package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Projeto {

	public Projeto(Long id, String nome, int anoDeInicio) {
		this.setId(id);
		this.setNome(nome);
		this.setAnoDeInicio(anoDeInicio);
	}
	
	String nome;
	Long id;
	int anoDeInicio;
	
	public String getNome() {
		return nome;
	}
	
	public Long getId() {
		return id;
	}
	
	public int getAnoDeInicio() {
		return anoDeInicio;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setAnoDeInicio(int anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	
	public String toXML() {
		return new XStream().toXML(this);
	}

	public String toJson() {
		return new Gson().toJson(this);
	}
	
}
