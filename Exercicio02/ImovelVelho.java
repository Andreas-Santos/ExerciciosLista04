package Exercicio02;

public class ImovelVelho extends Imovel {
    private double valorDesconto;

    public ImovelVelho() {

    }

    public ImovelVelho(int codigo, String endereco, double valor, double valorDesconto) {
        super.setCodigo(codigo);
        super.setEndereco(endereco);
        super.setValor(valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calcularValorImovel() {
        return super.getValor() - valorDesconto;
    }

    @Override
    public String imprimir() {
        return "\nCódigo: " + super.getCodigo() +
               "\nEndereço: " + super.getEndereco() +
               "\nValor Original: " + super.getValor() +
               "\nDesconto: " + valorDesconto +
               "\nValor com desconto: " + calcularValorImovel();
    }
}
