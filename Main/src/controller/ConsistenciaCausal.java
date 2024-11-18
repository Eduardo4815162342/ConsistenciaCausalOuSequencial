/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Eduardo
 */

import java.util.List;
import model.Operacao;
import model.Replica;

public class ConsistenciaCausal {

    public void aplicarConsistencia(List<Replica> replicas, Operacao operacao) {
        for (Replica replica : replicas) {
            replica.aplicarOperacao(operacao);
        }
        System.out.println("Aplicando consistencia causal para: " + operacao);
    }
}


