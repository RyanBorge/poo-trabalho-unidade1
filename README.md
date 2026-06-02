# UEPB - Universidade Estadual da Paraíba
* [cite_start]**Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas - JP (Campus I) [cite: 1, 4]
* [cite_start]**Estudante:** Ryan Batista Borge Braga [cite: 1]
* [cite_start]**Matrícula:** 2025206510132 [cite: 1]

---

# [cite_start]Trabalho de Programação Orientada a Objetos (Unidade 1) [cite: 1, 5]

[cite_start]Repositório para resoluções da primeira unidade do Projeto Limite do Visível. [cite: 1, 4, 5]

## [cite_start]📌 Questão Escolhida para Resolver: Questão 6 (Controle de Estoque de Medicamentos) [cite: 1, 102, 103]

[cite_start]O sistema simula o controle de estoque de um hospital: [cite: 1, 103]
* [cite_start]**Classe Medicamento:** Atributos privados (`nome`, `quantidadeEstoque`, `quantidadeMinima` com getters/setters). [cite: 1, 105, 106, 107, 108, 112]
* [cite_start]**Métodos:** `retirarMedicamento(int quantidade)`, `reporMedicamento(int quantidade)`, `verificarEstoque()`. [cite: 1, 110, 111]
* **Regras:** Não permite retirada maior que a quantidade disponível. [cite_start]Se o estoque ficar abaixo do mínimo, exibe o alerta: "Atenção: estoque baixo!". [cite: 1, 114, 115]
* [cite_start]**Classe Principal (main):** Menu interativo estruturado com `while` e `switch` para gerenciar as operações. [cite: 1, 116, 117]

---

## [cite_start]📄 Enunciados Completos do Trabalho [cite: 1]

### [cite_start]Questão 1 [cite: 1, 6]
[cite_start]Crie uma classe chamada `Funcionario`: [cite: 1, 7]
* [cite_start]**Atributos privados:** nome (String), salario (double) [cite: 1, 8]
* [cite_start]**Métodos:** `getNome()`, `setNome()`, `getSalario()`, `setSalario()`, `aumentarSalario(double percentual)` e `exibirDados()`. [cite: 1, 9, 10, 11, 12]
* **Regras:** O salário não pode ser negativo. [cite_start]O aumento só ocorre se o percentual for maior que 0. [cite: 1, 13]
* **No main:** Crie um vetor com 3 funcionários. Tente aplicar aumentos válidos e inválidos. [cite_start]Mostre os dados antes e depois das alterações. [cite: 1, 14, 15, 16, 17]

### [cite_start]Questão 2 [cite: 1, 18]
[cite_start]Crie duas classes: [cite: 1, 19]
* [cite_start]**Livro:** Atributos privados (`numero`, `titulo`, `autor`, `ano` com getters/setters) e método `exibirInfo()`. [cite: 1, 20, 22, 23]
* [cite_start]**Biblioteca:** Atributo lista de até 5 livros (vetor ou ArrayList) e métodos `adicionarLivro()`, `removerLivro()` e `listarLivros()`. [cite: 1, 24, 25, 26, 27, 29]
* **Requisitos:** Utilizar laço de repetição para percorrer os livros. [cite_start]Não permitir mais que 5 livros. [cite: 1, 30, 31, 32]
* **No main:** Permita que o usuário cadastre e remova livros. [cite_start]Liste todos ao final. [cite: 1, 33, 34, 35]

### [cite_start]Questão 3 [cite: 1, 36]
[cite_start]Crie uma classe `Calculadora`: [cite: 1, 37]
* [cite_start]**Atributos privados:** `num1`, `num2` (com getters/setters). [cite: 1, 38, 40]
* [cite_start]**Métodos:** `somar()`, `subtrair()`, `multiplicar()` e `dividir()` (não permitir divisão por zero). [cite: 1, 39, 41, 42, 43, 44]
* **No main:** Menu interativo com `while` (1. Somar, 2. Subtrair, 3. Multiplicar, 4. Dividir, 5. Sair). Use `switch` para executar. [cite_start]Encerra apenas no "Sair". [cite: 1, 45, 46, 47, 48, 49, 50, 51, 53, 54]

### [cite_start]Questão 4 [cite: 1, 55]
[cite_start]Crie duas classes: [cite: 1, 56]
* [cite_start]**Conta:** Atributos privados (`numero`, `saldo`) e métodos `depositar()`, `sacar()`, `transferir(Conta destino, double valor)` e `exibirConta()`. [cite: 1, 57, 59, 60, 62, 63, 64, 65]
* [cite_start]**Cliente:** Atributos privados (`nome`, `cpf`, `conta` com getters/setters). [cite: 1, 61, 66, 68, 69]
* **Regras:** Não permitir saldo negativo. [cite_start]Transferência só ocorre se houver saldo suficiente. [cite: 1, 70, 71, 72]
* **No main:** Crie dois clientes. Realize depósito, saque e transferência. [cite_start]Exiba os dados finais. [cite: 1, 73, 74, 75, 77, 78, 79]

### [cite_start]Questão 5 [cite: 1, 80]
[cite_start]Triagem inicial de pacientes: [cite: 1, 81]
* [cite_start]**Paciente:** Atributos privados (`nome`, `idade`, `temperatura`, `pressaoArterial` com getters/setters). [cite: 1, 83, 84, 85, 86, 87, 89]
* [cite_start]**Métodos:** `classificarRisco()` (Alto risco: temperatura > 39 ou pressão > 18; Médio risco: temperatura entre 37 e 39; Baixo risco: demais casos) e `exibirDados()`. [cite: 1, 90, 91, 92, 94, 95, 96]
* **No main:** Vetor para 5 pacientes. Use `for` para cadastrar. [cite_start]Exiba os dados e classificações. [cite: 1, 97, 98, 99, 100, 101]

### [cite_start]Questão 6 [cite: 1, 102]
[cite_start]Controle de estoque de medicamentos: [cite: 1, 103]
* [cite_start]**Medicamento:** Atributos privados (`nome`, `quantidadeEstoque`, `quantidadeMinima` com getters/setters). [cite: 1, 105, 106, 107, 108, 112]
* [cite_start]**Métodos:** `retirarMedicamento()`, `reporMedicamento()` e `verificarEstoque()`. [cite: 1, 109, 110, 111]
* **Regras:** Não permitir retirada maior que o disponível. [cite_start]Estoque abaixo do mínimo exibe: "Atenção: estoque baixo!". [cite: 1, 113, 114, 115]
* [cite_start]**No main:** Menu com `while` (1 - Retirar, 2 - Repor, 3 - Verificar estoque, 4 - Sair). [cite: 1, 116, 117, 118, 119, 120, 121, 122]