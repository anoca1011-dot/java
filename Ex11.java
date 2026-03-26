 import java.util.Scanner;
public class Ex11{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int id;

        System.out.println("informe sua idade e consulte o valor da entrada ao cinema: ");
        id = scanner.nextInt();

        String val = (id < 12)? "10,00" : (id > 12 && id < 60 )? "20,00" : "10,00";

        System.out.println("voce ira pagar $" +val);
    }
}