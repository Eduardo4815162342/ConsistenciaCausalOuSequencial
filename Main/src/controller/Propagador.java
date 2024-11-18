/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Eduardo
 */




import java.util.ArrayList;
import java.util.List;
import model.Dado;
import model.Operacao;
import model.Replica;
import model.Usuario;
import util.GeradorAleatorio;

public class Propagador {
    private Usuario usuario;
    private List<Replica> replicas;
    private GeradorAleatorio geradorAleatorio;

    public Propagador(Usuario usuario) {
        this.usuario = usuario;
        this.replicas = new ArrayList<>();
        this.geradorAleatorio = new GeradorAleatorio();

        for (int i = 0; i < usuario.getQuantidadeReplicas(); i++) {
            replicas.add(new Replica(i, usuario.getQuantidadeReplicas()));
        }
    }

    public void iniciar() {
        for (int i = 0; i < 5; i++) {
            String valorDado = geradorAleatorio.gerarValorDado();
            Dado dado = new Dado(valorDado);
            String tipoOperacao = geradorAleatorio.gerarTipoOperacao();
            Operacao operacao = new Operacao(tipoOperacao, dado);

            int replicaEscolhida = geradorAleatorio.gerarIndiceReplica(replicas.size());
            Replica replica = replicas.get(replicaEscolhida);

            try {
                int tempoPropagacao = geradorAleatorio.gerarTempoPropagacao();
                Thread.sleep(tempoPropagacao);  // Simulando a propagação com tempo aleatório
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            replica.aplicarOperacao(operacao);

            // Atualiza outras réplicas para garantir consistência
            for (Replica outraReplica : replicas) {
                if (outraReplica != replica) {
                    outraReplica.getRelogio().atualizar(replica.getRelogio());
                    boolean concorrente = replica.getRelogio().isConcorrente(outraReplica.getRelogio());
                    System.out.println("Operacao concorrente? " + concorrente + " entre replica " + replicaEscolhida + " e outra replica.");
                }
            }
        }
    }
}
