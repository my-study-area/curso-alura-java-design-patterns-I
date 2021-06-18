package br.com.alura.loja.testes;

import br.com.alura.loja.acao.EnviarEmailPedido;
import br.com.alura.loja.acao.SalvarPedidoNoBancoDeDados;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.GeradorPedido;
import br.com.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedido {
    public static void main(String[] args) {
        String cliente = "Maria";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = Integer.parseInt("6");

        GeradorPedido geradorPedido = new GeradorPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
            Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBancoDeDados())
        );
        handler.executar(geradorPedido);
    }
}
