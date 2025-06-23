import java.util.Random;

/**
 * Ejercicio 8: Juego de Adivinanza de Números.
 * Enunciado: Crea una clase JuegoAdivinanza que genere un número aleatorio entre 1 y 100. El juego debe pedir al
 * usuario que adivine el número. Utiliza un bucle do-while para que el juego continúe hasta que el usuario adivine
 * correctamente. Proporciona pistas ("mayor" o "menor") después de cada intento incorrecto.
 */

public class JuegoAdivinanza {

    private int numeroAleatorio;

    public JuegoAdivinanza() {
        this.numeroAleatorio = (int) (Math.random() * 100) + 1;
        //this.numeroAleatorio = new Random().nextInt(100);
    }

    public boolean comprobarNumero(int numero) {

        return this.numeroAleatorio == numero;
    }

    public int getNumeroAleatorio() {
        return this.numeroAleatorio;
    }
}
