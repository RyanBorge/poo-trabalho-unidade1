import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Medicamento medicamento = new Medicamento("Dipirona", 100, 20);
        
        int opcao = 0;
        
        while (opcao != 4) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Retirar medicamento");
            System.out.println("2 - Repor medicamento");
            System.out.println("3 - Verificar estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Quantos medicamentos retirar? ");
                    int qtdRetirar = scanner.nextInt();
                    medicamento.retirarMedicamento(qtdRetirar);
                    break;
                    
                case 2:
                    System.out.print("Quantos medicamentos repor? ");
                    int qtdRepor = scanner.nextInt();
                    medicamento.reporMedicamento(qtdRepor);
                    break;
                    
                case 3:
                    System.out.println("Medicamento: " + medicamento.getNome());
                    System.out.println("Estoque: " + medicamento.getQuantidadeEstoque());
                    System.out.println("Mínimo: " + medicamento.getQuantidadeMinima());
                    medicamento.verificarEstoque();
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
}