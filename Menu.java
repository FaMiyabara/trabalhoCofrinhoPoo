package trabalho;

import java.util.Scanner;

public class Menu {

    private Scanner teclado;
    private Cofrinho cofrinho;

    public Menu(){
        teclado = new Scanner(System.in);
        cofrinho = new Cofrinho();

    }

    public void exibirMenu() {

        System.out.println("*🐷💰---------Menu Principal--------💰🐷*");
        System.out.println("| 1 - Adicionar Moeda                    |");
        System.out.println("| 2 - Remover Moeda                      |");
        System.out.println("| 3 - Listar  Moedas                     |");
        System.out.println("| 4 - Calcular Total Conevertido para R$ |");
        System.out.println("| 0 - Encerrar                           |");
        System.out.println("*----------------------------------------*");
        System.out.println();
        System.out.println("Selecione a função desejada: ");
        String opcao = teclado.next();

        switch (opcao){
            case "0":
                System.out.println("Opção selecionada: " + opcao + " - Sistema Finalizado");
                break;
         
            case "1":
            	System.out.println("Opção selecionada: " + opcao + " - Adicionar Moeda");
                menuAdicionarMoedas();//chama o menu de adição de moedas
                exibirMenu();
                break;
                
            case "2":
            	menuRemoverMoedas();//chama o Menu de remoção de moedas
            	exibirMenu();
            	break;
            	
            case "3":
            	System.out.println("Opção selecionada: 3 - Listar Moedas");
            	System.out.println();
            	cofrinho.listarMoedas();
            	exibirMenu();
            	break;
            	
            case "4":
            	System.out.println("Opção selecionada: 4 - Calcular o total do cofrinho em reais");
            	double valorTotalConvertido = cofrinho.totalConvertido();
            	System.out.printf("O valor total das moedas do cofrinho convertidas em real é: R$%.2f",valorTotalConvertido);
            	System.out.println();
            	exibirMenu();
            	break;
            	
            default:
                System.out.println("Opção inválida");
                System.out.println();
                exibirMenu();
                break;

            }
        }
    private void menuAdicionarMoedas() {
    //menu de tipos de moedas
        System.out.println();
        System.out.println("*---Menu Moedas---*");
        System.out.println("| 1 - Real        |");
        System.out.println("| 2 - Dólar       |");
        System.out.println("| 3 - Euro        |");
        System.out.println("*-----------------*");
        int tipoMoeda = teclado.nextInt();
        String valorMoeda;
        if (tipoMoeda == 1) {
        	System.out.println("Opção Selecionada: "+ tipoMoeda + " - Real");
        	System.out.println();
        	System.out.println("Digite o valor: ");
        	valorMoeda = teclado.next();
        	valorMoeda = valorMoeda.replace(",",".");
        	double valorMoedaInt = Double.valueOf(valorMoeda);
        	System.out.println();
        	System.out.printf("Valor inserido: R$%.2f", valorMoedaInt);
        	Real moeda = new Real(valorMoedaInt);
        	cofrinho.adicionarMoedas(moeda);

        }
        else if(tipoMoeda == 2){
        	System.out.println("Opção Selecionada: "+ tipoMoeda + " - Dólar");
        	System.out.println();
        	System.out.println("Digite o valor: ");
        	valorMoeda = teclado.next();
        	valorMoeda = valorMoeda.replace(",",".");
        	double valorMoedaInt = Double.valueOf(valorMoeda);
        	System.out.println();
        	System.out.printf("Valor inserido: $%.2f", valorMoedaInt);
        	Dolar moeda = new Dolar(valorMoedaInt);
        	cofrinho.adicionarMoedas(moeda);
        }
        else if(tipoMoeda == 3) {
        	System.out.println("Opção Selecionada: "+ tipoMoeda + " - Euro");
        	System.out.println();
        	System.out.println("Digite o valor: ");
        	valorMoeda = teclado.next();
        	valorMoeda = valorMoeda.replace(",",".");
        	double valorMoedaInt = Double.valueOf(valorMoeda);
        	System.out.println();
        	System.out.printf("Valor inserido: €%.2f", valorMoedaInt);
        	Euro moeda = new Euro(valorMoedaInt);
        	cofrinho.adicionarMoedas(moeda);
        }
        else {
        	System.out.println("Opção inválida ");
        	System.out.println();
        }
        System.out.println();
    }
    private void menuRemoverMoedas() {
    	System.out.println("Selecione a moeda que você deseja remover");
    	System.out.println("As moedas disponíveis no seu cofrinho são:");
    	
    	if (cofrinho.vazia()) {
    		System.out.println("Não existem moedas no cofrinho");
    		return;
    	}
    	else {
    		cofrinho.listarMoedas();
    	}
    	System.out.println("______________");
    	System.out.println();
        System.out.println("*---Menu Moedas---*");
        System.out.println("| 1 - Real        |");
        System.out.println("| 2 - Dólar       |");
        System.out.println("| 3 - Euro        |");
        System.out.println("*-----------------*");
        int tipoMoeda = teclado.nextInt();
        String valorMoeda;
        if (tipoMoeda == 1) {
        	System.out.println("Opção Selecionada: "+ tipoMoeda + " - Real");
        	System.out.println();
        	System.out.println("Digite o valor à remover: ");
        	valorMoeda = teclado.next();
        	valorMoeda = valorMoeda.replace(",",".");
        	double valorMoedaInt = Double.valueOf(valorMoeda);
        	System.out.println();
        	//System.out.printf("Valor retirado: R$%.2f", valorMoedaInt);
        	Real moeda = new Real(valorMoedaInt);
        	
        	cofrinho.removerMoedas(moeda);

        }
        else if(tipoMoeda == 2){
        	System.out.println("Opção Selecionada: "+ tipoMoeda + " - Dólar");
        	System.out.println();
        	System.out.println("Digite o valor à remover: ");
        	valorMoeda = teclado.next();
        	valorMoeda = valorMoeda.replace(",",".");
        	double valorMoedaInt = Double.valueOf(valorMoeda);
        	System.out.println();
//        	System.out.printf("Valor retirado: $%.2f", valorMoedaInt);
        	Dolar moeda = new Dolar(valorMoedaInt);
        	cofrinho.removerMoedas(moeda);
        }
        else if(tipoMoeda == 3) {
        	System.out.println("Opção Selecionada: "+ tipoMoeda + " - Euro");
        	System.out.println();
        	System.out.println("Digite o valor à remover: ");
        	valorMoeda = teclado.next();
        	valorMoeda = valorMoeda.replace(",",".");
        	double valorMoedaInt = Double.valueOf(valorMoeda);
        	System.out.println();
//        	System.out.printf("Valor retirado: €%.2f", valorMoedaInt);
        	Euro moeda = new Euro(valorMoedaInt);
        	cofrinho.removerMoedas(moeda);
        }
        else {
        	System.out.println("Opção inválida ");
        	System.out.println();
        }
        System.out.println();
    }
    }
    
