package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }

        if (orcamento.getValor().compareTo(BigDecimal.valueOf(500.0)) > 500) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return BigDecimal.ZERO;
    }

}
