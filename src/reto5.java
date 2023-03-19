import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //Declaración de las variables
        int cantidadVidas = (int)(Math.random()*10+1), eleccionJugador, eleccionMaquina = (int)(Math.random()*3+1);

        //Creación de los objetos.
        Scanner input = new Scanner(System.in);

        //Solicitud de los datos y operaciones
        System.out.println("Bienvenido al juego de piedra, papel o tijera, jugarás contra la maquina.");
        do {
            System.out.println("Tienes un total de "+cantidadVidas+" vidas, elige alguna de las opciones: \n1. Piedra. \n2. Papel. \n3. Tijera.");
            eleccionJugador = input.nextInt();

            switch (eleccionJugador) {
                case 1:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Piedra. El juego termina en empate y pierdes una vida.");
                        cantidadVidas--;
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Papel. La máquina ha ganado por lo que pierdes una vida.");
                        cantidadVidas--;
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Tijera. Has ganado, y conservas la vida.");
                    }
                    break;
                case 2:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Piedra. Has ganado, y conservas la vida.");
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Papel. El juego termina en empate por lo que pierdes una vida.");
                        cantidadVidas--;
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Tijera. La máquina ha ganado por lo que pierdes una vida.");
                        cantidadVidas--;
                    }
                    break;
                case 3:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Piedra. La máquina ha ganado por lo que pierdes una vida.");
                        cantidadVidas--;
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Papel. Has ganado, y conservas la vida.");
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Tijera. El juego termina en empate por lo que pierdes una vida.");
                        cantidadVidas--;
                    }
                    break;
            
                default:
                    System.out.println("Has elegido un número mayor o menor al permitido, vuelve a intentarlo, siguiendo las instrucciones.");
                    break;
            }
        } while (cantidadVidas != 0);

        System.out.println("Se te han acabado las vidas, el juego ha terminado. ("+cantidadVidas+")");

        input.close();

    }
}
