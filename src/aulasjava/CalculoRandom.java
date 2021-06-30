package aulasjava;

import java.util.Scanner;

public class CalculoRandom {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Adivinhe o número entre 1 e 10: ");
        int num = entrada.nextInt();

        // gerar numero aleatorio
        double aleatorio = Math.random();

        int aux = (int) (1 + aleatorio * (10 - 1));

        String teste = (aux == num) ? "Acertou! O número certo é "+ aux : "Errou! O numero certo é " + aux;

        System.out.println(teste);
        entrada.close();
    }
}