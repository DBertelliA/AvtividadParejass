
package ar.charlycimino.ejemplos.excepcionespropias;

/**
 * @author Charly Cimino
 * Aprendé más Java en mi canal: <a href="https://www.youtube.com/c/CharlyCimino"></a>
 * Encontrá más código en mi repo de GitHub: <a href="https://github.com/CharlyCimino"></a>
 */
public class Calculadora {
    public int factorial (int num) {
        if (num < 0) {
            throw new ArithmeticException("No se puede calcular el factorial de un número negativo");
        }
        if (num > 12) {
            throw new IntegerOverflowException("Por limitaciones técnicas, no se puede calcular el factorial de un entero mayor que 12");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
