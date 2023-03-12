package Decorator;


public class MassaIntegral extends PizzaDecorator {
    MassaIntegral(Pizza p){
        super(p);
    }
  
    @Override
    public int preco(){
        return pizzaDecorada.preco() + 5;
    }
}
