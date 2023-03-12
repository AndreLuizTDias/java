package Atividade_01_questao_2;

import java.util.Scanner;

public class teste_pizzaria {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int tipo, tipo_pizza;
        System.out.println("Escolha a Fabrica\n1 - FabricaRJ \n2 - FabricaSP");
        tipo = ler.nextInt();
        
        switch(tipo){
            case 1:
                System.out.println("Escolha o tipo da pizza\n1 - Pizza de Calabressa \n2 - Pizza Napolitana ");
                tipo_pizza = ler.nextInt();
                if(tipo_pizza == 1){
                    FabricaRJ fabrica = new FabricaRJ();
                    Pizza pizza1 = fabrica.getPizza("PizzaCalabresaCarioca");
                    pizza1.preparar();
                }else{
                    FabricaRJ fabrica = new FabricaRJ();
                    Pizza pizza1 = fabrica.getPizza("");
                    pizza1.preparar();
                }
                break;
            case 2:
                System.out.println("Escolha o tipo da pizza\n1 - Pizza de Calabressa \n2 - Pizza Napolitana ");
                tipo_pizza = ler.nextInt();
                if(tipo_pizza == 1){
                    FabricaSP fabrica = new FabricaSP();
                    Pizza pizza1 = fabrica.getPizza("PizzaCalabresaPaulista");
                    pizza1.preparar();
                }else{
                    FabricaSP fabrica = new FabricaSP();
                    Pizza pizza1 = fabrica.getPizza("");
                    pizza1.preparar();
                }
                break;
        }
        
        
    }
    
}
