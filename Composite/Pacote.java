package Composite;

import java.util.ArrayList;
import java.util.List;


public class Pacote implements Passageiro {
    private String nome;
    private int codigo;
    private List<Passageiro> passageiros;
    
    public Pacote(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
        this.passageiros = new ArrayList<Passageiro>();
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
    
    public void addMembro(Pessoa p){
        this.passageiros.add(p);
    }
    public List<Passageiro> getMembros(){
        return this.passageiros;
    }
    public Passageiro getMembro(int codigo){
        return this.passageiros.get(codigo);
    }
    
}
