package br.senai.sc.entity;

import java.util.Date;
public class Lancamento {
	private Date hoje;
	private Funcionario funcionario;
	private Cliente cliente;
	private double valor;
	private double comissao;
	private double desconto;
	
	public Lancamento(Date hoje, Funcionario funcionario, Cliente cliente, double valor, double comissao, double desconto) {
		super();
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.valor = valor;
		this.comissao = comissao;
		this.desconto = desconto;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public double getValor() {
		return valor;
	}
	public double getComissao() {
		return comissao;
	}
	public double getDesconto() {
		return desconto;
	}
	
	@Override
	public String toString() {
		return cliente.getNome() + ", " + valor + ", " + desconto + ", " + funcionario.getNome() + ", " + comissao;
	}
	
}

