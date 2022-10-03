/* 
*Matriz de 10x10 ingresado por teclado, sume la diagonal principal y
secundaria.
*/
package Matrices;
import java.util.Scanner;
public class Ejercicio1{
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
} //IMPRIMIR LA MATRIZ
System.out.println("La matriz es: ");
for (int i=0; i < matriz.length;i++) {
System.out.print("[");
for (int j=0; j < matriz[i].length;j++) {
System.out.print (matriz[i][j]);
if (j!=matriz[i].length-1) System.out.print("\t");
}
System.out.println("]");
} //SUMA DIAGONAL SECUNDARIA
int resultadoS=0;
for (int i=0; i<matriz.length ; i++){
for (int j=0; j<matriz[i].length ; j++){
//CODIGO DE SUMA
if(i+j==(matriz.length-1)){
resultadoS+=matriz[i][j];
}
}
} //SUMA DIAGONAL PRINCIPAL
int resultado=0;
for (int i=0; i<matriz.length ; i++){
for (int j=0; j<matriz[i].length ; j++){
//CODIGO DE SUMA
if(i==j){
resultado+=matriz[i][j];
}
}
}
System.out.println("La suma de la diagonal secundaria es: "+resultadoS);
System.out.println("La suma de la diagonal principal es: "+resultado);
}}
