# Projeto: Simulador de Consistência com Réplicas

## Visão Geral
Este projeto é um simulador para demonstrar a aplicação dos modelos de consistência **Sequencial** e **Causal** em um sistema distribuído com réplicas. O sistema simula a propagação de operações de leitura e escrita entre réplicas, utilizando um **relógio vetorial** para rastrear o estado de cada réplica e avaliar a **concorrência** das operações.

### Funcionalidades
- Escolha da quantidade de réplicas (entre 2 e 5).
- Simulação dos modelos de consistência: **Sequencial** ou **Causal**.
- Geração de operações aleatórias de leitura e escrita.
- Atualização e visualização do **relógio vetorial** de cada réplica.
- Identifica se as operações são **concorrentes** ou não.

## Estrutura do Projeto
O projeto é organizado da seguinte forma:

```
.
    ├── main/
    │   └── Main.java
    ├── model/
    │   ├── Dado.java
    │   ├── Operacao.java
    │   ├── Replica.java
    │   ├── Usuario.java
    │   └── RelogioVetorial.java
    ├── controller/
    │   ├── ConsistenciaSequencial.java
    │   ├── ConsistenciaCausal.java
    │   └── Propagador.java
    └── util/
        └── GeradorAleatorio.java
```

### Descrição das Classes
- **Main.java**: Ponto de entrada do programa.
- **Dado.java**: Representa um dado compartilhado, que pode ser manipulado pelas operações de escrita e leitura.
- **Operacao.java**: Representa uma operação (leitura ou escrita) que pode ser realizada sobre um dado.
- **Replica.java**: Representa uma réplica no sistema, contendo uma lista de dados e um relógio vetorial.
- **Usuario.java**: Lida com as entradas do usuário, como a escolha do modelo de consistência e a quantidade de réplicas.
- **RelogioVetorial.java**: Implementa o relógio vetorial, que é utilizado para rastrear o estado das operações em cada réplica.
- **ConsistenciaSequencial.java** e **ConsistenciaCausal.java**: Contêm a lógica de aplicação dos modelos de consistência.
- **Propagador.java**: Gerencia a propagação das operações entre as réplicas.
- **GeradorAleatorio.java**: Gera valores aleatórios para as operações e para o tempo de propagação.

## Como Executar o Projeto

### Requisitos
- **Java 11** ou superior instalado.
- Um editor de código, como **IntelliJ IDEA**, **Eclipse** ou qualquer outro editor que suporte Java.

### Passos para Executar
1. **Clone o Repositório**:
   
   Clone este repositório para o seu ambiente local usando o comando:
   ```sh
   git clone <https://github.com/Eduardo4815162342/ConsistenciaCausalOuSequencial>
   ```

2. **Compilar o Projeto**:
   
   Navegue até o diretório raiz do projeto e compile o código-fonte com o seguinte comando:
   ```sh
   javac main/Main.java
   ```

3. **Executar o Projeto**:
   
   Execute o programa com o seguinte comando:
   ```sh
   java main.Main
   ```

4. **Interagir com o Programa**:
   
   - Ao executar, você será solicitado a fornecer a quantidade de réplicas (entre 2 e 5).
   - Escolha o modelo de consistência: **Sequencial** ou **Causal**.
   - O programa irá gerar operações de leitura e escrita aleatórias, aplicá-las nas réplicas e exibir os resultados com detalhes sobre o relógio vetorial e se houve concorrência.

## Exemplo de Saída

```
Escolha a quantidade de réplicas (2 <= M <= 5): 3
Escolha o modelo de consistência (Sequencial ou Causal): Sequencial
Réplica 0 aplicou: Operação: Escrita no dado com valor: Valor52, Relógio Vetorial: [1, 0, 0]
Concorrência entre réplica 0 e réplica 1? false
Concorrência entre réplica 0 e réplica 2? false
...
