# UEPB - Universidade Estadual da Paraíba
* **Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas - JP (Campus I)
* **Estudante:** Ryan Batista Borge Braga
* **Matrícula:** 2025206510132

---

# Trabalho de Programação Orientada a Objetos (Unidade 1)

Repositório para resoluções da primeira unidade.

## 📌 Questão Escolhida para Resolver: Questão 6 (Controle de Estoque de Medicamentos)

Um hospital deseja controlar o estoque de medicamentos.
* **Classe Medicamento:** Atributos privados (`nome`, `quantidadeEstoque`, `quantidadeMinima` com getters/setters).
* **Métodos:** `retirarMedicamento(int quantidade)`, `reporMedicamento(int quantidade)`, `verificarEstoque()`.
* **Regras:** Não permitir retirada maior que quantidade disponível. Se estoque ficar abaixo do mínimo, exibir: "Atenção: estoque baixo!".
* **Classe Principal (main):** Menu interativo usando `while` e `switch` com as opções de retirar, repor, verificar e sair.

---

## 📄 Todos os Enunciados do Trabalho

### Questão 1
Crie uma classe chamada `Funcionario`:
* **Atributos privados:** nome (String), salario (double)
* **Métodos:** `getNome()`, `setNome()`, `getSalario()`, `setSalario()`, `aumentarSalario(double percentual)` e `exibirDados()`.
* **Regras:** Salário não pode ser negativo. Aumento só ocorre se percentual maior que 0.
* **No main:** Vetor com 3 funcionários. Aplicar aumentos válidos e inválidos. Mostrar dados antes e depois.

### Questão 2
Crie duas classes:
* **Livro:** Atributos privados (`numero`, `titulo`, `autor`, `ano` com getters/setters) e método `exibirInfo()`.
* **Biblioteca:** Atributo lista de até 5 livros (vetor ou ArrayList) e métodos `adicionarLivro()`, `removerLivro()` e `listarLivros()`.
* **Regras:** Utilizar laço de repetição. Não permitir mais que 5 livros.
* **No main:** Usuário cadastra, remove e lista livros.

### Questão 3
Crie uma classe `Calculadora`:
* **Atributos privados:** `num1`, `num2` (com getters/setters).
* **Métodos:** `somar()`, `subtrair()`, `multiplicar()` e `dividir()` (não permitir divisão por zero).
* **No main:** Menu interativo com `while` e `switch` (1. Somar, 2. Subtrair, 3. Multiplicar, 4. Dividir, 5. Sair).

### Questão 4
Crie duas classes:
* **Conta:** Atributos privados (`numero`, `saldo`) e métodos `depositar()`, `sacar()`, `transferir(Conta destino, double valor)` e `exibirConta()`.
* **Cliente:** Atributos privados (`nome`, `cpf`, `conta` com getters/setters).
* **Regras:** Não permitir saldo negativo. Transferência só ocorre se houver saldo suficiente.
* **No main:** Crie dois clientes, realize depósito, saque, transferência e exiba dados finais.

### Questão 5
Cadastro e triagem inicial de pacientes:
* **Paciente:** Atributos privados (`nome`, `idade`, `temperatura`, `pressaoArterial` com getters/setters).
* **Métodos:** `classificarRisco()` (Alto risco: temp > 39 ou pressão > 18; Médio risco: temp entre 37 e 39; Baixo risco: demais casos) e `exibirDados()`.
* **No main:** Vetor para 5 pacientes, use `for` para cadastrar e exiba classificações.

### Questão 6
Um hospital deseja controlar o estoque de medicamentos.
* **Medicamento:** Atributos privados (`nome`, `quantidadeEstoque`, `quantidadeMinima` com getters/setters).
* **Métodos:** `retirarMedicamento()`, `reporMedicamento()` e `verificarEstoque()`.
* **Regras:** Não permitir mudança maior que disponível. Estoque abaixo da quantidade mínima exibe: "Atenção: estoque baixo!".
* **No main:** Menu com `while` (1 - Retirar, 2 - Repor, 3 - Verificar estoque, 4 - Sair).
