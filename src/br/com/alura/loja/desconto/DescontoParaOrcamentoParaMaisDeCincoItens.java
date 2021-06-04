package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoParaMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoParaMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return proximo.calcular(orcamento);
    }
}
