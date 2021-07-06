package POOAula09;

public class ProjetoLivro {
    public static void main(String[] args) {

        // instanciamento dos objetos pessoa e livro para verificacao dos métodos impementados em livro

        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Rafaela", 26, "F");
        p[1] = new Pessoa("Mario", 57, "M");

        l[0] = new Livro("Java", "Joao Silva", 250, p[1]);
        l[1] = new Livro("POO", "Carlos Alberto", 300, p[0]);
        l[2] = new Livro("Python", "Maria Almeida", 335, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

    }
}
