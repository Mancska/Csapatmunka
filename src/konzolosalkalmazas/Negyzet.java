
package konzolosalkalmazas;


public class Negyzet {
    private int aoldal;
    kordinata kord=new kordinata(5,6);
    
    public Negyzet(int aoldal,kordinata kord) {
        this.kord=kord;
        setAoldal(aoldal);
    }

    public int getAoldal() {
        setAoldal(aoldal);
        return aoldal;
    }

    public void setAoldal(int aoldal) {
        if(aoldal<=0){
            this.aoldal=1;
        }
        else{ this.aoldal = aoldal;}
    }

    @Override
    public String toString() {
        return "Negyzet{" + "aoldal=" + getAoldal() + " kordinata" + "x=" + kord.getX() + ", y=" + kord.getY() + '}';
    }
    public String hasonlitas(int negyzet2){
        boolean negyzet=(this.getAoldal()==negyzet2);
        if (negyzet){
            return("egyforma");
        }
        else {
            return("Nem egyforma");
        }
    }
    @Override
    public boolean equals(Object obj){
    Negyzet masik =(Negyzet) obj;
    return this.aoldal==masik.aoldal;
    }
    
}