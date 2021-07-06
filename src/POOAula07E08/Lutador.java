package POOAula07E08;


public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Não pode lutar";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Não pode lutar";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public void apresentar() {
        System.out.println("Apresentamos o lutador " + getNome());
        System.out.println("Vindo de : " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos");
        System.out.println("e " + getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "kg");
        System.out.println("Com " + getVitorias() + " vitórias");
        System.out.println(getEmpates() + " empates");
        System.out.println("E " + getDerrotas() + " derrotas");
    }

    public void status() {
        System.out.println("-------------------------------");
        System.out.println(getNome());
        System.out.println("Peso " + getCategoria());
        System.out.println("Com " + getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println("e " + getEmpates() + " empates");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
