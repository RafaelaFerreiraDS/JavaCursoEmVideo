package POOAula11;

public class Principal {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("juvenal");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setCurso("Engenharia");
        a1.setMatricula(1234);
        a1.setIdade(23);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Pedro");
        b1.setMatricula(7894);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Joao");
        t1.setIdade(18);
        t1.setCurso("Eletronica");
        t1.setRegistroProfissional(1547);

        Professor pf1 = new Professor();
        pf1.setNome("Isabel");
        pf1.setEspecialidade("Matematica");
        pf1.setSexo("F");
    }
}
