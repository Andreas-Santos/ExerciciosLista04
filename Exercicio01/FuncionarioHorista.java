public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista(){

    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao,
        int qtdeHoras, double valorHora){
        super.setNumeroCracha(numeroCracha);
        super.setNome(nome);
        super.setSetor(setor);
        super.setFuncao(funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String imprimir(){
        return "\nCrachá: " + super.getNumeroCracha() +
               "\nNome: " + super.getNome() +
               "\nSetor: " + super.getSetor() +
               "\nFunção: " + super.getFuncao() +
               "\nSalário(qtd Horas * Valor Hora): " + (qtdeHoras*valorHora +
               "\n");
    }
}
