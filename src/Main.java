import java.util.Arrays;

public class Main extends ArraysEjercicios {
    public  void start (){
        char[] i ={'p','q','r', 's', 't','v'};
        System.out.println( (char) queLetraFalta(i));

    }

    public static void main(String[] args) {
        Main start =new Main();
        start.start();
    }
}