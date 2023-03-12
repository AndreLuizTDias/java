package Decorator;


public class ExtraGrande extends PizzaDecorator {
    ExtraGrande (Pizza p){
        super(p);
    }
    @Override
    public int preco(){
        return (int) (pizzaDecorada.preco() * 1.3);
    }
}
