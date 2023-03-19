import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        //Declaración de variables
        String entrada;
        final String palabra = "microfutbol";
        int intentos = 5, i=0;

        //Instanciar clases o crear objetos
        Scanner input = new Scanner(System.in);

        System.out.println("==== DESCUBRE LA PALABRA ====");
        System.out.println("Bienvenido, deberás digitar UNA sola palabra y así podrás ganar el juego.");
        System.out.println("Pista: Es una rama de algún deporte, tendrás "+intentos+" intentos, la palabra posee 11 caracteres.");
        System.out.println("Pista: Digite la palabra SOLO en minusculas.");
        System.out.println("======================");        

        //Solicitud de los datos
        while (i == 0) {
            System.out.println("======================");
            System.out.print("Digite la palabra: ");
            entrada = input.next();            

            if (entrada.length() == 11) {
                if (palabra.equals(entrada)) {
                    System.out.println("Has descubierto la palabra "+palabra+", has ganado el juego felicidades.");
                    i = 1;
                } else {
                    if (intentos >= 4 && intentos <= 5) {
                        System.out.println("No has acertado, pierdes una oportunidad.");                    
                        intentos--;  
                        System.out.println("Te quedan "+intentos+" más.");
                    } 
                }
                if (intentos == 3) {
                    System.out.println("No has acertado, pierdes una oportunidad.");
                    System.out.println("Pista: este deporte se juega con el píe.");                                            
                    intentos--;
                    System.out.println("Te quedan "+intentos+" más.");
                } else if (intentos == 2) {
                    System.out.println("No has acertado, pierdes una oportunidad.");
                    System.out.println("Pista: este deporte se juega con el píe y en asfalto.");
                    intentos--;
                    System.out.println("Te quedan "+intentos+" más.");
                }
            } else {
                System.out.println("Has digitado una palabra con "+entrada.length()+" caracteres, recuerda que la palabra posee 11.");
                intentos--;
                System.out.println("Pierdes una oportunidad, te quedan "+intentos+" más.");
            }

            if (intentos == 0) {
                System.out.println("Te has quedado sin intentos, has perdido esta vez.");
                i = 1;
            }
        }

        System.out.println("El programa ha terminado.");

        input.close();        
    }
}
