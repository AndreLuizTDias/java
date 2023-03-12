package Atividade_01_questao_2;

public class FabricaRJ implements IFabrica {

   @Override
   public Pizza getPizza(String Pizza){
       if("PizzaCalabresaCarioca".equals(Pizza)){
           return new PizzaCalabresaCarioca();
       }
       else{
           return new PizzaNapolitanaCarioca();
       }
       
   };
}
