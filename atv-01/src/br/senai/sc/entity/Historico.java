package br.senai.sc.entity;
import java.util.ArrayList;

public class Historico {

private ArrayList<Lancamento> lancamentos;
	
	public Historico() {
		this.lancamentos = new ArrayList<Lancamento>();
	}	
	public void setLancamento(Lancamento lancamento) {
		lancamentos.add(lancamento);
	}
		
	public void gerarRelatorioVendas() {
		double totComissao = 0, totDesconto = 0, totVenda = 0;
		System.out.println("Cliente, valor, desconto, empregado, comiss�o");
		for(Lancamento l: lancamentos){
			System.out.println(l);
			totComissao += l.getComissao();
			totDesconto += l.getDesconto();
			totVenda += l.getValor();
		}
		System.out.println("total vendas: " + totVenda + "total desconto: " + totDesconto + "Total comissao: " + totComissao + "Venda Liquida " + (totVenda - totDesconto - totComissao));
	}
}


