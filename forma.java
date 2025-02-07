

class Formageometrica{

    private String nome;
    private  int raggio = 8;


    Formageometrica(String nome){
        this.nome = nome;
    }
     public String getnomeString(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public int getraggio(){
        return raggio;
    }
     public void setraggio(int raggio){
        this.raggio = raggio;
    }

    public float calcolarea(int raggio){
        return raggio*raggio*3.14;
    }

  public float calcolaperimetro(int raggio){
        return 2*3.14*raggio;
    }
    
    public void stampaDettagli(){
       System.out.println(" questa forma è di tipo: " + nome + ", raggio: " + raggio);
       System.out.println("area: " + calcolarea());
       System.out.println("perimetro: " + calcolaperimetro());
       
    }

}

public class forma{
    public static void main(String[] args){
        Formageometrica forma =new Formageometrica("cerchio");
        forma.stampaDettagli();
        
    }
}