import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    Scanner Entrada = new Scanner(System.in);
    System.out.println("Ingrese el numero de base: ");
    double base = Entrada.nextDouble();
    System.out.println("Ingrese el numero exponente: ");
    double exponente = Entrada.nextDouble();
    double resultado = Math.pow(base, exponente);
    System.out.println("El resultado seria: "+ resultado);
  }
}
    