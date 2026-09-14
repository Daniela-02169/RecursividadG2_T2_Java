package recursividad;

import java.util.Scanner;

public class Recursividad {

    // Ejercicio 1: calcular factorial
    public static int calcularFactorial(int num) {

        if (num == 1) {
            return 1;
        }

        return num * calcularFactorial(num - 1);
    }

    // Ejercicio 2: contar vocales
    public static int vocales(String texto) {

        if (texto.length() == 0) {
            return 0;
        }

        char letra = texto.charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i'
                || letra == 'o' || letra == 'u'
                || letra == 'A' || letra == 'E' || letra == 'I'
                || letra == 'O' || letra == 'U') {

            return 1 + vocales(texto.substring(1));

        } else {
            return vocales(texto.substring(1));
        }
    }

    // Ejercicio 3: sumar los digitos de un numero
    public static int sumaDigitos(int numero) {

        if (numero < 10) {
            return numero;
        }

        return numero % 10 + sumaDigitos(numero / 10);
    }

    // Ejercicio 4: sumar los primeros n numeros
    public static int suma(int n) {

        if (n == 1) {
            return 1;
        }

        return suma(n - 1) + n;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("METODOS RECURSIVOS");

        // Ejercicio 1: factorial
        System.out.println("\n FACTORIAL ");

        System.out.print("Ingresa un numero: ");
        int numeroFactorial = entrada.nextInt();

        int resultadoFactorial = calcularFactorial(numeroFactorial);

        System.out.println("Factorial de " + numeroFactorial + ": "
                + resultadoFactorial);

        entrada.nextLine();

        // Ejercicio 2: vocales
        System.out.println("\n CONTAR VOCALES ");

        System.out.print("Escribe una cadena: ");
        String texto = entrada.nextLine();

        int cantidadVocales = vocales(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Cantidad de vocales: " + cantidadVocales);

        // Ejercicio 3: mayor suma de digitos
        System.out.println("\n MAYOR SUMA DE DIGITOS ");

        System.out.print("Cuantos numeros deseas ingresar: ");
        int cantidad = entrada.nextInt();

        int mayorSuma = 0;
        int numeroMayor = 0;

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Numero " + i + ": ");
            int numero = entrada.nextInt();

            int resultado = sumaDigitos(numero);

            System.out.println("Suma de sus digitos: " + resultado);

            if (resultado > mayorSuma) {
                mayorSuma = resultado;
                numeroMayor = numero;
            }
        }

        System.out.println("Numero con mayor suma de digitos: "
                + numeroMayor);

        System.out.println("Mayor suma de digitos: " + mayorSuma);

        // Ejercicio 4: sumar primeros n numeros
        System.out.println("\n SUMAR PRIMEROS N NUMEROS ");

        System.out.print("Ingresa el valor de n: ");
        int n = entrada.nextInt();

        int resultadoSuma = suma(n);

        System.out.println("N = " + n);
        System.out.println("Suma: " + resultadoSuma);

        entrada.close();
    }
}