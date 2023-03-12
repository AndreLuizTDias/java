package Facade;


public class Facade {
    private Adminstrativo adm;
    private Auditoria aud;
    private Financeiro fin;
    private Juridico jur;
    private Marketing mark;
    private RH rh;
    
    public Facade(){
        this.adm = new Adminstrativo();
        this.aud = new Auditoria();
        this.fin = new Financeiro();
        this.jur = new Juridico();
        this.mark = new Marketing();
        this.rh = new RH();
    }
    // Fachada
    public void cadastrar(Cantor c){
        this.adm.emitirContrato(c);
        this.aud.agendar(c);
        this.fin.RegistrarSalario(c);
        this.jur.Analisar(c);
        this.mark.divulgar(c);
        this.rh.cadastrar(c);
    }
    
}
