# UEPB - Universidade Estadual da Paraíba
* **Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas - JP (Campus I)
* **Estudante:** Ryan Batista Borge Braga
* **Matrícula:** 2025206510132

---

# Trabalho de Programação Orientada a Objetos (Unidade 1)

Repositório para resoluções da primeira unidade do Projeto Limite do Visível.

## 📌 Questão Escolhida para Resolver: Questão 6 (Controle de Estoque de Medicamentos)

O sistema simula o controle de estoque de um hospital:
* **Classe Medicamento:** Atributos privados (`nome`, `quantidadeEstoque`, `quantidadeMinima` com getters/setters).
* **Métodos:** `retirarMedicamento(int quantidade)`, `reporMedicamento(int quantidade)`, `verificarEstoque()`.
* **Regras:** Não permite retirada maior que a quantidade disponível. Se o estoque ficar abaixo do mínimo, exibe o alerta: "Atenção: estoque baixo!".
* **Classe Principal (main):** Menu interativo estruturado com `while` e `switch` para gerenciar as operações.

---

## �️ Pré-requisitos

Para executar este projeto, você precisará ter instalado em sua máquina:
* **Java Development Kit (JDK)** (versão 8 ou superior).
* Um terminal de comando (CMD, PowerShell, Terminal do Linux/Mac).
* *(Opcional)* Uma IDE de sua preferência (como IntelliJ IDEA, Eclipse, NetBeans ou VS Code).

## 🚀 Passo a Passo da Resolução

A resolução do problema foi dividida nas seguintes etapas:

1. **Criação da Classe `Medicamento`:** 
   * Definição dos atributos privados (`nome`, `quantidadeEstoque` e `quantidadeMinima`) para garantir o encapsulamento.
   * Criação do método construtor para inicializar o objeto com seus valores iniciais, além da geração dos métodos Getters e Setters para o acesso seguro aos dados.
2. **Implementação das Regras de Negócio:**
   * Implementamos o método `retirarMedicamento(int quantidade)` para validar se a quantidade solicitada é menor ou igual ao estoque atual antes de efetuar a baixa, evitando que o estoque fique negativo.
   * Implementamos o método `reporMedicamento(int quantidade)` para somar itens ao estoque.
   * O método `verificarEstoque()` foi desenhado para checar se a quantidade atual ficou menor que a quantidade mínima, emitindo alertas visuais ("Atenção: estoque baixo!" ou "Estoque adequado!"). Ele é invocado após qualquer movimentação de retirada ou reposição.
3. **Criação da Classe Principal com Menu Interativo:** 
   * Usando a classe `Scanner`, instanciamos um objeto para capturar a entrada de dados do usuário via teclado.
   * Criamos um loop estruturado em um laço `while (true)` contendo um bloco `switch/case`, permitindo ao usuário escolher repetidamente ações como: 1 - Retirar Medicamento, 2 - Repor Medicamento, 3 - Checar Estoque ou 0 - Sair do programa.

## 💻 Como Executar

1. Abra o terminal (ou prompt de comando) do seu computador.
2. Navegue até o diretório onde os arquivos do projeto estão salvos.
3. Compile todos os arquivos Java digitando o seguinte comando: `javac *.java`
4. Em seguida, execute a classe que contém o método `main` utilizando o comando: `java Principal` *(Observação: caso o nome do seu arquivo principal seja outro, substitua "Principal" pelo nome exato do arquivo)*.
5. A partir daí, basta seguir as instruções do menu interativo no console, digitando o número correspondente à operação que deseja realizar e pressionando Enter.

---

## �📄 Enunciados do Trabalho

O detalhamento completo de todas as questões propostas pode ser consultado no documento oficial anexado ao repositório:

👉 [Baixar PDF com todas as questões](Trabalho%20Primeira%20Unidade%20Questoes_compressed.pdf)