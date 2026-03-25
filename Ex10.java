import java.util.Scanner;
public class Ex10{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double num;

        System.out.println("informe um numero: ");
        num = scanner.nextDouble();

        String reo = (num < 0 )? "seu numero é negativo" : (num == 0 )? "seu numero é nulo (0)" : "seu numero é positivo";
        System.out.println ("" +reo);
    }
}