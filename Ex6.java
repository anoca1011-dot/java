import java.util.Scanner;
public class Ex6{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int an;

        System.out.println("informe o ano; ");
        an = scanner.nextInt();

        String resp = (an % 4 == 0)?" é bissexto":" não é bissexto";
        System.out.println("o ano" +resp);
    }
}