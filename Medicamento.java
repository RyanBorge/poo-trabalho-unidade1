public class Medicamento {
    private String nome;
    private int quantidadeEstoque;
    private quantidadeMinima;

    public Medicamento(String nome, int quantidadeEstoque, int quantidadeMinima) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public void retirarMedicamento(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            verificarEstoque();
        } else {
            System.out.println("Erro: Não há quantidade suficiente!");
        }
    }

     public void reporMedicamento(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println("Medicamento reposto com sucesso!");
        verificarEstoque();
    }
    
    public void verificarEstoque() {
        if (quantidadeEstoque < quantidadeMinima) {
            System.out.println("Atenção: estoque baixo!");
        } else {
            System.out.println("Estoque adequado!");
        }
    }

}