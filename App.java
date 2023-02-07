public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new FuncionarioPadrao("joaquim", 5_000.33f);
        
        System.out.println("nome do funcionário: " + f.getNome());
        System.out.println("salário do funcionário: " + f.getSalario());

        Funcionario g = new FuncionarioComissionado("joaquim", 5_000.33f, 1_000.00f, 0.05f);
        
        System.out.println("nome do funcionário: " + g.getNome());
        System.out.println("salário do funcionário: " + g.getSalario());
        System.out.println("proventos: " + g.calculaProventos);
    }
}
