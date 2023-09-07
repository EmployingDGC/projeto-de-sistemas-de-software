package com.pss;


/**
 * Hello world!
 */
public final class App {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Criando um pedido
        Pedido pedido = new Pedido("João Silva", "Rua das Flores, 123", 50.0);

        // Calculando a taxa de entrega para o pedido
        CalculadoraTaxaEntrega calculadora = new CalculadoraTaxaEntrega();
        double taxa = calculadora.calcular_taxa(pedido.get_endereco_entrega());
        System.out.println("Taxa de Entrega: R$" + taxa);

        // Aplicando um desconto
        GestorDeDescontos gestorDeDescontos = new GestorDeDescontos();
        double desconto = gestorDeDescontos.aplicar_desconto(pedido, "DESC10");
        System.out.println("Desconto aplicado: R$" + desconto);
        double valorFinal = pedido.get_valor_total() - desconto;
        System.out.println("Valor final com desconto: R$" + valorFinal);

        // Rastreando e atualizando o status do pedido
        RastreadorPedido rastreador = new RastreadorPedido(pedido);
        rastreador.atualizar_para_em_transito();
        System.out.println("Status do Pedido: Em Trânsito");
        
        // Supondo uma lógica de tempo ou evento aqui...
        
        rastreador.atualizar_para_entregue();
        System.out.println("Status do Pedido: Entregue");
    }
}
