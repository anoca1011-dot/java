import java.util.Scanner;
public class Ex3{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Double med;
        System.out.println("informe sua media; ");
        med = scanner.nextDouble();
        String var = (med >= 7)? "aprovado" : (med >=5 && med < 7)? "recuperação" : "reprovado";
        System.out.println("" +var);
    }
}