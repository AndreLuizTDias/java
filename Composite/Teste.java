package Composite;


public class Teste {
    
    public static void main(String[] args){
        Aviao<Passageiro> a = new Aviao<Passageiro>("JJ3535", 4); // se ultrapassar a capacidade ira retorna uma throw
        
        // Adicionando PEssoa (Unitaria)
        a.addPassageiros(new Pessoa("Primeira Pessoa", 1));
        a.addPassageiros(new Pessoa("Segunda Pessoa", 10));
        
        // Criando um Pacote (Grupo de pessoas)
        Pacote pac = new Pacote(224, "Galera");
        pac.addMembro(new Pessoa("Terceira pessoa", 1));
        pac.addMembro(new Pessoa("Quarta pessoa", 15));
        //pac.addMembro(new Pessoa("Quart6 pessoa", 16));
         
        a.addPassageiros(pac);
        
        System.out.println(a.getQtdePassageiros());
        if(a.isLotado()){
            System.out.println("o Voo " + a.getVoo() + " esta Lotado");
        }else{
            System.out.println("O voo " + a.getVoo() + " nao esta Lotado");
        }
    }
}
