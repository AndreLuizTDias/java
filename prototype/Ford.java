
package prototype;


public class Ford extends Carro {
    public Ford(String m){
        nomeModelo = m;
    }
    
    public Carro clone() throws CloneNotSupportedException{
        return (Ford)super.clone();
    }
}
