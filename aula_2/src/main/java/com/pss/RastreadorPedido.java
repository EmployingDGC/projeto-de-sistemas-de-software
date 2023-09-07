package com.pss;


public class RastreadorPedido {
    private Pedido pedido;
    
    public RastreadorPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void atualizar_para_em_transito() {
        // Atualizar status do pedido e possivelmente adicionar lógicas adicionais
        // como notificar o cliente
    }

    public void atualizar_para_entregue() {
        // Atualizar status do pedido e possivelmente adicionar lógicas adicionais
        // como notificar o cliente
    }

}
