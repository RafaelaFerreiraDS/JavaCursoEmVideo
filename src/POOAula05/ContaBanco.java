package POOAula05;

public class ContaBanco {

    // atributos da conta bancaria
    public int numConta;
    protected String tipo; // poupança (cp) ou corrente (cc)
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() { //construtor
        this.setSaldo(0);
        this.setStatus(false);
    }

    //criar get e set para todos os atributos

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Titular: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if ((t.equals("CP"))) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (getSaldo() < 0) {
            System.out.println("Conta possui débito");
        } else {
            setStatus(false);
            System.out.println("Conta de " + this.getDono() + " encerrada");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (0 < valor && getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente na conta de " + this.getDono());
            }
        } else {
            System.out.println("Conta inexistente");
        }
    }

    public void pagarMensal() {
        float v = 0; //variavel local
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        }
    }
}
