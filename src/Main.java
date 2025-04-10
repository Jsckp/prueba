import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> edades = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("=== Gestor de edades ===");

        do {
            System.out.println("\nOpciones disponibles:");
            System.out.println("1. Agregar edad al inicio");
            System.out.println("2. Agregar edad al final");
            System.out.println("3. Mostrar primera edad y eliminarla");
            System.out.println("4. Mostrar última edad y eliminarla");
            System.out.println("5. Mostrar todas las edades");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la edad a agregar al inicio: ");
                    int edadInicio = scanner.nextInt();
                    if (edadInicio > 0) {
                        edades.addFirst(edadInicio);
                        System.out.println("Edad agregada al inicio.");
                    } else {
                        System.out.println("Edad no válida. Debe ser mayor que 0.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la edad a agregar al final: ");
                    int edadFinal = scanner.nextInt();
                    if (edadFinal > 0) {
                        edades.addLast(edadFinal);
                        System.out.println("Edad agregada al final.");
                    } else {
                        System.out.println("Edad no válida. Debe ser mayor que 0.");
                    }
                    break;

                case 3:
                    if (!edades.isEmpty()) {
                        Integer first = edades.poll(); // Equivalente a pollFirst()
                        System.out.println("Primera edad eliminada: " + first);
                    } else {
                        System.out.println("No hay edades registradas.");
                    }
                    break;

                case 4:
                    if (!edades.isEmpty()) {
                        Integer last = edades.pollLast();
                        System.out.println("Última edad eliminada: " + last);
                    } else {
                        System.out.println("No hay edades registradas.");
                    }
                    break;

                case 5:
                    if (!edades.isEmpty()) {
                        System.out.println("\nEdades registradas:");
                        for (int edad : edades) {
                            System.out.print(edad + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("No hay edades registradas.");
                    }
                    break;


                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
//holaaa
