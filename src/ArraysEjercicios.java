import java.util.Arrays;

public class ArraysEjercicios  extends StringsEjercicios{

    //EJERCICIO 70:

    //En este caso solo busco x cantidad de numeros minima q sumados me den determinado valor..
    public int min_SubArray_length(int s, int[] nums) {
        int sum = 0, count = 0, min_len = nums.length;
        for (int i = 0, j = 0; j < nums.length; ) {

            if (nums[j] == s) return 1;

            else {
                sum += nums[j];
                count++;
                if (sum >= s) {
                    min_len = Math.min(min_len, count);
                    while (j > i) {
                        sum -= nums[i];
                        count--;
                        i++;
                        if (sum < s) break;
                        min_len = Math.min(min_len, count);
                    }
                }
            }
            j++;
        }
        return min_len > nums.length ? 0 : min_len;
    }


    //Busco al menos una pareja de sumandos que den como resultado un valor determinado.
    public int longitudMinima(int[] numeros, int valor) {
        for (int numero : numeros) {
            int resta = valor - numero;
            for (int i : numeros) {
                if (i == resta) return 2;
            }
        }
        return 0;
    }

    //Busca todas las posibles parejas que sumadas me den un valor especifico.


    //EJERCICIO 71:
    public String mayorNumeroV2(int[] numeros) {
        int pasada = 0;
        boolean estaOrdenado = false;
        String result = "";
        while (!estaOrdenado) {
            estaOrdenado = true;
            for (int i = 0; i < numeros.length - pasada - 1; i++) {
                if (numeros[i + 1] > numeros[i]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    estaOrdenado = false;
                }
            }
            result = numeros[numeros.length - 1 - pasada] + result;
            pasada++;
        }
        return result;


    }

    //EJERCICIO 72:
    //Como se busca la subcadena que una vez ordenada , el array podria mostrarse de forma ascendente
    //Lo que busca mi algoritmo  es que se cumpla :   x-1 < x < x+1  y x> numeros[0]
    public int[] subarrayDesordenado(int[] numeros) {
        int[] submatriz = new int[0];
        int index = 1;
        while (index < numeros.length - 1) {
            //Compruebo  x-1 < x < x+1
            if (!(numeros[index] < numeros[index + 1] & numeros[index] > numeros[index - 1])) {
                //Compruebo x> numeros[0]
                if (!(numeros[index] > numeros[0])) {
                    //creo mi nueva submatriz
                    //Y guardo la referencia en la variable submatriz
                    submatriz = Arrays.copyOfRange(numeros, 0, index + 1);
                } else {
                    //Creamos la nueva matriz
                    int[] newSubmatriz = Arrays.copyOf(submatriz, submatriz.length + 1);
                    newSubmatriz[newSubmatriz.length - 1] = numeros[index];
                    //Y guardo la referencia en la variable submatriz
                    submatriz = newSubmatriz;
                }
                index += 1;
                continue;
            }
            index++;
        }
        return submatriz;
    }


    //EJERCICIO 73:
    //Encontramos el primer y el ultimo  elemento desordenados , luego los intercambiamos.
    public void sortArray( int [] numeros){
        int firtsIndex=-1 , lastIndex=-1;

        for (int i = 0; i < numeros.length-1; i++) {
            if ( numeros[i]>numeros[i+1]){
                if (firtsIndex == -1){
                    firtsIndex= i;
                }
                else lastIndex = i+1;
            }
        }
        int aux = numeros[firtsIndex];
        numeros[firtsIndex]= numeros[lastIndex];
        numeros[lastIndex] = aux;
    }

    //EJERCICIO 74
    //En este caso generamos las posibles tripletas
    public String findTriplets( int [] numeros,int valor){
        int firstNumber= 0 ,secondNumber =0;
        String triplets = "";
        for (int i = 0; i < numeros.length-2; i++) {

            for (int j = i+1; j <numeros.length-1 ; j++) {

                for (int k = j+1; k <numeros.length ; k++) {
                    if (numeros[i]+numeros[j]+numeros[k]==valor)
                        System.out.println("("+numeros[i]+","+numeros[j]+","+numeros[k]+")");

                }
            }
        }
        return triplets;
    }

   //EJERCICIO 75
    //Ordenamos y luego vemos la diferencia entre los numeros.
    public int mayorDistancia ( int [] numeros){
        Arrays.sort(numeros);
        int mayorDistancia = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length-1; i++) {
            int distancia =numeros[i+1]-numeros[i];
            if(distancia>mayorDistancia) mayorDistancia=distancia;
        }
        return mayorDistancia;
    }
    //EJERCICIO 76
//    Write a Java program to determine whether numbers in an array can be rearranged so that each
//    number appears exactly once in a consecutive list of numbers. Return true otherwise false.

    public boolean ordenarConsecutivamente(int [] numeros){
        Arrays.sort(numeros);
        for (int i = 1; i < numeros.length; i++) {
            if(!((numeros[i-1]+1)== numeros[i])) return false;
        }
        return true;
    }

    //EJERCICIO 77
    //Si el indice es par y su valor mayor a cero
    //Y si es impar y el valor menor que cero devolvemos true
    public  boolean esIntercalada( int [] numeros){
        for (int i = 0; i < numeros.length; i++) {
            if(i%2==0 ){
                if(!(numeros[i]>0)) return false;
            }
            else {
                if(!(numeros[i]<0))return false;
            }

        }
        return true;
    }

    //EJERCICO 78
//    Write a Java program that checks an array is negative dominant or not.
//    If the array is negative dominant return true otherwise false

    public boolean dominanteNegativa(int [] numero){
        int count = 0;
        int arrayLen= numero.length;
        for (int j : numero) {
            if (j < 0) count++;
        }
        return (arrayLen - count) < count;
    }

    //EJERCICIO 79
    //Utilizamos el codigo ASCII
    public int  queLetraFalta( char[] letras){
        for (int i = 0; i < letras.length; i++) {
            if((int) letras[i+1] - (int) letras[i] > 1) return ((int) letras[i+1]) -1;
        }
        return -1;
    }


}




