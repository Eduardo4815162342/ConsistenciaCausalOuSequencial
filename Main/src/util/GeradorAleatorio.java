/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Random;

public class GeradorAleatorio {
    private Random random;

    public GeradorAleatorio() {
        this.random = new Random();
    }

    // Gera um tempo de propagação aleatório entre 100 e 1000 ms
    public int gerarTempoPropagacao() {
        return random.nextInt(900) + 100;  // Valor entre 100 e 1000 ms
    }

    // Gera uma operação aleatória (leitura ou escrita)
    public String gerarTipoOperacao() {
        return random.nextBoolean() ? "Leitura" : "Escrita";
    }

    // Gera um valor aleatório para o dado
    public String gerarValorDado() {
        return "Valor" + random.nextInt(100);
    }

    // Gera um índice aleatório de réplica, usado para propagação entre réplicas
    public int gerarIndiceReplica(int limite) {
        return random.nextInt(limite);
    }
}

