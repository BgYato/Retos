import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        //Declarar variables
        String nombreMedico, nombreBebe, nombreVacuna, eps;        
        int mesesBebe = 0;
        double pesoBebe = 0, dosis = 0;

        //instanciar clases, crear objetos.
        Scanner input = new Scanner(System.in);

        //Solicitar datos
        System.out.print("Buenas al servicio de vacunas al día, te las ponemos gratis, indiquenos el nombre del médico: ");
        nombreMedico = input.next();
        System.out.println(nombreMedico+" digite ahora el nombre del bebé: ");
        nombreBebe = input.next();
        System.out.println("Digite ahora la EPS a la que pertenece el bebé: ");
        eps = input.next();
        System.out.println("Ahora, registre la vacuna necesaría para el bebé: ");
        nombreVacuna = input.next();

        System.out.println("Para conocer la dosis necesaria, necesitamos saber primero cuantos meses tiene el bebé: ");
        mesesBebe = input.nextInt();
        System.out.println("Por último, digite el peso del bebé: ");
        pesoBebe = input.nextDouble();

        //operaciones
        dosis = (pesoBebe + 15 / mesesBebe + 15) * 10;

        //resultado
        System.out.println("Datos recolectados: \nNombre del bebé: "+nombreBebe+". \nMeses del bebe: "+mesesBebe+" meses. Peso: "+pesoBebe+" kilogramos.");
        System.out.println("EPS: "+eps+". \nVacuna: "+nombreVacuna);
        System.out.println(nombreMedico+", para poder suministrar la vacuna, deberás darle la siguiente cantidad de dosis: "+dosis+" miligramos");

        input.close();
    }
}
