package POOAula04;

public class Aula04 {
    public static void main(String[] args) {
        CanetaAula04 c1 = new CanetaAula04("bic", "Azul", 0.5f);
        c1.status();

        /*
        //c1.modelo = "bic"; // atributo está private, nao é possivel acessar diretamente. usar setModelo()
        c1.setModelo("bic");
        //c1.ponta = 0.5f; // atributo está private, nao é possivel acessar diretamente. usar setPonta() para ter acesso
        c1.setPonta(0.5f);

        // para visualizar com getters
        System.out.println("Com métodos getters:");
        System.out.println(c1.getModelo());
        System.out.println(c1.getPonta());

        // usando metodo status para visualisar
        System.out.println("\nCom método status:");
        c1.status();
         */

    }
}
