package POOAula11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(){
        System.out.println("Receber aumento");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
