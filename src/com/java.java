package com;

public class java {

    public static void main(String[] args) {

        // Lambdas sin argumentos
        sinArgumentos s1 = () -> System.out.println("esto es s1");
        sinArgumentos s2 = () -> System.out.println("esto es s2");

        s1.ejecutar();
        s2.ejecutar();

        // Lambdas con un argumento
        unArgumento();

        // Lambdas con dos argumentos y retorno
        dosArgumento();

        // Bloque con dos argumentos
        DosArgumentosBloque();
    }

    public static void unArgumento() {
        Unargumento s1 = a -> System.out.println("esto es " + a);
        s1.imprimir("hola mundo");

        Unargumento s2 = prueba -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(prueba);
            }
        };
        s2.imprimir("cambio para prueba");
    }

    public static void dosArgumento() {
        DosArguemntosTipo sumar = (x1, y2) -> x1 + y2;
        System.out.println("Suma: " + sumar.operar(5, 10));
    }

    public static void DosArgumentosBloque() {
        DosArgumentosBloque sumar = (x, y) -> {
            System.out.println("la x es: " + x);
            System.out.println("la y es: " + y);
            return x + y;
        };

        int resultado = sumar.operar(7, 3);
        System.out.println("Resultado del bloque: " + resultado);
    }
}


