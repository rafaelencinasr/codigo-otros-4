/*
  Este programa es el juego de piedra, papel, o tijera desde la consola
  Se recibe la entrada de los dos jugadores y luego se revisa cual de las
  entradas vence a la otra para mostrar al ganador
 */

 import java.util.Scanner;

 public class Codigo4 {
 
   public static void main(String[] args) {
     // TODO Auto-generated method stub
     //Se crea un scanner para recibir el input de los jugaores
     Scanner s = new Scanner(System.in);
     
     //Se muestra la instruccion para que el jugador introduzca su eleccion
       System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
       //Se guarda la entrada del jugador 1
       String j1 = s.nextLine();
       
       //Se muestra la instruccion para que el jugador introduzca su eleccion
       System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
       //Se guarda la entrada del jugador 2
       String j2 = s.nextLine();
       
       //Se revisa si la entrada del usuario coincide con las opciones mostradas
       boolean buenInput1 = j1.equalsIgnoreCase("piedra") || j1.equalsIgnoreCase("papel") || j1.equalsIgnoreCase("tijeras");
       boolean buenInput2 = j2.equalsIgnoreCase("piedra") || j2.equalsIgnoreCase("papel") || j2.equalsIgnoreCase("tijeras");
       
       //Si la entrada es correcta se pasa a la logica del juego
       if(buenInput1 && buenInput2) {
         //Si ambos jugadores ingresan el mismo valor, se muestra un empate
         if (j1.equals(j2)) {
             System.out.println("Empate");
           } else {	//Si las entradas son diferentes se entra a un switch case
             //Se pone al jugador 2 por default como ganador
             int g = 2;
             //Se utiliza la entrada del jugador 1 como la variable del switch case
               switch(j1) {
               //Se revisan solo los casos donde el jugador 1 ganaria
                 case "piedra":
                   if (j2.equals("tijeras")) {
               //En caso de que el jugador 1 gane, se cambia el valor de 'g'
                     g = 1;
                   }
                   break;
                 case "papel":
                   if (j2.equals("piedra")) {
                     g = 1;
                   }
                   break;
                 case "tijera":
                   if (j2.equals("papel")) {
                     g = 1;
                   }
                   break;
                 default: g=2;
               }//fin del switch
               //Al terminar el switch se muestra el ganador del juego
             System.out.println("Gana el jugador " + g);
           }//fin del else
       } else {
         //Si las entradas de los jugadores no fueron validas, se muestra un mensaje de error
         System.out.println("Los valores ingresados son invalidos. Por favor intente de nuevo.");
       }
     
         /*
 */
   }//Fin del main
 
 }//Fin de la clase
 