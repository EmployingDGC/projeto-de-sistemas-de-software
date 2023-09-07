package com.pss;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ManipuladorArquivoAntiPadrao {
    public void processar_arquivo(String caminho_arquivo) throws Exception {
        List<String> linhas = Files.readAllLines(Paths.get(caminho_arquivo));
        Map<String, Integer> frequenciaPalavras = new HashMap<>();

        for (String linha : linhas) {
            String[] palavras = linha.split("[\\s\\t.,]");
            for (String palavra : palavras) {
                frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
            }
        }

        List<String> relatorio = new ArrayList<>();
        for (Map.Entry<String, Integer> entrada : frequenciaPalavras.entrySet()) {
            relatorio.add(entrada.getKey() + ": " + entrada.getValue());
        }

        Files.write(Paths.get("./aula_3/exemples/relatorio.txt"), relatorio);
    }
}
