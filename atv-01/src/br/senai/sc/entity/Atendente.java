package br.senai.sc.entity;

public class Atendente extends Funcionario {

	double AcumuladoDeComissao;
	
	public Atendente() {
		// TODO Auto-generated constructor stub
	}

	public double getAcumuladoDeComissao() {
		return AcumuladoDeComissao;
	}

	public Atendente(double acumuladoDeComissao) {
		super();
		AcumuladoDeComissao = acumuladoDeComissao;
	}
	
	public void acumulaComissao (double valorVenda){
		this.AcumuladoDeComissao += valorComissao(valorVenda); 
	}
	
	public double valorComissao (double valorVenda) {
		return valorVenda * 0.08;
	}
}
