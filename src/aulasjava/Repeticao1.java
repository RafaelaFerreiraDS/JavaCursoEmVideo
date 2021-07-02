package aulasjava;

import java.util.Arrays;
import java.util.Scanner;

public class Repeticao1 {

    static int soma(int a, int b) {

        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int sm = soma(a,b);

        System.out.println("A soma vale" + sm);

    }

    public static void repeticoes() {
        int cc = 0;

        System.out.println("while");
        while (cc < 4) {
            if (cc == 5 || cc == 7) {
                break;
            }
            System.out.println(cc);
            cc++;
        }
        System.out.println("\ndo while");

        cc = 0;
        do {
            System.out.println(cc);
            cc++;
        } while (cc < 4);

        System.out.println("\nfor");

        cc = 0;

        for (cc = 0; cc <= 100; cc += 10) {
            System.out.println(cc);
        }
    }

    public static void aninhado() {

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println("i = " + i + "\n j = " + j);
            }
        }
    }

    public static void vetor() {

        int n[] = {4, 3, 2, 6, 8};

        for (int i = 0; i <= 5; i++) {
            System.out.println(n[i]);
        }

    }

    public static void forEach() {

        int num[] = new int[5];

        Arrays.fill(num, 8); //preenche os elementos do vetor

        System.out.println(num[0]);


        /*

        int num[] = {3, 5, 1, 8, 4};

        int pos = Arrays.binarySearch(num, 1);// encontra o valor na posicao do vetor
        System.out.println(pos);

         */
        /*
        Arrays.sort(num);

        for (int valor : num){
            System.out.println(valor);
        }
         */


    }

    public static void exercicio6() {
        Scanner entrada = new Scanner(System.in);

        int aux = 0;
        String resposta;

        System.out.println("----------- Jokempô -----------");
        System.out.println("Pedra ----------------------> 1");
        System.out.println("Papel ----------------------> 2");
        System.out.println("Tesoura --------------------> 3\n");

        System.out.print("Jogador 1  digite seu nome: ");
        String nome1 = entrada.next();

        System.out.print("Jogador 2  digite seu nome: ");
        String nome2 = entrada.next();

        do {
            System.out.print("\n" + nome1 + ", digite o valor correspondente à sua escolha: ");
            int j1 = entrada.nextInt();

            System.out.print(nome2 + ", digite o valor correspondente à sua escolha: ");
            int j2 = entrada.nextInt();

            if ((j1 < 1 || j1 > 3) && (j2 < 1 || j2 > 3)) {
                System.out.println("Os jogadores escolheram uma opção inválida");
                aux = 1;
            } else if ((j1 < 1 || j1 > 3)) {
                System.out.println("\n" + nome1 + " escolheu uma opção inválida. Jogo encerrado...");
                aux = 1;
            } else if (j2 < 1 || j2 > 3) {
                System.out.println("\n" + nome2 + " escolheu uma opção inválida. Jogo encessado...");
                aux = 1;
            }

            if (aux != 1) {
                if (j1 == j2) {
                    System.out.println("\nEmpatou! Ninguém ganhou.");
                } else if ((j1 - j2 == -2) || (j1 - j2 == 1)) {
                    System.out.println("\n" + nome1 + " ganhou!!!");
                } else {
                    System.out.println("\n" + nome2 + " ganhou!!!");
                }
            }
            System.out.print("Jogar outra vez? [s/n] ");
            resposta = entrada.next();
        } while (resposta.equals("s"));

        System.out.println("Jogo encerrado...");
    }


}
