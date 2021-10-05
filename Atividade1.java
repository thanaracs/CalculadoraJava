package capitulo4;

import java.util.Scanner;

public class Atividade1 {
    //Calculadora
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double numero1 = ler.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double numero2 = ler.nextDouble();
        System.out.println("[1]-Adicao\n[2]-Subtracao\n[3]-Multiplicacao\n[4]Divisao\nInforme o tipo da operacao: ");
        int operacao = ler.nextInt();


        if (operacao > 0 && operacao <5) {
            double resultado;
            while (operacao == 1){
                resultado = numero1 + numero2;
                System.out.println("resultado: " + resultado);
                break;
            } while (operacao == 2){
                resultado = numero1 - numero2;
                System.out.println("resultado: " + resultado);
                break;
            } while (operacao == 3){
                resultado = numero1 * numero2;
                System.out.println("resultado: " + resultado);
                break;
            } while (operacao == 4){
                resultado = numero1 / numero2;
                System.out.println("resultado: " + resultado);
                break;
            }

        }
    }
}
