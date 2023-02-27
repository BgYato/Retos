public class reto1 {
    public static void main(String[] args) {
        //Declarar variables
        double gradosF = 0, gradosK = 0, gradosC = 350;

        //Solicitud de datos
        System.out.println("Hola abuela, te ayudaré a preparar tu torta.");
        System.out.println("Entonces, te ayudaremos a descubrir la cantidad de grados que se necesitan, tu horno muestra los grados en centigrados.");
        System.out.println("Grados necesarios: 350 °F o °K + 100.\nGrados que se muestran en el horno: Celsius "+gradosC+".\nFormula: °K + 100 | °F + 100");

        //Operacion
        //Formula para hallar grados Fahrenheit con grados Celsius
        gradosF = (gradosC * 1.8) + 32;
        //Formula para hallar grados Kelvin con grados Fahrenheit ((K = y°F + 459.67) x 5/9)
        gradosK = (gradosF + 459.67) * 5/9;

        System.out.println("====================================================");
        System.out.println("El resultado de la conversión, de grados Celsius a Fahrenheit es: "+gradosF+". Y de grados Celsius a Kelvin es: "+gradosK);
        //Suma de los grados
        gradosF = gradosF + 100;
        gradosK = gradosK + 100;

        System.out.println("Pero para tu receta, necesitarás estos grados: \nFarenheit: "+gradosF+". \nKelvin: "+gradosK);
    }
}
