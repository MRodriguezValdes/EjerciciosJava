import javax.swing.*;
import java.awt.*;
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

    //Ejercicio 12
    //Podemos hacerlo de la forma facil usando List y sublist
    public ArrayList<Integer> porcionDeLista(ArrayList<Integer> numeros, int FIndex, int Lindex){
        ArrayList<Integer> result = new ArrayList<>(numeros.subList(FIndex,Lindex));
        return result;
    }
    //Ejercicio 13
    public boolean sonIguales ( ArrayList<Integer> n1,ArrayList<Integer> n2){
        return n1.equals(n2);
    }
    //Ejercicio 14
    public void swap (ArrayList<Integer> n1,int i, int j){
        int aux = n1.get(i);
        n1.set(i,n1.get(j));
        n1.set(j,aux);
    }

    public ArrayList<Integer> joinArrayList(ArrayList<Integer> n1,ArrayList<Integer> n2){
        n1.addAll(n2);
        return n1;
    }


    //Ejercicio 16
    public ArrayList<Integer> copy (ArrayList<Integer> n1){
        ArrayList<Integer>copia = new ArrayList<>();
        copia.addAll(n1);
        return copia;
    }

    //Ejercicio 17

    public  void borrar (ArrayList<Integer> n1){
        n1.clear();
    }

    //Ejercicio 18
    public boolean estaVacio(ArrayList<Integer> n1){
        return n1.isEmpty();
    }

    //Ejercicio 19
    public  void  reducirEspacio ( ArrayList<Integer> n1) {
        n1.trimToSize();
    }
    //Ejercicio 20;
    public void aumentarlength(ArrayList<Integer> n1,int new_length){
        n1.ensureCapacity(new_length);
    }

    //Ejercicio 21:

    public void colocarElemeto(ArrayList<Integer> n1,int elemento){
        n1.set(2,elemento);
    }

    //Ejercicio 22:
    public void mostrarElementos ( ArrayList<Integer> n1){
        for (int i = 0; i < n1.size(); i++) {
            System.out.println(n1.get(i));
        }
    }

}
