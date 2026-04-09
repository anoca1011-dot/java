//ler a velocidade e o limite da via classificando:
//dentro do limite -- sem multa
//20 % acima do limite -- multa leve
//entre 20% e 50% acima do limite -- multa grave
// acima de 50% do limite -- multa gravissima + suspensão

import java.util.Scanner;
public class Ex19{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double liv;
        double veat;
        
        System.out.println("informe a velocidade atingida: ");
        veat = scanner.nextDouble();
        System.out.println("informe a velocidade limite da via: ");
        liv = scanner.nextDouble();

        double mul = veat * liv / 100;
        
        if(mul <= 0){
            System.out.println("vc ficou " +mul+ "% acima do limite");
            System.out.println("...sem multa...");
        }else if(mul<=20){
            System.out.println("vc ficou " +mul+ "% acima do limite");
            System.out.println("...multa leve...");
        }else if (mul>20 || mul<=50){
            System.out.println("vc ficou " +mul+ "% acima do limite");
            System.out.println("...multa grave...");
        }else{
            System.out.println("vc ficou " +mul+ "% acima do limite");
            System.out.println("...multa gravissima + suspensão...");
        }
    }
}