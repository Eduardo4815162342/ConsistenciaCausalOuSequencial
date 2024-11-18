/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eduardo
 */

public class Operacao {
    private String tipo;
    private Dado dado;

    public Operacao(String tipo, Dado dado) {
        this.tipo = tipo;
        this.dado = dado;
    }

    public String getTipo() {
        return tipo;
    }

    public Dado getDado() {
        return dado;
    }

    @Override
    public String toString() {
        return "Operacao: " + tipo + " no dado com valor: " + dado.getValor();
    }
}

