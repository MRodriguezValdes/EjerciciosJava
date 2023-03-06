import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main extends ArraysEjercicios {
    public  void start (){
        String s1 = "Java";
        String s2 ="Jac";
        ArrayList<Integer> numeros=new ArrayList<Integer>();
        Collections.addAll(numeros,1,2,3,4,5);
        ArrayList<Integer> numeros2=new ArrayList<>();
        Collections.addAll(numeros2,1,2,3,4,5);
        mostrarElementos(numeros);

    }

    public static void main(String[] args) {
        Main start =new Main();
        start.start();
    }
}