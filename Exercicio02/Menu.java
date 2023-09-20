package Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

//autor: Andreas Matheus Santos - RA: 235006

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();

        do{
            System.out.println("Menu");
            System.out.println("--------------");
            System.out.println("1 - Inserir Imóvel");
            System.out.println("2 - Exibir Imóveis");
            System.out.println("3 - Sair");
            escolha = Integer.parseInt(teclado.nextLine());

            switch(escolha){
                case 1:
                    int tipoImovel;

                    do{
                        System.out.println("O imóvel é novo ou velho?");
                        System.out.println("1 - Novo");
                        System.out.println("2 - Velho");
                        tipoImovel = Integer.parseInt(teclado.nextLine());

                        switch(tipoImovel){
                            case 1:
                                ImovelNovo in = new ImovelNovo();

                                System.out.println("Digite o código do imóvel:");
                                in.setCodigo(Integer.parseInt(teclado.nextLine()));
                                System.out.println("Digite o endereco do imóvel:");
                                in.setEndereco(teclado.nextLine());
                                System.out.println("Digite o valor do imóvel:");
                                in.setValor(Double.parseDouble(teclado.nextLine()));
                                System.out.println("Digite o valor adicional do imóvel:");
                                in.setValorAdicional(Double.parseDouble(teclado.nextLine()));

                                imoveis.add(in);
                                break;
                            case 2:
                                ImovelVelho iv = new ImovelVelho();

                                System.out.println("Digite o código do imóvel:");
                                iv.setCodigo(Integer.parseInt(teclado.nextLine()));
                                System.out.println("Digite o endereco do imóvel:");
                                iv.setEndereco(teclado.nextLine());
                                System.out.println("Digite o valor do imóvel:");
                                iv.setValor(Double.parseDouble(teclado.nextLine()));
                                System.out.println("Digite o valor de Desconto do imóvel:");
                                iv.setValorDesconto(Double.parseDouble(teclado.nextLine()));

                                imoveis.add(iv);
                                break;
                            default:
                                System.out.println("O tipo de imóvel não é válido");
                                break;
                        }

                    }while(tipoImovel != 1 && tipoImovel != 2);

                    break;
                case 2:
                    for(Imovel i : imoveis) {
                        System.out.println(i.imprimir());
                    }
                    break;
                case 3:
                    System.out.println("O programa será encerrado!");
                    break;
                default:
                    System.out.println("O número digitado não é válido");
                    break;
            }
        }while(escolha != 3);
    }
}