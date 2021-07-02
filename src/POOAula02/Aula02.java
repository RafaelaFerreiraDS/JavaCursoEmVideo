package POOAula02;

public class Aula02 {

    public static void main(String[] args) {

        CanetaAula02 c1 = new CanetaAula02();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        System.out.println("\n2° exemplo");
        CanetaAula02 c2 = new CanetaAula02();
        c2.modelo = "BIC";
        c2.cor = "vermelha";
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
