/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eduardo
 */




import controller.RelogioVetorial;
import java.util.ArrayList;
import java.util.List;

public class Replica {
    private List<Dado> dados;
    private RelogioVetorial relogio;
    private int idReplica;

    public Replica(int id, int totalReplicas) {
        this.dados = new ArrayList<>();
        this.relogio = new RelogioVetorial(totalReplicas);
        this.idReplica = id;
    }

    // Método que aplica uma operação na réplica, atualizando os dados e o relógio vetorial
    public void aplicarOperacao(Operacao operacao) {
        // Atualiza o relógio vetorial
        relogio.incrementar(idReplica);

        if (operacao.getTipo().equalsIgnoreCase("Escrita")) {
            // Em caso de escrita, adiciona o dado
            dados.add(operacao.getDado());
            System.out.println("Replica " + idReplica + " aplicou: " + operacao +
                    ", Relogio Vetorial: " + relogio);
        } else if (operacao.getTipo().equalsIgnoreCase("Leitura")) {
            // Em caso de leitura, mostra qual valor está sendo lido (se houver dados)
            if (!dados.isEmpty()) {
                Dado ultimoDado = dados.get(dados.size() - 1);
                System.out.println("Replica " + idReplica + " leu: " + ultimoDado.getValor() +
                        ", Relogio Vetorial: " + relogio);
            } else {
                System.out.println("Replica " + idReplica + " tentou ler, mas nao ha dados disponiveis." +
                        ", Relogio Vetorial: " + relogio);
            }
        }
    }

    public RelogioVetorial getRelogio() {
        return relogio;
    }
}

