package Bridge;


public class MatriculaPresencial implements Matricula {

    @Override
    public void emitir() {
        System.out.println("Matricula Presencial executada");
    }
    
}
