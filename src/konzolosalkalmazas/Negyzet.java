
package konzolosalkalmazas;


public class Negyzet {
    private int aoldal=0;
    
    
    public Negyzet() {
        
    }

    public int getAoldal() {
        setAoldal(aoldal);
        return aoldal;
    }

    

    public void setAoldal(int aoldal) {
        if(this.aoldal<=0){
            this.aoldal=1;
        }
        else{ this.aoldal = aoldal;}
    }

    

    @Override
    public String toString() {
        return "Negyzet{" + "aoldal=" + getAoldal() + '}';
    }
    
    
}