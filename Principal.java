import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);
    static Medicamento medicamento = new Medicamento("Dipirona", 100, 20);
    
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void pausa() {
        System.out.print("\nPressione ENTER para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    // SUBMENU 1: Retirar Medicamento
    public static void telaRetirar() {
        limparTela();
        System.out.println("=== RETIRAR MEDICAMENTO ===");
        System.out.println("Medicamento: " + medicamento.getNome());
        System.out.println("Estoque atual: " + medicamento.getQuantidadeEstoque());
        System.out.print("\nQuantos medicamentos retirar? ");
        
        int quantidade = scanner.nextInt();
        medicamento.retirarMedicamento(quantidade);
        
        pausa();
    }
    
    // SUBMENU 2: Repor Medicamento
    public static void telaRepor() {
        limparTela();
        System.out.println("=== REPOR MEDICAMENTO ===");
        System.out.println("Medicamento: " + medicamento.getNome());
        System.out.println("Estoque atual: " + medicamento.getQuantidadeEstoque());
        System.out.print("\nQuantos medicamentos repor? ");
        
        int quantidade = scanner.nextInt();
        medicamento.reporMedicamento(quantidade);
        
        pausa();
    }
    
    // SUBMENU 3: Verificar Estoque
    public static void telaVerificar() {
        limparTela();
        System.out.println("=== VERIFICAR ESTOQUE ===");
        System.out.println("Medicamento: " + medicamento.getNome());
        System.out.println("Estoque: " + medicamento.getQuantidadeEstoque());
        System.out.println("Mínimo: " + medicamento.getQuantidadeMinima());
        System.out.print("Status: ");
        medicamento.verificarEstoque();
        
        pausa();
    }
    
    // MENU PRINCIPAL
    public static void menuPrincipal() {
        int opcao = 0;
        
        while (opcao != 4) {
            limparTela();
            
            System.out.println("╔════════════════════════════╗");
            System.out.println("║   CONTROLE DE MEDICAMENTOS  ║");
            System.out.println("╚════════════════════════════╝");
            System.out.println("1 - Retirar medicamento");
            System.out.println("2 - Repor medicamento");
            System.out.println("3 - Verificar estoque");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    telaRetirar();
                    break;
                    
                case 2:
                    telaRepor();
                    break;
                    
                case 3:
                    telaVerificar();
                    break;
                    
                case 4:
                    limparTela();
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    limparTela();
                    System.out.println("❌ Opção inválida!");
                    pausa();
            }
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        menuPrincipal();
    }
}