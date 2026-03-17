import java.util.Scanner;
public class Ex5{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double n1;
        double n2;
        int res;


       System.out.println("informe o numero1; ");
       n1 = scanner.nextDouble();
       System.out.println("informe o numero2; ");
       n2 = scanner.nextDouble();

       System.out.println("1 soma");
       System.out.println("2 subtração");
       System.out.println("3 multiplicação");
       System.out.println("4 divisão");
       res = scanner.nextInt();

       switch(res){
        case 1:
            System.out.println(n1 + n2);
            break;
            case 2:
                System.out.println(n1 - n2);
                break;
                case 3:
                    System.out.println(n1 * n2);
                    break;
                    case 4:
                        System.out.println(n1 / n2);
                        break;
       }
    }
}