package Proxy;

// Proxy e usado para restrigir o acesso indevido as variaveis
public class PessoaProxy implements IPessoa {
    private Pessoa pessoa;
    
    public PessoaProxy(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    @Override
    public String getNome() {
        return this.pessoa.getNome();
    }

    @Override
    public int getIdade() {
        return this.pessoa.getIdade();
    }
    
    @Override
    public void setNome(String nome) {
        throw new RuntimeException("Operaçao nao disponivel");
    }

    @Override
    public void setIdade(int idade) {
        throw new RuntimeException("Operaçao nao disponivel");
    }
    
    
}
