import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    String nombre, clave;
    Scanner Entrada = new Scanner(System.in);
    System.out.print("Escriba el nombre de usuario: ");
    nombre = Entrada.nextLine();
    System.out.print("Escriba la clave de usuario: ");
    clave = Entrada.nextLine();
    if(nombre.equals("Michi") && clave.equals("2010")){
      System.out.println("Bienvenido!");
    }
    else{
    System.out.println("El nombre o la contraseña es incorrecta");
   }
  }
 }
