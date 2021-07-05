package POOAula04;

public class CanetaAula04 {

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public CanetaAula04(String m, String c, float p) { //metodo contrutor
        // testes iniciais
        // this.tampar();
        // this.cor = "Azul";

        setModelo(m);
        setCor(c);
        setPonta(p);
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Informações da caneta:");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }


}
