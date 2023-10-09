
package konzolosalkalmazas;


public class Negyzet {
    private int aoldal=5;
    private int x=9;;
    private int y=9;;
    
    public Negyzet() {
        
    }

    public int getAoldal() {
        return aoldal;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setAoldal(int aoldal) {

        
        this.aoldal = aoldal;
    }

    public void setX(int x) {
         
        this.x = x;
    }

    public void setY(int y) {
     
        this.y = y;
    }

    @Override
    public String toString() {
        return "Negyzet{" + "aoldal=" + getAoldal() + ", x=" + getX() + ", y=" + getY() + '}';
    }
    
    
}