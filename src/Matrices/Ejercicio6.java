package Matrices;
import java.util.Scanner;

public class Ejercicio6{
public static void main(String[] args) {
  //CRUZADO CHUCOS NEFI JORGE
  //ESCRIBIR LA MATRIZ POR TECLADO
Scanner sc=new Scanner(System.in);
    //DEFINIR LA CANTIDAD DE COLUMNAS Y FILAS DE LA MATRIZ    
    System.out.println("Ingresa la cantidad de filas de la matriz:");
    int nFilas=sc.nextInt();
    System.out.println("Ingresa la cantidad columnas de la matriz:");
    int nColumnas=sc.nextInt();
    int matriz[][]=new int[nFilas][nColumnas];
    //DEFINIR EL CONTENIDO DE LA MATRIZ
    for (int i=0; i < matriz.length; i++) {
    for (int j=0; j < matriz[i].length; j++) {
    matriz[i][j] = (int) (Math.random()*9+1);
  }
} 
//IMPRIMIR LA MATRIZ 
System.out.println("La matriz es: ");
for (int i=0; i < matriz.length;i++) {
  System.out.print("[");
  for (int j=0; j < matriz[i].length;j++) {
    System.out.print(matriz[i][j]);
    if (j!=matriz[i].length-1) System.out.print("\t");
  }
  System.out.println("]");
}
//SUMAR LAS COLUMNAS DE LA MATRIZ
int sumaColumnas = 0;
 for(int j=0;j<matriz.length;j++){
     for (j = 0; j < 10; j++) {
    if (j%2==0) {
for(int i=0;i<matriz.length;i++){
           sumaColumnas+=matriz[i][j];
}
System.out.print("\nLa suma de la columna "+j+" es: "+sumaColumnas);
    sumaColumnas=0;
                 }
             }
        }
    }
}