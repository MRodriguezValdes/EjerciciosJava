public class StringsEjercicios {
    //Ejercicio 105
    //Utilazando la sobrecarga del metodo indexof podemos encotrar el numero de ocurrencias
    //
    public  int countOcurrences (String s1, String s2){
        int count= 0 ;
        //Primera ocurrencia
        int index = s1.indexOf(s2);
        while (index!=-1 ){
            count++;
            //Proxima ocurrencia y sumo la logitud de s2 para dejar atras la ocurrencia anterior
            index = s1.indexOf(s2,index+s2.length());
        }
        return count;
    }

    //Ejercicio 106
    //Concatenamos N veces un string.
    public String concatenaNVeces(String s1,int veces){
        int index =0;
        String result="";
        while (index <veces){
            result += s1;
            index++;
        }
        return result;
    }

    //Ejercicio 107
//    Write a Java program to counts occurrences of a certain character in a given string

    public int cuantasVecesEstaElCaracter(String s1,Character s2){
        int count= 0 ;
        //Primera ocurrencia
        int index = s1.indexOf(s2);
        while (index!=-1 ){
            count++;
            //Proxima ocurrencia y sumo la logitud de s2 para dejar atras la ocurrencia anterior
            index = s1.indexOf(s2,index+1);
        }
        return count;

    }
    //Ejercicio 108
//    If there are two consecutive identical letters in the said string
    public boolean letrasConsecutivas(String s1){
        for (int i = 0; i < s1.length()-1; i++) {
            if(s1.charAt(i+1)==s1.charAt(i))return true;
        }
        return false;
    }

    //Ejercicio 109
    //Invertir palabras con longitud impar

    public String reverse(String s1){
        String[] palabras = s1.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length()%2==0){
                String reverse = "";
                for (int j = palabras[i].length()-1; j >=0 ; j--) {
                    reverse+= palabras[i].charAt(j);
                }
                palabras[i]=reverse;
            }
        }
        return String.join(" ",palabras);
    }



    //Ejercicio 110

    public int masDeDosOcurrencias(String s1){
        int count=0;
        String contadas="";
        for (int i = 0; i < s1.length()-1; i++) {
            int countAux=0;
            int index = i-1;
            if((contadas.indexOf(s1.charAt(i))==-1)){
                for (int j = i+1; j <s1.length() ; j++) {
                    index =s1.indexOf(s1.charAt(i),index+1);
                    if(index !=-1)countAux++;
                    else break;
                }
                if(countAux>2){
                    count++;
                    contadas+=s1.charAt(i);
                }
            }
        }


        return count;
    }
    //Ejercicio 111
    //Utilizamos el metodo substring para quedarnos con los trozos que deseamos.
    public String eliminarPalabra(String s1, String  palabra){
        int index = s1.indexOf(palabra);
        return s1.substring(0,index)+" "+s1.substring(index+palabra.length());
    }

    //Ejercicio 112
    //Seguimos utilizando indexOF
    public boolean estaPresenteEnlaCadena(String s1, String s2){
        //Utilizo esta variable para no repetir la comprobacion de una letra
        String contadas ="";
        for (int i = 0; i < s2.length(); i++) {
            char letra = s2.charAt(i);
            if(contadas.indexOf(letra)==-1){
                if(s1.indexOf(letra)==-1) return false;
                contadas+=letra;
            }
        }
        return true;
    }

}
