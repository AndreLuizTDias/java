package Composite;

import java.util.ArrayList;
import java.util.List;


public class Aviao <T extends Passageiro> {
    private List<T> passageiros;
    private String voo;
    private int capacidade;
    
    public Aviao(String voo, int capacidade){
        this.voo = voo;
        this.capacidade = capacidade;
        this.passageiros = new ArrayList<T>();
    }

    public String getVoo() {
        return this.voo;
    }

    public int getCapacidade() {
        return this.capacidade;
    }
    
    public int getQtdePassageiros(){
        int qtde = 0;
        for(Passageiro p: this.passageiros)
            if(p instanceof Pessoa) ++qtde;
            else qtde += ((Pacote)p).getMembros().size();
        return qtde;
    }
    
    public boolean isLotado(){
        return this.getQtdePassageiros() == this.capacidade;
        
    }
    
    public void addPassageiros(T novo){
        if(this.isLotado()) throw new RuntimeException("Lotado");
        if(novo instanceof Pacote && this.getQtdePassageiros() + ((Pacote)novo).getMembros().size() > this.capacidade)
            throw new RuntimeException("Lotado");
        this.passageiros.add(novo);
    }
    
}
