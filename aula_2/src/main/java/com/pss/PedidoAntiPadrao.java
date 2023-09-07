package com.pss;


public class PedidoAntiPadrao {
    private String cliente;
    private String endereco_entrega;
    private double valor_total;
    private String status;

    public PedidoAntiPadrao(String cliente, String endereco_entrega, double valor_total) {
        this.cliente = cliente;
        this.endereco_entrega = endereco_entrega;
        this.valor_total = valor_total;
        this.status = "Pendente";
    }

    // Métodos para calcular taxa de entrega baseado no endereço
    public double calcular_taxa_entrega() {
        // Suponha uma lógica complexa aqui que calcula a taxa baseado no endereço
        return 10.0;
    }

    // Métodos para rastrear o status do pedido
    public void atualizar_para_em_transito() {
        this.status = "Em Transito";
    }

    public void atualizar_para_entregue() {
        this.status = "Entregue";
    }

    // Getters, setters e outros métodos relevantes...
}
