package br.com.lds.models;

public class Candidato {

	public Candidato(int idConstrutor, String nomeConstrutor) {

		this.id = idConstrutor;
		this.nome = nomeConstrutor;

	}

	private int id;
	private String nome;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
