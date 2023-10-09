
package konzolosalkalmazas;

public class kordinata {
    private int x,y;
    

    public kordinata(int x,int y) {
            this.y=x;
            this.x=y;
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
         
        this.x = x;
    }

    public void setY(int y) {
     
        this.y = y;
    }

    @Override
    public String toString() {
        return "kordinata{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
