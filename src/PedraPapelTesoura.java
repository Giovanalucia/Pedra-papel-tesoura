import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args){
        int Jogador,Computador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pedra Papel Tesoura!");
        System.out.println("");

        System.out.print("Digite um número: 1 - Pedra, 2 - Papel e 3 - Tesoura!");
        Jogador = teclado.nextInt();
        System.out.println("");
        switch (Jogador) {
            case 1:
                System.out.println("Jogador escolheu PEDRA!");
                break;
            case 2:
                System.out.println("Jogador escolheu PAPEL!");
                break;
            case 3:
                System.out.println("Jogador escolheu TESOURA!");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
        Computador = (int)(Math.random()*3 + 1);

        teclado.close();
        switch (Computador) {
            case 1:
                System.out.println("Computador escolheu PEDRA!");
                break;
            case 2:
                System.out.println("Computador escolheru PAPEL!");
                break;
            case 3:
                System.out.println("Computador escolheu TESOURA!");
                break;
        }
        System.out.println("");
        if (Jogador == Computador) {
            System.out.println("EMPATE!");
        } else {
            if ((Jogador == 1 && Computador == 3) || (Jogador == 2 && Computador == 1) || (Jogador == 3 && Computador == 2)) {
                System.out.println("Jogador venceu! ^^");
            }  else {
                System.out.println("Computador venceu! ,_,");
                System.out.println("");


            }
            System.out.println("Obrigado por jogar Pedra, Papel e Tesoura!");
        }

    }
}
