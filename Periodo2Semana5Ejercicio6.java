import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    String tipoDia = "";
    String diaSemana = "lunes";

    switch (diaSemana.toLowerCase()) {
      case "lunes":
        tipoDia = "Inicio de la semana";
        break;
      case "martes":
      case "miercoles":
      case "jueves":
        tipoDia = "Mediados de la semana";
        break;
      case "viernes":
       tipoDia = "Incio del fin de semana";
        break;
      case "sabado":
      case "domingo":
        tipoDia = "Fin de la semana";
        break;
    }
    System.out.println(diaSemana + " es " + tipoDia);
  }
}  