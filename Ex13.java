import java.util.Scanner;
public class Ex13{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int sem;

       System.out.println("informe o mes que deseja (1-12)");
       sem = scanner.nextInt();
       
       if (sem != 1 && sem != 2 && sem != 3 && sem != 4 && sem != 5 && sem != 6 && sem != 7 && sem != 8 && sem != 9 && sem != 10 && sem != 11 && sem != 12){
        System.out.println("informe apenas entre 1 e 12, o mes informado é invalido ");
       }else{
       switch(sem){
        case 1:
            System.out.println("domingo");
            break;
            case 2:
                System.out.println("segunda-feira");
                break;
                case 3:
                    System.out.println("terça-feira");
                    break;
                    case 4:
                        System.out.println("quarta-feira");
                        break;
                        case 5:
                            System.out.println("quinta-feira");
                            break;
                            case 6:
                                System.out.println("sexta-feira");
                                break;
                                case 7:
                                    System.out.println("sabado");
                                    break;
       }
      } 
    }
}