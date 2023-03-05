import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEjercicios {

    //Ejercicio 8
    //Se pueden usar diversas formas para ordenar una colleccion
    //En este caso utilizare insertion sort

    //Forma facil.
    public  void  orderArrayList(ArrayList<Integer> numeros){
        Collections.sort(numeros);
        System.out.println(numeros);
    }

    //Insertion
    public void insertionSort(ArrayList<Integer> numeros){
        for (int i = 1; i <numeros.size(); i++) {
            int key= numeros.get(i);
            int index = i-1;
            while (index>=0 && key<numeros.get(index)){
                  numeros.set(index+1,numeros.get(index));
                  index--;
            }
            numeros.set(index+1,key);
        }
    }

    //Ejercicio 9
    //De esta forma o haciendo uso de un addAll
    public ArrayList<Integer> Copiar(ArrayList<Integer> numeros){
        ArrayList<Integer> result = new ArrayList<>(numeros);
        System.out.println(result);
        return result;
    }
    //Ejercicio10
    //Se utiliza el metodo Shuffle
    public void Mezclar(ArrayList<Integer> numeros){
        Collections.shuffle(numeros);
    }

    //Ejercicicio 11
    //Forma facil
    public void reverseArrayList(ArrayList<Integer> numeros){
        Collections.reverse(numeros);
    }

    //Usando un for y swap
    public  ArrayList<Integer>reverseArrList2(ArrayList<Integer> numeros ){
        ArrayList<Integer>result=new ArrayList<>();
        for (int i = numeros.size()-1; i>=0; i--) {
            result.add(numeros.get(i));
            System.out.println(result);
        }
        return result;
    }





}
