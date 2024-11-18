/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


/**
 *
 * @author Eduardo
 */

import controller.Propagador;
import model.Usuario;


public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.obterEscolhas();

        Propagador propagador = new Propagador(usuario);
        propagador.iniciar();
    }
}

