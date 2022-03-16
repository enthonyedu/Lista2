package br.com.lds;

import java.util.HashMap;
import java.util.Map;

import br.com.lds.models.Candidato;

public class Main {

	private Map<Integer, Candidato> mapaDeCandidatos = new HashMap<Integer, Candidato>();

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {

		inicializarMapaDeCandidatos();

	}

	private void inicializarMapaDeCandidatos() {

		Candidato joao = new Candidato(1, "Joao");

		Candidato maria = new Candidato(2, "Maria");
		Candidato jose = new Candidato(3, "Jose");
		Candidato antonio = new Candidato(4, "Antonio");
		Candidato tiburssinho = new Candidato(5, "Tiburssinho");

		System.out.println("Id: " + tiburssinho.getId());
		System.out.println("Nome: " + tiburssinho.getNome());

	}

}
