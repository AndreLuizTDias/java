package Bridge;


public class Coordenador implements Operador {
    
    @Override
    public void matricular(Matricula m){
        m.emitir();
    }
}
