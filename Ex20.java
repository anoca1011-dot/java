import java.util.Scanner;
public class Ex20{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String j1;
        String j2;

        System.out.println("pedra, papel, tesoura");
        System.out.println("1-pedra");
        System.out.println("2-papel");
        System.out.println("3-tesoura");

        System.out.println("jogador 1, escolha uma das opções: ");
        j1 = scanner.nextLine();
        System.out.println("jogador 2, excolha uma das opções: ");
        j2 = scanner.nextLine();

        String ven = (j1.equals (j2))? "empate" : (j1.equals("1") && j2.equals("2"))? "jogador2 ganhou": "piti";

        System.out.println("" +ven);
    }
}