import java. util. *;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Ingresa el tamaño del arreglo: "); // Tamaño del arreglo
        int tamano = scanner.nextInt();


        int[] arreglo = new int[tamano];

        System.out.print("Numero a comprobar: ");

        int x = scanner.nextInt(); // Numero x a comprobar

        System.out.println("Suma buscada: " + x);

        System.out.println("Ingresa los valores para el arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        scanner.close();

        int[] sumaPrefija = new int[tamano];
        sumaPrefija[0] = arreglo[0];
        for (int i = 1; i < tamano; i++) {
            sumaPrefija[i] = sumaPrefija[i - 1] + arreglo[i];
        }

        System.out.println("Suma prefija del arreglo:");
        for (int valor : sumaPrefija) {
            System.out.println(valor);
        }

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] + arreglo[j] == x){
                    System.out.println("Si");
                    return;

                }else System.out.println("No");

            }

        }

    }

}
