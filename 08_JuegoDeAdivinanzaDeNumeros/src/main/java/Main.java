import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JuegoAdivinanza juegoAdivinanza = new JuegoAdivinanza();
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Introduce un numero del 1 al 100: ");
        int numero = 0;

        while (!juegoAdivinanza.comprobarNumero(numero)) {
            System.out.print("Introduce un numero del 1 al 100: ");
            numero = scanner.nextInt();
            if (juegoAdivinanza.comprobarNumero(numero)) {
                System.out.print("Has adivinado el numero: ");
            }
            if (numero < juegoAdivinanza.getNumeroAleatorio()) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }
        }
        if (juegoAdivinanza.comprobarNumero(numero)) {
            System.out.print("Has adivinado el numero: ");



        }

    }
}
