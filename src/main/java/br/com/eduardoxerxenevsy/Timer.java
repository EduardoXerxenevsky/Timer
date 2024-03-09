package br.com.eduardoxerxenevsy;

public class Timer {

    protected Numero horas = new Numero(24);
    protected Numero minutos = new Numero(60);
    protected Numero segundo = new Numero(60);
    protected boolean regressivo;
    protected boolean ligado;
 
    public Timer(){

    }

    public Timer(int minutos){
        
    }

    public void start(){
        this.ligado = true;
    }

    public void stop(){
        this.ligado = false;
    }
    public void setTempo(int minutos){
        
        this.horas.setValor(minutos/60);
        this.minutos.setValor(minutos%60);
        this.segundo.setValor(0);
        if(this.horas.getValor()>=24){
            this.horas.setValor(0);
            this.minutos.setValor(0);
        }
    }

    public void setRegressivo(boolean regressivo){
        this.regressivo = true;
        if(regressivo){
            this.regressivo = false;
        }
    }

    public void tick(){
        if(ligado){
        if(!regressivo){
            this.segundo.incrementar();
            if(this.segundo.getValor()==this.segundo.getLimite()){
                this.segundo.incrementar();
                this.minutos.incrementar();
                if(this.minutos.getValor()==this.minutos.getLimite()){
                    this.minutos.incrementar();
                    this.horas.incrementar();
                    if(this.horas.getValor()==this.horas.getLimite()){
                        this.horas.setValor(0);
                    }
                }
            }

        }
        if(regressivo){
            this.segundo.decrementar();
            if(this.segundo.getValor()<0){
                this.segundo.setValor(59);
                this.minutos.decrementar();
                if(this.minutos.getValor()<0){
                this.minutos.setValor(59);
                this.horas.decrementar();
                
                }
            }
        }
    }
}

    public Numero getHoras() {
        return horas;
    }

    public void setHoras(Numero horas) {
        this.horas = horas;
    }

    public Numero getMinutos() {
        return minutos;
    }

    public void setMinutos(Numero minutos) {
        this.minutos = minutos;
    }

    public Numero getSegundo() {
        return segundo;
    }

    public void setSegundo(Numero segundo) {
        this.segundo = segundo;
    }

    public boolean isRegressivo() {
        return regressivo;
    }

    public boolean isIniciado() {
        return ligado;
    }

    public void setIniciado(boolean iniciado) {
        this.ligado = iniciado;
    }

    
}
