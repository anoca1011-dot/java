import java.util.Scanner;
public class Ex7{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double li1;
        double li2;
        double li3;

        System.out.println("informe o tamanho da linha1; ");
        li1 = scanner.nextDouble();
         System.out.println("informe o tamanho da linha2; ");
        li2 = scanner.nextDouble();
         System.out.println("informe o tamanho da linha3; ");
        li3 = scanner.nextDouble();

        if (li1+li2 > li3 && li1+li3 > li2 && li2+li3 > li1){
            System.out.println("da para formar um triangulo.");
            if(li1 == li2 && li2 == li3){
                System.out.println("é um triangulo equilatero.");
            }else if(li1 == li2 || li1 == li3 || li2 == li3){
                System.out.println("é um triangulo isóceles.");
            }else{
                System.out.println("é um triangulo escaleno.");
            }
        }else{
            System.out.println("não é possivel fazer um triangulo.");
        }
    }
}