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
        ManipuladorArquivoAntiPadrao manipulador = new ManipuladorArquivoAntiPadrao();
        try {
            manipulador.processar_arquivo("./aula_3/exemples/exemplo.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
