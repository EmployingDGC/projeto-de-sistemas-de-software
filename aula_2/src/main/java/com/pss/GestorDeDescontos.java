package com.pss;

import java.util.HashMap;
import java.util.Map;


public class GestorDeDescontos {
    private Map<String, Double> codigos_desconto; // mapeia códigos a descontos percentuais

    public GestorDeDescontos() {
        this.codigos_desconto = new HashMap<String, Double>();
        // Preencher com códigos de desconto pré-definidos
        this.codigos_desconto.put("DESC10", 10.0); // 10% de desconto
        // ... outros códigos
    }

    public double aplicar_desconto(Pedido pedido, String codigo) {
        if (codigos_desconto.containsKey(codigo)) {
            double desconto_percentual = codigos_desconto.get(codigo);

            return pedido.get_valor_total() * (desconto_percentual / 100);
        }

        return 0; // Sem desconto
    }

}
