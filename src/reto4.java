import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        //Declarando variables
        String nombreJugador;
        //la variable "numeroGanador" sacara un numero aleatoriamente en un rango de 1 a 3
        int edadJugador, eleccionMaquina = (int)(Math.random()*2+1), eleccionJugador; 


        //Creación de objetos | Instanciar clases
        Scanner input = new Scanner(System.in);
        
        //Solicitar los datos
        System.out.println("Bienvenido al juego de piedra, papel o tijera.");
        System.out.print("Por favor, digite su nombre completo: ");
        nombreJugador = input.next();
        System.out.print(nombreJugador+", ahora, digite su edad: ");
        edadJugador = input.nextInt();

        //Operaciones
        if (edadJugador >= 18 && edadJugador <= 100) {
            System.out.println("Ya puedes jugar, elige alguna de las opciones: \n1. Piedra. \n2. Papel. \n3. Tijera.");
            eleccionJugador = input.nextInt();

            switch (eleccionJugador) {
                case 1:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Piedra. El juego termina en empate, ¿qué casualidad, no?");
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Papel. La máquina ha ganado, se burla de ti en silencio. 🤣");
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Tijera. Has ganado, ¡vaya suerte! ¿Por qué no lo intentas de nuevo?");
                    }
                    break;
                case 2:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Piedra. Has ganado, ¡vaya suerte! ¿Por qué no lo intentas de nuevo?");
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Papel. El juego termina en empate, ¿qué casualidad, no?");
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Tijera. La máquina ha ganado, se burla de ti en silencio. 🤣");
                    }
                    break;
                case 3:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Piedra. La máquina ha ganado, se burla de ti en silencio. 🤣");
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Papel. Has ganado, ¡vaya suerte! ¿Por qué no lo intentas de nuevo?");
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Tijera. El juego termina en empate, ¿qué casualidad, no?");
                    }
                    break;
            
                default:
                    System.out.println("Has elegido un número mayor o menos al permitido, vuelve a intentarlo, siguiendo las instrucciones.");
                    break;
            }
                        
            System.out.println("Output: el número al azar de la maquina en está ejecución fue: "+eleccionMaquina);

        } else {
            System.out.println("No tienes la edad permitida (mas de 18 y menos que 100) o digitaste un número erroneo, tu edad es: "+edadJugador);
        }

        input.close();
    }
}
