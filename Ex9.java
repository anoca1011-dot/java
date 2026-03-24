import java.util.Scanner;
public class Ex9{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int sem;

       System.out.println("escolha um dia da semana");
       System.out.println("1");
       System.out.println("2");
       System.out.println("3");
       System.out.println("4");
       System.out.println("5");
       System.out.println("6");
       System.out.println("7");
       sem = scanner.nextInt();
       
       if (sem != 1 && sem != 2 && sem != 3 && sem != 4 && sem != 5 && sem != 6 && sem != 7){
        System.out.println("dia invalido");
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