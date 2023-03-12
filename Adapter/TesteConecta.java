package Adapter;

public class TesteConecta {
    // temos um xbox e queremos conectar um controle de ps5
    public static void main(String[] args){
        SensorXBox adaptee = new SensorXBox();
        ControlePS5 target = new ControlePS5();

        AdaptadorPS5ParaXBox adapter = new AdaptadorPS5ParaXBox(adaptee);

        target.Conectar(adapter);
    }

}
