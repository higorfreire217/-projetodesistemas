package br.senai.sc.entity;
import java.sql.Date;

public class Pessoa {
	
	String Nome;
	String	CPF; 
	Date DataDeNascimento;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getDataDeNascimento() {
		return DataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}

	public Pessoa(String nome, String cPF, Date dataDeNascimento) {
		super();
		Nome = nome;
		CPF = cPF;
		DataDeNascimento = dataDeNascimento;
	}	
}
