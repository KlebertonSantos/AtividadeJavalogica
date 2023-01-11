package AtividadeJava2LacosRepeicao;

import java.util.Scanner;

public class Atividade3LacosRepeticao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = ler.nextInt();

        if (num % 2 == 0) {
            System.out.println(" O numero: " + num + " è Par e positivo\n");

        } else if (num % 2 >= 0) {
            System.out.println(" O numero: " + num + " è impar e positivo\n");

        } else {
            System.out.println("O numero: " + num + " è impar e negativo\n");
        }
    }
}
