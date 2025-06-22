import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🐾 Bem-vindo ao Simulador de Animal de Estimação Virtual!");
        System.out.print("Digite o nome do seu animal de estimação: ");
        String nomePet = scanner.nextLine();

        VirtualPet pet = new VirtualPet(nomePet);

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. 🍖 Alimentar " + nomePet);
            System.out.println("2. 🎾 Brincar com " + nomePet);
            System.out.println("3. 😴 Descansar");
            System.out.println("4. 🚻 Ir ao banheiro");
            System.out.println("5. 🛁 Dar banho");
            System.out.println("6. 🔍 Verificar o status de " + nomePet);
            System.out.println("7. 🚪 Sair do jogo");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    pet.alimentar();
                    break;
                case 2:
                    pet.brincar();
                    pet.cansar();
                    break;
                case 3:
                    System.out.print("Por quantas horas " + nomePet + " irá descansar? ");
                    int horas = scanner.nextInt();
                    pet.descansar(horas);
                    break;
                case 4:
                    pet.irAoBanheiro();
                    break;
                case 5:
                    pet.darBanho();
                    break;
                case 6:
                    pet.verificarStatus();
                    break;
                case 7:
                    System.out.println("Saindo do Simulador. Até logo! 👋");
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

            if (pet.verificarSePerdeu()) {
                System.out.println("❌ Fim de jogo.");
                break;
            }

            pet.passarTempo();
            pet.idade();
        }
    }
}
