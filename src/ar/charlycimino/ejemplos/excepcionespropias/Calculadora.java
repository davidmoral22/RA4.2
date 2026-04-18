
package ar.charlycimino.ejemplos.excepcionespropias;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Calculadora {
    public int factorial(final int num) {
        if (num < 0) {
            // Dividimos el texto en dos líneas
            throw new ArithmeticException("No se puede calcular el "
                    + "factorial de un número negativo");
        }

        if (num > 12) {
            // Dividimos el texto para no superar los 80 caracteres
            throw new IntegerOverflowException("Por limitaciones técnicas, no se "
                    + "puede calcular el factorial de un entero mayor que 12");
        }

        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
