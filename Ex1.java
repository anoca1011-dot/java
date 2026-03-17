import java.util.Scanner;
public class Ex1{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int n;
        System.out.println("informe um numero; ");
        n = scanner.nextInt();
        String result = (n % 2 == 0)? "par" : "impar";
        System.out.println("o numero é " +result);
    }
}