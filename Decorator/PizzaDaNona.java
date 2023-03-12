package Decorator;

import java.util.HashMap;


public class PizzaDaNona implements Pizza {
    HashMap<String, Integer> ingredientes;

    PizzaDaNona(){
        
    }
    PizzaDaNona(HashMap<String, Integer> ingredientes){
        this.ingredientes = ingredientes;
    }
    
    @Override
    public int preco() {
         int valor = 0;
         for(Integer i : ingredientes.values())
             valor += 1;
         return valor;
    }
    
}
