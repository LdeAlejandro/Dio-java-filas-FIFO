package dio;

public class Main {

    public static void main(String[] args) {

        Fila<String> fila = new Fila();

        fila.enqueue("Primeiro");
        fila.enqueue("Segundo");
        fila.enqueue("Terceiro");
        fila.enqueue("Quarto");
        fila.enqueue("Quinto");

        System.out.println(fila);

        System.out.println(fila.first());

        System.out.println(fila.dequeue());

        System.out.println(fila.first());

        System.out.println(fila);

    }
}
