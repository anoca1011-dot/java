import java.util.Scanner;
public class Ex15{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String seF = "12345";
        String usF = "adm";

        System.out.println("informe o usuario: ");
        String us = scanner.nextLine();
        System.out.println("informe  a senha: ");
        String se = scanner.nextLine();

        String inf = (usF.equals(us) && seF.equals(se))? "acesso permitido" : "acesso negado";

        System.out.println("" +inf);
    }
}