package br.senai.sc.entity;

public class Caixa extends Funcionario {
	
	double DiferencaAcumulada = 0;

	public Caixa() {
		// TODO Auto-generated constructor stub
	}

	public void setDiferencaAcumulada(double diferencaAcumulada) {
		DiferencaAcumulada = diferencaAcumulada;
	}

	public void diferencaCaixa (double diferencaCaixa)
	{
		this.DiferencaAcumulada += diferencaCaixa;
	}
	public Caixa(double diferencaAcumulada) {
		super();
		DiferencaAcumulada = diferencaAcumulada;
	}
	
	public void zerarAcumulador(){
		this.DiferencaAcumulada = 0 ;
	}
}

