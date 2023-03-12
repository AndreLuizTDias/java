package Observer;

import java.text.DecimalFormat;


public class PorcentoObserver extends DadosObserver {
    public PorcentoObserver(DadosSubject dados){
        super(dados);
    }
    @Override
    public void update() {
        int somaDosValores = dados.getState().valorA + dados.getState().valorB + dados.getState().valorC; 
        DecimalFormat formatador = new DecimalFormat("#.##");
        String porcentagemA = formatador.format((double) dados.getState().valorA / somaDosValores * 100);
        String porcentagemB = formatador.format((double) dados.getState().valorB / somaDosValores * 100);
        String porcentagemC = formatador.format((double) dados.getState().valorC / somaDosValores * 100);
        System.out.println("Porcentagem: \nValor A = " + porcentagemA 
                + "%\nValor B= " + porcentagemB + 
                "%\nValor C= " + porcentagemC + "%");
    }

}
