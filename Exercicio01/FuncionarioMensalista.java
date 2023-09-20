public class FuncionarioMensalista extends Funcionario {
    private double salario;

    public FuncionarioMensalista(){

    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setor,
        String funcao, double salario){
        super.setNumeroCracha(numeroCracha);
        super.setNome(nome);
        super.setSetor(setor);
        super.setFuncao(funcao);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String imprimir(){
        return "Crachá: " + super.getNumeroCracha() +
               "\nNome: " + super.getNome() +
               "\nSetor: " + super.getSetor() +
               "\nFunção: " + super.getFuncao() +
               "\nSalário: " + salario +
               "\n"; 
    }
}
