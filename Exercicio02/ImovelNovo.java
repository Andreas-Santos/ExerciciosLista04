package Exercicio02;

public class ImovelNovo extends Imovel {
    private double valorAdicional;

    public ImovelNovo() {

    }

    public ImovelNovo(int codigo, String endereco, double valor, double valorAdicional) {
        super.setCodigo(codigo);
        super.setEndereco(endereco);
        super.setValor(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double calcularValorImovel() {
        return super.getValor() + valorAdicional;
    }

    @Override
    public String imprimir() {
        return "\nCódigo: " + super.getCodigo() +
               "\nEndereço: " + super.getEndereco() +
               "\nValor Original: " + super.getValor() +
               "\nAdicional: " + valorAdicional +
               "\nValor com adicional: " + calcularValorImovel();
    }
}
