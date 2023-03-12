package Adapter;

// CLASSE ADAPTADOR
public class AdaptadorPS5ParaXBox extends SensorPS5 {
    private SensorXBox adaptee;
    
    public AdaptadorPS5ParaXBox(SensorXBox adaptee){
        this.adaptee = adaptee;
    }
    
    public void conectarPS5(){
        adaptee.conectarXBox();
        System.out.println("Controle de PS5 conectado ao sensor de xbox com sucesso");
    }
}
