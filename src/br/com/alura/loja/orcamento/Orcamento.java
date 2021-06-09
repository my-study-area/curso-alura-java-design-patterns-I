package br.com.alura.loja.orcamento;

import br.com.alura.loja.desconto.DescontoParaOrcamentoComValorMaiorQueQuinhentos;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDesconto() {
        BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
        if (situacao.equals("EM_ANALISE")) {
            valorDoDescontoExtra = BigDecimal.valueOf(0.05);
        } else if (situacao.equals("APROVADO")) {
            valorDoDescontoExtra = BigDecimal.valueOf(0.02);
        }
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao = "APROVADO";
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }
}
