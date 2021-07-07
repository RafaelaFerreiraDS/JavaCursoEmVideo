package POOAula11;

public class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println(getNome() + " bolsa renovada");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista, pagamento ok.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
