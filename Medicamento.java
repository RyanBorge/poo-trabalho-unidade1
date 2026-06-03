/// AQUI FO CRIADA A CLASSE COM AS VARAIVEIS PRIVADAS 
public class Medicamento {
    private String nome;
    private int quantidadeEstoque;
    private int quantidadeMinima;
    
    /// AQUI VAI TER O CONSTRUTOR PARA QUE VAI USAR AS VARIAVEIS PRIVADAS PARA INICIALIZAR O OBJETO
    public Medicamento(String nome, int quantidadeEstoque, int quantidadeMinima) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
    }
    
    // Get = lê o valor / Set = muda o valor
    // Lê nome
    public String getNome() {
        return nome;
    }
    // Muda nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Lê estoque atual
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    // Muda estoque atual
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    // Lê estoque mínimo
    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }
    // Muda estoque mínimo
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    /// METODO PARA RETIRAR MEDICAMENTO - VALIDA SE TEM QUANTIDADE SUFICIENTE
    public void retirarMedicamento(int quantidade) {
        // Verifica se a quantidade que quer retirar é menor ou igual ao que tem
        if (quantidade <= quantidadeEstoque) {
            // Se sim, subtrai do estoque
            quantidadeEstoque -= quantidade;
            // Verifica se ficou baixo depois de retirar
            verificarEstoque();
        } else {
            // Se não tem suficiente, mostra erro
            System.out.println("Erro: Não há quantidade suficiente!");
        }
    }
    
    /// METODO PARA REPOR (ADICIONAR) MEDICAMENTO AO ESTOQUE
    public void reporMedicamento(int quantidade) {
        // Soma a quantidade ao estoque
        quantidadeEstoque += quantidade;
        // Mostra mensagem de sucesso
        System.out.println("Medicamento reposto com sucesso!");
        // Verifica se agora está adequado
        verificarEstoque();
    }
    
    /// METODO PARA VERIFICAR SE O ESTOQUE ESTA BAIXO OU ADEQUADO
    public void verificarEstoque() {
        // Verifica se estoque ficou menor que o mínimo
        if (quantidadeEstoque < quantidadeMinima) {
            // Se sim, mostra alerta
            System.out.println("Atenção: estoque baixo!");
        } else {
            // Se não, mostra que está ok
            System.out.println("Estoque adequado!");
        }
    }
}