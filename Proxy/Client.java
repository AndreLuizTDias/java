package Proxy;


public class Client {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Valeria", 15);
        
        // Sem o proxy
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        p.setNome("Valeria Cavalcanti");
        System.out.println(p.getNome());
        
        // Com proxy
        IPessoa pp = new PessoaProxy(p);
        System.out.println(pp.getNome());
        System.out.println(pp.getIdade());
        pp.setNome("Joao");// nao permite a execuçao
        System.out.println(pp.getNome());
        
    }
}
