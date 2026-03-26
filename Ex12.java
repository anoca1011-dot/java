import java.util.Scanner;
public class Ex12{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double not;

        System.out.println("informe uma nota: " );
        not = scanner.nextDouble();

       String con = (not > -0.9 && not < 5)? "sua nota sera D" : (not > 4 && not < 7)? "sua nota sera C" : (not > 6 && not < 9)? "sua nota sera B" : (not > 8 && not < 10.1)? "sua nota sera A" : "informe uma nota valida";

       System.out.println("" +con);
    }
}