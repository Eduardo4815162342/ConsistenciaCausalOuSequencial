/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eduardo
 */


import java.util.Scanner;

public class Usuario {
    private int quantidadeReplicas;
    private String tipoConsistencia;

    public void obterEscolhas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a quantidade de replicas (2 <= M <= 5): ");
        quantidadeReplicas = scanner.nextInt();

        System.out.println("Escolha o modelo de consistencia (Sequencial ou Causal): ");
        tipoConsistencia = scanner.next();

        scanner.close();
    }

    public int getQuantidadeReplicas() {
        return quantidadeReplicas;
    }

    public String getTipoConsistencia() {
        return tipoConsistencia;
    }
}
