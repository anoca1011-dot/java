import java.util.Scanner;
public class Ex2{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        Double n1;
        Double n2;
        System.out.println("informe o primeiro numero; ");
        n1 = scanner.nextDouble(); 
        System.out.println("informe o segundo numero; ");
        n2 = scanner.nextDouble();  

        Double mame = (n1 > n2)? n1 : n2;
        System.out.println("o maior numero é " +mame);    
    }
}