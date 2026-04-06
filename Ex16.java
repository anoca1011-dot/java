import java.util.Scanner;
public class Ex16{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int nn;

        System.out.println("informe um numero e veja se é multiplo de 3 e 5");
        System.out.println("informe seu numero: ");
        nn = scanner.nextInt();

        if (nn%5 == 0 && nn%3 == 0){
            System.out.println("seu numero é multiplo de 3 e 5.");
        }else if(nn%5 == 0 && nn%3 != 0){
            System.out.println("seu numero é multiplo de 5.");
        }else if(nn%5 != 0 && nn%3 == 0){
            System.out.println("seu numero é multiplo de 3.");
        }else{
            System.out.println("seu numero n é multiplo nem de 3 nem de 5.");
        }
    }
}