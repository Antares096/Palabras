package palabrasiguales;

import java.util.Scanner;

public class Main{
    
    public static Scanner sc;

    public static void main(String[] args) {
        
        String p1 = Palabra1();
        
        String p2 = Palabra2();

        if(!p1.contentEquals(p2))
        {
            Palabras1erCaracter(p1,p2);
        }
        else
        {
            ComparaPalabras(p1,p2);
        }
    }
    public static String Palabra1()
    {
        sc = new Scanner(System.in);
        
        System.out.println("Escriba una palabra: ");
        
        String palabra = sc.next();

        return palabra;
    }
    
    public static String Palabra2()
    {
        sc = new Scanner(System.in);
        
        System.out.println("Escriba otra palabra: ");
        
        String palabra = sc.next();
        
        return palabra;
    }
    
    public static void ComparaPalabras(String p1,String p2)
    {
        char palabra_1 [] = new char[p1.length()];
        
        char palabra_2 [] = new char[p2.length()];
 
        String palabra1 = "";
        String palabra2 = "";
        
        if(palabra_1.length == palabra_2.length)
        {
            for (int i = 0; i < palabra_1.length; i++)
            {
                palabra_1[i] = p1.charAt(i);
                palabra_2[i] = p2.charAt(i);
                
                palabra1 = String.valueOf(palabra_1);
                palabra2 = String.valueOf(palabra_2);
            }
            
            if(palabra1.contentEquals(palabra2))
            {
                System.out.println("Las palabras son iguales.");
            }
        }
    }
    
    public static void Palabras1erCaracter(String p1, String p2)
    {
        char conjunto_letra[] = new char[p1.length()];
        
        char coleccion_letra[] = new char[p2.length()]; 
        
        int cont_lt = 0;
        
        if(p1.charAt(0) != p2.charAt(0) && p1.length() == p2.length())
        {
            for(int i = 0; i < p1.length(); i++)
            {
                conjunto_letra[i] = p1.charAt(i);
                coleccion_letra[i] = p2.charAt(i);
                
                if(conjunto_letra[i] == coleccion_letra[i])
                {
                    cont_lt++;
                }
            }
            
            if(cont_lt < conjunto_letra.length)
            {
                System.out.println("Las palabras son las mismas.\n");
                System.out.println("La unica diferencia es la primer letra que en ambas palabras no siempre es mayuscula o minuscula.");
            }
            else
            {
                System.out.println("Las palabras no son iguales.");
            }
        }
        else
        {
            System.out.println("Las palabras no son iguales.");
        }
    }
}
