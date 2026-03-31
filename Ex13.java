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
            System.out.println("é janeiro-verao");
            break;
            case 2:
                System.out.println("é fevereiro-verão");
                break;
                case 3:
                    System.out.println("é março-outono");
                    break;
                    case 4:
                        System.out.println("é abril-outono");
                        break;
                        case 5:
                            System.out.println("é maio-outono");
                            break;
                            case 6:
                                System.out.println("é junho-inverno");
                                break;
                                case 7:
                                    System.out.println("é julho-inverno");
                                    break;
                                    case 8:
                                        System.out.println("é agosto-inverno");
                                        break;
                                        case 9:
                                            System.out.println("é setembro-primavera");
                                            break;
                                            case 10:
                                                System.out.println("é outubro-primavera");
                                                break;
                                                case 11:
                                                    System.out.println("é novembro-primavera");
                                                    break;
                                                    case 12:
                                                        System.out.println("é dezembro-verao");
                                                        break;
       }
      } 
    }
}