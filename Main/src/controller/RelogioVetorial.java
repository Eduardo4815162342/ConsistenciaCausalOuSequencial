/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Eduardo
 */


import java.util.Arrays;

public class RelogioVetorial {
    private int[] vetor;

    public RelogioVetorial(int numReplicas) {
        this.vetor = new int[numReplicas];
    }

    // Incrementa o valor no índice da réplica
    public void incrementar(int idReplica) {
        vetor[idReplica]++;
    }

    // Atualiza o relógio vetorial, escolhendo o maior valor entre o atual e o fornecido
    public void atualizar(RelogioVetorial outroVetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Math.max(vetor[i], outroVetor.vetor[i]);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }

    // Método para verificar se este relógio é concorrente ao outro
    public boolean isConcorrente(RelogioVetorial outroVetor) {
        boolean maior = false;
        boolean menor = false;

        for (int i = 0; i < vetor.length; i++) {
            if (this.vetor[i] > outroVetor.vetor[i]) {
                maior = true;
            } else if (this.vetor[i] < outroVetor.vetor[i]) {
                menor = true;
            }
        }

        return maior && menor; // Se ambos são verdadeiros, os relógios são concorrentes
    }
}
