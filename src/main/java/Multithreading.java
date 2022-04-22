import java.util.Scanner;

public class Multithreading {

    public static void main(String[] args) {

        System.out.println("Current thread: " + java.lang.Thread.currentThread().getName());

        Scanner teclado = new Scanner(System.in);
        Lista list = new Lista();
        Threads r = new Threads();

        java.lang.Thread thread1 = new java.lang.Thread(r);
        java.lang.Thread thread2 = new java.lang.Thread(r);

        System.out.println("Ingrese la cantidad de numeros a sacar factorial: ");
        int cantNums = teclado.nextInt();

        for (int i = 1; i < cantNums+1; i++) {
            System.out.println("Introduzca num " + i + ": ");
            list.setLista(teclado.nextInt());
        }

        thread1.start();
        thread2.start();

        System.out.println("Current thread: " + java.lang.Thread.currentThread().getName());

    }
}
