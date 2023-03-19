import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre1, nombre2;
        int res1, res2; /* RESULTADO DE DADOS */
        int vida1 = 3, vida2 = 3; /* CANTIDAD DE VIDAS */
        int i = 0;        

        // Creación de objetos
        Scanner input = new Scanner(System.in);

        // Solicitud de datos
        System.out.println("Bienvenidos al juego de los dados, por favor digiten sus nombres.");
        System.out.println("Nombre jugador 1:");
        nombre1 = input.next();
        System.out.println("Nombre jugador 2:");
        nombre2 = input.next();

        // Operaciones
        do {
            System.out.println("====== LOS DADOS SON TIRADOS AL AIRE ======");
            res1 = (int) (Math.random() * 6 + 1);
            res2 = (int) (Math.random() * 6 + 1);
            System.out.println("El dado de " + nombre1 + " cae al suelo y muestra el número " + res1);
            System.out.println("El dado de " + nombre2 + " cae al suelo y muestra el número " + res2);

            if (res1 > res2) {
                System.out.println(
                        nombre1 + " ha sacado mayor número y le ha ganado a " + nombre2 + ", quien pierde una vida.");
                vida2--;
            } else if (res2 > res1) {
                System.out.println(
                        nombre2 + " ha sacado mayor número y le ha ganado a " + nombre1 + ", quien pierde una vida.");
                vida1--;
            } else {
                System.out.println("Ambos dados caen en el mismo número por lo que no hay perdedor.");
            }
            System.out.println("============ VIDAS =================");
            System.out.println(nombre1 + " lleva un total de " + vida1 + " vidas.");
            System.out.println(nombre2 + " lleva un total de " + vida2 + " vidas.");

            if (vida1 == 0 || vida2 == 0) {
                i = 1;
            }

            System.out.println();
            System.out.println();
            System.out.println();
        } while (i == 0);

        if (vida1 == 0) {
            System.out.println(nombre1 + " ha perdido la partida con " + vida1 + " vidas, " + nombre2
                    + " gana la partida con " + vida2 + " vidas.");
        } else {
            System.out.println(nombre2 + " ha perdido la partida con " + vida2 + " vidas, " + nombre1
                    + " gana la partida con " + vida1 + " vidas.");
        }

        System.out.println("El programa ha terminado.");

        input.close();
    }
}