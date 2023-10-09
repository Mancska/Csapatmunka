
package konzolosalkalmazas;

public class main {


    public static void main(String[] args) {
        allapot();
    }

    public static void allapot() {
        kordinata kordinata= new kordinata(5,6);
        Negyzet negyzet=new Negyzet(-1);
        System.out.println(negyzet.toString()+kordinata.toString());
    }
    
}

    

