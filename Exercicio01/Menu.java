import java.util.ArrayList;
import java.util.Scanner;

//autor: Andreas Matheus Santos - RA: 235006

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        
        do{
            System.out.println("Menu");
            System.out.println("-------------");
            System.out.println("1 - Inserir Funcionários");
            System.out.println("2 - Exibir Funcionários");
            System.out.println("3 - Sair");
            escolha = Integer.parseInt(teclado.nextLine());

            switch(escolha){
                case 1:
                    int tipoFuncionario;
                    do{
                        System.out.println("O funcionário é Mensalista ou Horista?");
                        System.out.println("1 - Mensalista");
                        System.out.println("2 - Horista");
                        tipoFuncionario = Integer.parseInt(teclado.nextLine());

                        switch(tipoFuncionario){
                            case 1:
                                FuncionarioMensalista fm = new FuncionarioMensalista();

                                System.out.println("Número do crachá:");
                                fm.setNumeroCracha(Integer.parseInt(teclado.nextLine()));
                                System.out.println("Nome do funcionário:");
                                fm.setNome(teclado.nextLine());
                                System.out.println("Digite o Setor:");
                                fm.setSetor(teclado.nextLine());
                                System.out.println("Digite a função:");
                                fm.setFuncao(teclado.nextLine());
                                System.out.println("Digite o salário do funcionário:");
                                fm.setSalario(Double.parseDouble(teclado.nextLine()));

                                funcionarios.add(fm);
                                break;
                            case 2:
                                FuncionarioHorista fh = new FuncionarioHorista();

                                System.out.println("Número do crachá:");
                                fh.setNumeroCracha(Integer.parseInt(teclado.nextLine()));
                                System.out.println("Nome do funcionário:");
                                fh.setNome(teclado.nextLine());
                                System.out.println("Digite o Setor:");
                                fh.setSetor(teclado.nextLine());
                                System.out.println("Digite a função:");
                                fh.setFuncao(teclado.nextLine());
                                System.out.println("Digite a quantidade de horas trabalhadas:");
                                fh.setQtdeHoras(Integer.parseInt(teclado.nextLine()));
                                System.out.println("Digite o valor-hora:");
                                fh.setValorHora(Double.parseDouble(teclado.nextLine()));
                                
                                funcionarios.add(fh);
                                break;
                            default:
                                System.out.println("Tipo de funcionário inválido");
                                break;
                        }
                    }while(tipoFuncionario != 1 && tipoFuncionario != 2);

                    break;
                case 2:
                    for(Funcionario f : funcionarios){
                        System.out.println(f.imprimir());
                    }
                    break;
                case 3:
                    System.out.println("O programa será encerrado!");
                    break;
                default:
                    System.out.println("O número digitado não é válido!");
                    break;
            }
        }while(escolha != 3);
    }
}