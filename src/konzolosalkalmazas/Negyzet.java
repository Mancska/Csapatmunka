
package konzolosalkalmazas;


public class Negyzet {
    private int aoldal;
    
    
    public Negyzet(int aoldal) {
        setAoldal(aoldal);
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