package POOAula03;

public class Aula03 {

    public static void main(String[] args) {

        CanetaAula03 c1 = new CanetaAula03();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();

    }
}
