
package com.mycompany.mavenproject4;
public class Mavenproject4 {
    public static void main(String[] args) {
        int [] array= {1,2,3,4,5};
        arrayrecusivo(array,0);
    }
  public static void  arrayrecusivo(int[] array, int indice){
      if (indice==(array.length-1)){
          System.out.println(array[indice]);
      }else{
          System.out.println(array[indice]);
          arrayrecusivo(array,indice+1);
      }
}
/*      public static void main(String[] args) {
       int n=4;
       int resultado=factorialrecursivo(n);
        System.out.println(resultado);
    }
    public static int factorialrecursivo(int numero){
     int res;
     if(numero==1){
         return 1;
     }
     else{
     res=numero*factorialrecursivo(numero-1);
     }
     return res;
*/
  /*public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={2,3,4,5};
        if(a1.length==a2.length){
            System.out.println(arraysiguales(a1,a2,0));
        }else{
            System.out.println(false);
        }
        
        
    }
    public static boolean arraysiguales(int[] a1,int[] a2, int indice){
        if(indice==a1.length){
            return true;
        }else if(a1[indice]!=a2[indice]) {
            return false; 
        }else{
        return arraysiguales(a1,a2,indice+1);
        }
    }*/
  
  /*  public static void main(String[] args) {
        int [] numeros={1,2,3,4,5};
        System.out.println("maximo"+maximo(numeros,0,numeros[0]));
        System.out.println("minimo"+ minimo(numeros, 0,numeros[0]));
    }
    
    private static int maximo(int[] numeros, int indice, int max){
    if(indice != numeros.length){
        if(numeros[indice]>max){
        max =maximo(numeros,indice+1,numeros[indice]);
        }else{
        max=maximo(numeros, indice+1,max);
        }
    }
        return max;
}
    public static int minimo(int [] numeros,int indice, int min){
        if(indice!=numeros.length){
            if(numeros[indice]<min){
               min=minimo(numeros,indice+1,numeros[indice]);
            }else{
            min=minimo(numeros,indice+1,min);
            }
        }
        return min;
    }*/
}
    

