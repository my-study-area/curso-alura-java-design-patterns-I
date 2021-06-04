package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(BigDecimal.valueOf(500.0)) > 0) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
        }
        return proximo.calcular(orcamento);
    }
}
