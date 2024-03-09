package br.com.eduardoxerxenevsy;

public class Numero {

    private int limite;
    private int valor;

    public Numero(int limite) {
        this.limite = limite;
    }

    public void incrementar(){
        this.valor++;
        if(valor>limite){
            valor=0;
        }
    }

    public void decrementar(){
        this.valor--;
        
    }

    public String getValorFormatado(){
        String numero ="";
        if(valor<10){
        numero = String.valueOf("0"+this.valor);
        }else{
        numero = String.valueOf(this.valor);
        }
        return numero;
        
        
        
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    

}
