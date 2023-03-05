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
//    Write a Java program that reverses all the words in a string that have odd lengths.

    public String reverse(String s1){
        if(s1.length()%2==0) return s1;
        String result="";
        for (int i = 0; i < s1.length(); i++) {

        }
        return result;
    }
}
