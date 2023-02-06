import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        coche micoche= new coche(4);
        micoche.sump();
        System.out.println("numero de puertas:"+micoche.nump);

        int resultado = 0;
        resultado = suma(4,2, 5);
        System.out.println("la sumas de los numeros:"+resultado);
    }

    public static  int suma(int a, int b, int c){
        return a + b + c;
    }

}
class coche {
    public int nump=0;
    public coche (int nump){
        this.nump = nump;
    }

    public void sump(){
        this.nump++;

    }
}

