
package konzolosalkalmazas;

public class main {


    public static void main(String[] args) {
        allapot();
    }

    public static void allapot() {
        Negyzet negyzet=new Negyzet(3,new kordinata(20,30));
        Negyzet negyzet2=new Negyzet(3,new kordinata(20,30));
        System.out.println(negyzet.hasonlitas(negyzet2.getAoldal()));
        System.out.println(negyzet.toString());
        System.out.println(negyzet.equals(negyzet2));
        System.out.println(negyzet.hashCode()+" "+negyzet2.hashCode());
    }
    
}

    

