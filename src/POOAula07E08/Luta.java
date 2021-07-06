package POOAula07E08;

import java.util.Random;

public class Luta {
    private Lutador desafiado; // relacao com a classe lutador, utilizando o objeto gerado
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (getAprovada()) {
            System.out.println("----------- Desafiado -----------");
            desafiado.apresentar();
            System.out.println("----------- Desafiante -----------");
            desafiante.apresentar();

            double ale = Math.random();
            int vencedor = (int) (0 + ale * (2 - 0));

            /*
            Random ale = new Random();
            int vencedor = ale.nextInt(3);
             */

            System.out.println("------ Resultado da Luta ------");

            switch (vencedor) {
                case 0:
                    System.out.println("Luta empatada");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " ganhou a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " ganhou a luta!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

            System.out.println("-------------------------------");
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
