
package konzolosalkalmazas;

public class kordinata {
    private int x=9;
    private int y=9;
    
    
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
