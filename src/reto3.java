import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        //Declarando variables
        String nombreJugador;
        //la variable "numeroGanador" sacara un numero aleatoriamente en un rango de 1 a 3
        int edadJugador, numeroMaquina = (int)(Math.random()*2+1), eleccionJugador; 


        //Creación de objetos | Instanciar clases
        Scanner input = new Scanner(System.in);
        
        //Solicitar los datos
        System.out.println("Bienvenido al juego de cara o sello.");
        System.out.print("Por favor, digite su nombre completo: ");
        nombreJugador = input.next();
        System.out.println("Perfecto "+nombreJugador+", ahora, digite su edad:");
        edadJugador = input.nextInt();

        //Operaciones
        if (edadJugador >= 18 && edadJugador <= 100) {
            System.out.println("Ya puedes jugar, elige alguna de las opciones: \n1. Cara. \n2. Sello.");
            eleccionJugador = input.nextInt();

            if (eleccionJugador > 0 && eleccionJugador < 3) {
                if (numeroMaquina == 1) {
                    System.out.println("La moneda da giros y cae del lado de la cara.");
                    if (eleccionJugador == numeroMaquina) {
                        System.out.println("Felicidades, has ganado a la máquina esta vez ¿tendrás la misma suerte a la próxima?");
                    } else {
                        System.out.println("La máquina ha ganado esta vez, intentalo mejor en otra ocasión.");
                    }
                } else if (numeroMaquina == 2) {
                    System.out.println("La moneda da giros y cae del lado del sello.");
                    if (eleccionJugador == numeroMaquina) {
                        System.out.println("Felicidades, has ganado a la máquina esta vez ¿tendrás la misma suerte a la próxima?");
                    } else {
                        System.out.println("La máquina ha ganado esta vez, intentalo mejor en otra ocasión.");
                    }
                }
            } else {
                System.out.println("El número elegido ha sido mayor a 2 o menor a 1, no se realizará el juego.");
            }
                        
            System.out.println("Output: el número al azar en está ejecución fue: "+numeroMaquina);

        } else {
            System.out.println("No tienes la edad permitida o digitaste un número erroneo, tu edad es: "+edadJugador);
        }

        input.close();
    }
}
