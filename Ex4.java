import java.util.Scanner;
public class Ex4{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Double cel;
        System.out.println("informe a temperatura; ");
        cel = scanner.nextDouble();

        String temp = (cel < 15 )? "esta frio" : (cel >= 15 && cel < 25)? "esta agradavel" : "esta quente";

        System.out.println("o tempo " +temp);
    }
}