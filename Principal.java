/// IMPORTA A BIBLIOTECA SCANNER PARA LER ENTRADA DO USUARIO
import java.util.Scanner;

/// AQUI E A CLASSE PRINCIPAL - ONDE TEM O MENU E O MAIN
public class Principal {
    /// VARIAVEL GLOBAL - SCANNER PARA LER O QUE USER DIGITA
    static Scanner scanner = new Scanner(System.in);
    /// VARIAVEL GLOBAL - CRIA UM MEDICAMENTO PARA USAR EM TODO PROGRAMA
    static Medicamento medicamento = new Medicamento("Dipirona", 100, 20);
    
    /// METODO PARA LIMPAR A TELA - REMOVE O QUE ESTAVA ESCRITO ANTES
    public static void limparTela() {
        // Codigo ANSI que limpa terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    /// METODO PARA FAZER PAUSA - ESPERA USER APERTAR ENTER
    public static void pausa() {
        System.out.print("\nPressione ENTER para continuar...");
        // Lê primeira linha vazia (do scanner anterior)
        scanner.nextLine();
        // Lê a linha que user aperta ENTER
        scanner.nextLine();
    }
    
    /// TELA 1: RETIRAR MEDICAMENTO - SUBMENU PARA RETIRADA
    public static void telaRetirar() {
        // Limpa tela antes de mostrar
        limparTela();
        // Mostra titulo da tela
        System.out.println("=== RETIRAR MEDICAMENTO ===");
        // Mostra nome do medicamento usando getter
        System.out.println("Medicamento: " + medicamento.getNome());
        // Mostra quanto tem agora usando getter
        System.out.println("Estoque atual: " + medicamento.getQuantidadeEstoque());
        // Pede ao user quanto quer retirar
        System.out.print("\nQuantos medicamentos retirar? ");
        
        // Lê a quantidade digitada
        int quantidade = scanner.nextInt();
        // Chama metodo de retirada da classe Medicamento
        medicamento.retirarMedicamento(quantidade);
        
        // Pausa para user ver o resultado
        pausa();
    }
    
    /// TELA 2: REPOR MEDICAMENTO - SUBMENU PARA REPOSICAO
    public static void telaRepor() {
        // Limpa tela antes de mostrar
        limparTela();
        // Mostra titulo da tela
        System.out.println("=== REPOR MEDICAMENTO ===");
        // Mostra nome do medicamento usando getter
        System.out.println("Medicamento: " + medicamento.getNome());
        // Mostra quanto tem agora usando getter
        System.out.println("Estoque atual: " + medicamento.getQuantidadeEstoque());
        // Pede ao user quanto quer repor
        System.out.print("\nQuantos medicamentos repor? ");
        
        // Lê a quantidade digitada
        int quantidade = scanner.nextInt();
        // Chama metodo de reposicao da classe Medicamento
        medicamento.reporMedicamento(quantidade);
        
        // Pausa para user ver o resultado
        pausa();
    }
    
    /// TELA 3: VERIFICAR ESTOQUE - SUBMENU PARA VER STATUS DO ESTOQUE
    public static void telaVerificar() {
        // Limpa tela antes de mostrar
        limparTela();
        // Mostra titulo da tela
        System.out.println("=== VERIFICAR ESTOQUE ===");
        // Mostra nome do medicamento usando getter
        System.out.println("Medicamento: " + medicamento.getNome());
        // Mostra quantidade atual usando getter
        System.out.println("Estoque: " + medicamento.getQuantidadeEstoque());
        // Mostra quantidade minima usando getter
        System.out.println("Mínimo: " + medicamento.getQuantidadeMinima());
        // Mostra o status (adequado ou baixo)
        System.out.print("Status: ");
        medicamento.verificarEstoque();
        
        // Pausa para user ver o resultado
        pausa();
    }
    
    /// METODO PRINCIPAL DO MENU - LOOP WHILE QUE FICA PEDINDO OPCAO ATÉ USER SAIR
    public static void menuPrincipal() {
        // Variavel para guardar a opcao escolhida
        int opcao = 0;
        
        // Loop - continua enquanto opcao nao for 4 (sair)
        while (opcao != 4) {
            // Limpa tela no inicio de cada loop
            limparTela();
            
            // Mostra titulo visual do menu
            System.out.println("╔════════════════════════════╗");
            System.out.println("║   CONTROLE DE MEDICAMENTOS  ║");
            System.out.println("╚════════════════════════════╝");
            // Mostra as opcoes disponiveis
            System.out.println("1 - Retirar medicamento");
            System.out.println("2 - Repor medicamento");
            System.out.println("3 - Verificar estoque");
            System.out.println("4 - Sair");
            // Pede ao user para escolher
            System.out.print("\nEscolha uma opção: ");
            
            // Lê a opcao digitada
            opcao = scanner.nextInt();
            
            // Switch - verifica qual opcao foi escolhida
            switch (opcao) {
                // Opcao 1: chama metodo de retirada
                case 1:
                    telaRetirar();
                    break;
                
                // Opcao 2: chama metodo de reposicao
                case 2:
                    telaRepor();
                    break;
                
                // Opcao 3: chama metodo de verificacao
                case 3:
                    telaVerificar();
                    break;
                
                // Opcao 4: sai do loop (encerra programa)
                case 4:
                    limparTela();
                    System.out.println("Saindo do sistema...");
                    break;
                
                // Qualquer outra opcao nao valida
                default:
                    limparTela();
                    System.out.println("❌ Opção inválida!");
                    pausa();
            }
        }
        
        // Fecha o scanner quando programa termina
        scanner.close();
    }
    
    /// METODO MAIN - ONDE O PROGRAMA COMECA
    public static void main(String[] args) {
        // Chama o metodo menuPrincipal para iniciar o programa
        menuPrincipal();
    }
}