package com.pss;


public class Pedido {
    private String cliente;
    private String endereco_entrega;
    private double valor_total;
    private String status;
    
    public Pedido(String cliente, String endereco_entrega, double valor_total) {
        this.cliente = cliente;
        this.endereco_entrega = endereco_entrega;
        this.valor_total = valor_total;
        this.status = "Pendente";
    }

    public String get_endereco_entrega() {
        return this.endereco_entrega;
    }
}
