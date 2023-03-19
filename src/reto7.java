import java.util.Scanner;

public class reto7 {
    public static void main(String[] args){
        String nombre, correo, psw, direccion;
        int telefono, contador = 0, des = 1;
        
        //Creación del objeto
        Scanner input = new Scanner(System.in);
        

        System.out.println("Bienvenido al formulario de registro virtual.");
        while (des == 1) {
            if (contador == 0) {
                System.out.println("* No llevas ningún registro hecho aún.");
            } else {
                System.out.println("* Llevas "+contador+" registros hechos.");
            }
            System.out.println("Digite el nombre del usuario");
            nombre = input.next();

            System.out.println("Digite el correo del usuario");
            correo = input.next();

            System.out.println("Digite la contraseña del usuario");
            psw = input.next();

            System.out.println("Digite el dirección de domicilio del usuario");
            direccion = input.next();

            System.out.println("Digite el número telefonico del usuario");
            telefono = input.nextInt();

            System.out.println("===============");
            System.out.println("Has ingresado los siguientes datos: \nNombre: "+nombre+"\nCorreo: "+correo);
            System.out.println("Contraseña: "+psw+"\nDireccion: "+direccion+"\nTeléfono: "+telefono);
            System.out.println("===============");
            contador++;

            System.out.println("¿Desea registrar otro usuario? \n1) SI. \n2) NO.");
            des = input.nextInt();
        }

        System.out.println("Has realizado un total de "+contador+" inserciones. El programa ha acabado.");
        input.close();
    }
}
