import java.util.Scanner;
public class Ex18{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int nu;

        System.out.println("informe um numero de 1-10 para descobrir o equivalente em algarismo romano: ");
        nu = scanner.nextInt();

        if (nu <1 || nu >10){
            System.out.println("informe um numero valido(1-10)");
        }else{
            switch (nu){
               case 1:
                System.out.println("I"); 
                break;
                case 2:
                    System.out.println("II");
                    break;
                    case 3:
                        System.out.println("III");
                        break;
                        case 4:
                            System.out.println("IV");
                            break;
                            case 5:
                                System.out.println("V");
                                break;
                                case 6:
                                    System.out.println("VI");
                                    break;
                                    case 7:
                                        System.out.println("VII");
                                        break;
                                        case 8:
                                            System.out.println("VIII");
                                            break;
                                            case 9:
                                                System.out.println("IX");
                                                break;
                                                case 10:
                                                    System.out.println("X");
                                                    break;
            }
        }
    }
}