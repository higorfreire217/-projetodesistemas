package br.senai.sc.entity;
import java.util.Date;

public class Cliente extends Pessoa {
	
	String Telefone;
	Date DataCadastro, DataUltimaCompra;
	double	AcumuladoDeCompras;
	public enum Situacao {Inicial, Preferencial, Especial};

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Date getDataCadastro() {
		return DataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		DataCadastro = dataCadastro;
	}
	public void setDataUltimaCompra(Date dataUltimaCompra) {
		DataUltimaCompra = dataUltimaCompra;
	}
	public double getAcumuladoDeCompras() {
		return AcumuladoDeCompras;
	}
	public void acumulaCompras(double valor){
		Date hoje = new Date();
		if(DateOperation.moreSixMonths(DataUltimaCompra)){
			this.AcumuladoDeCompras = 0;
		}
		this.DataUltimaCompra = hoje;
		this.AcumuladoDeCompras += valor;
	}
	
	public double getDesconto(double valor){
		double percentualDesconto = 0;
		if(DateOperation.aniversario(getDataDeNascimento())) {
			percentualDesconto = 0.05;
		} if (this.AcumuladoDeCompras > 1000) {
			percentualDesconto = 0.15;
		} else if (this.AcumuladoDeCompras > 3000) {
			percentualDesconto = 0.05;
		}
		return valor * percentualDesconto;
	}
}
