package Atividadesjava;

import java.util.*;

public class Ativiadade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario;
        double abono;



        System.out.println("Digete o salario:");
        salario = ler.nextDouble();
        System.out.println("Digite o Abono :");
        abono = ler.nextDouble();
        System.out.printf("Novo salrio é %.2f", Math.abs(salario+abono));
    }
}
