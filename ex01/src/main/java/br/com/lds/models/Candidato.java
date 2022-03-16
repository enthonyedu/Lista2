package br.com.lds.models;

public class Candidato {

	public Candidato(int idConstrutor, String nomeConstrutor) {

		this.id = idConstrutor;
		this.nome = nomeConstrutor;

		this.numeroDeVotos = 0;

	}

	private int id;
	private String nome;
	private int numeroDeVotos;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void adicionarVoto() {

		this.numeroDeVotos += 1;

	}

	public int getNumeroDeVotos() {
		return numeroDeVotos;
	}

}
