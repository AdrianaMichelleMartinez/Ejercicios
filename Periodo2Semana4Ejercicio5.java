import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    Scanner ingresar = new Scanner(System.in);
    int suma = 0;
    for (int i=100; i<=200; i++){
      suma = suma + i; 
    }
    System.out.println("El resultado de la suma es: " + suma);
  }
}