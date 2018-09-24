package br.senai.sc.entity;

import java.util.*;

public abstract class Funcionario extends Pessoa {
	
	Date dataDeContratacao;
	String CarteiraDeTrabalho;
	double Salario;

	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public double getSalario() {
		return Salario;
	}

	public Funcionario(Date dataDeContratacao, String carteiraDeTrabalho, double salario) {
		super();
		this.dataDeContratacao = dataDeContratacao;
		CarteiraDeTrabalho = carteiraDeTrabalho;
		Salario = salario;
	}
	public Funcionario(String nome, String cPF, java.sql.Date dataDeNascimento) {
		super(nome, cPF, dataDeNascimento);
		// TODO Auto-generated constructor stub
	}
}
