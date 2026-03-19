import java.util.Scanner;
public class Ex8{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Double pe;
        Double alt;
        Double imc;

        System.out.println("informe seu peso: ");
        pe = scanner.nextDouble();
        System.out.println("informe sua altura: ");
        alt = scanner.nextDouble();
        imc = pe/(alt*alt);

        String mimi = (imc < 18.5)? "está abaixo do peso" : (18.5 <= imc && imc < 25)? "está com o peso normal" : (25 <= imc && imc < 30)? "está com subrepeso" : " esta obeso";

        System.out.println("seu imc é de " +imc+ ", você " +mimi);
    }
}