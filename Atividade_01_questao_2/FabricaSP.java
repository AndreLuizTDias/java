package Atividade_01_questao_2;

public class FabricaSP implements IFabrica {

   @Override
   public Pizza getPizza(String Pizza){
       if("PizzaCalabresaPaulista".equals(Pizza)){
           return new PizzaCalabresaPaulista();
       }
       else{
           return new PizzaNapolitanaPaulista();
       }
       
   };
}
