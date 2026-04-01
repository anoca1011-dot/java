import java.util.Scanner;
public class Ex14{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("informe um numero: ");
        n1 = scanner.nextInt();
        System.out.println("informe outro numero: ");
        n2 = scanner.nextInt();
        System.out.println("informe mais um numero: ");
        n3 = scanner.nextInt();

        if(n1>n2 && n2>n3){
            System.out.println("o " +n1+ " é maior");
        }else if(n1==n2 && n2>n3){
            System.out.println("o " +n1+ "," +n2+ " estao empatados");
        }else if(n1==n3 && n3>n2){
            System.out.println("o " +n1+ "," +n3+ " estao empatados");
        }else if(n2>n1 && n2>n3){
            System.out.println("o " +n2+ " é maior");
        }else if(n2==n3 && n3>n1){
            System.out.println("o " +n2+ "," +n3+ " estao empatados");
        }else if(n3>n1 && n3>n2){
            System.out.println("o " +n3+ " é maior");
        }else{
            System.out.println("todos estao empatados");
        }
    }
}