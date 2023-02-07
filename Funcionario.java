public abstract class Funcionario {
    String nome;
    float salario;
    public String calculaProventos;

    public Funcionario (String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract float calculaProventos();

    public String getNome(){
        return this.nome;
    }

    public float getSalario(){
        return this.salario;
    }

    
}
