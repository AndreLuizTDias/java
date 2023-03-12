package Bridge;


public class TesteCliente {
    public static void main(String[] args){
        Operador o = new Coordenador();
        o.matricular(new MatriculaOnline());
        
        Diretor d = new Diretor();
        d.matricular(new MatriculaPresencial());
    }
}
