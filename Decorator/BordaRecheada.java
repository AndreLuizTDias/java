package Decorator;


public class BordaRecheada extends PizzaDecorator {
    BordaRecheada(Pizza p){
        super(p);
    }
    @Override
    public int preco(){
        return pizzaDecorada.preco() + 10;
    }
}
