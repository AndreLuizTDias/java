package Observer;


public class ClienteTeste {
    public static void main(String[] args){
        DadosSubject dados = new DadosSubject();
        dados.attach(new TabelaObserver(dados));
        dados.attach(new BarraObserver(dados));
        dados.attach(new PorcentoObserver(dados));

        dados.setState(new Dados(7,3,1));
        System.out.println("\n");
        dados.setState(new Dados(10,15,20));
    }

}
