package Composite;


public class Pessoa implements Passageiro {
    private String nome;
    private int codigo;
    
    public Pessoa(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

}
