import java.util.Scanner;
public class Ex17{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double val;
        double vad = 0;
        double valf = 0;

        System.out.println("informe o valor para darmos desconto; ");
        val = scanner.nextDouble();

        if (val > 500){
            vad = val * 20 / 100;
            valf = val - vad;
            System.out.println("o desconto é de 20%, valor final $" +valf);
        }else if (val > 200 && val <= 500){
            vad = val * 10 / 100;
            valf = val - vad;
            System.out.println("o desconto é de 10%, valor final $" +valf);
        }else{
            System.out.println("o desconto é inesistente, valor final $" +val);
        }
    }
}