package Snake;
import java.util.*;

public class snake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 10;
        char[][] tablero = new char[TAM][TAM];

        // Representamos el cuerpo como lista de coordenadas (X, Y)
        List<int[]> cuerpo = new ArrayList<>();
        cuerpo.add(new int[]{TAM / 2, TAM / 2}); // cabeza inicial en el centro

        // Posición inicial de la comida
        Random rand = new Random();
        int comidaX = rand.nextInt(TAM);
        int comidaY = rand.nextInt(TAM);

        boolean juegoActivo = true;
        int puntuacion = 0;

        while (juegoActivo) {
            // Limpiar tablero
            for (int i = 0; i < TAM; i++) {
                for (int j = 0; j < TAM; j++) {
                    tablero[i][j] = '.';
                }
            }

            // Colocar comida
            tablero[comidaY][comidaX] = '*';

            // Dibujar serpiente
            for (int i = 0; i < cuerpo.size(); i++) {
                int[] parte = cuerpo.get(i);
                tablero[parte[1]][parte[0]] = (i == 0) ? 'O' : 'o';
            }

            // Mostrar tablero
            System.out.println("\nPuntuación: " + puntuacion);
            for (int i = 0; i < TAM; i++) {
                for (int j = 0; j < TAM; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir movimiento
            System.out.print("Mover (W/A/S/D): ");
            String entrada = sc.nextLine().toUpperCase();

            // Posición actual de la cabeza
            int[] cabeza = cuerpo.get(0);
            int nuevaX = cabeza[0];
            int nuevaY = cabeza[1];

            switch (entrada) {
                case "W": nuevaY--; break;
                case "S": nuevaY++; break;
                case "A": nuevaX--; break;
                case "D": nuevaX++; break;
                default:
                    System.out.println("Movimiento inválido, usa W A S D.");
                    continue;
            }

            // Verificar colisiones con los bordes
            if (nuevaX < 0 || nuevaX >= TAM || nuevaY < 0 || nuevaY >= TAM) {
                System.out.println("¡Has chocado con el borde! Fin del juego.");
                break;
            }

            // Verificar colisión con el cuerpo
            for (int i = 0; i < cuerpo.size(); i++) {
                int[] parte = cuerpo.get(i);
                if (parte[0] == nuevaX && parte[1] == nuevaY) {
                    System.out.println("¡Te has mordido! Fin del juego.");
                    juegoActivo = false;
                    break;
                }
            }
            if (!juegoActivo) break;

            // Añadir nueva cabeza al inicio
            cuerpo.add(0, new int[]{nuevaX, nuevaY});

            // Comprobar si comió la comida
            if (nuevaX == comidaX && nuevaY == comidaY) {
                puntuacion++;
                // Nueva comida en lugar vacío
                do {
                    comidaX = rand.nextInt(TAM);
                    comidaY = rand.nextInt(TAM);
                } while (ocupaSerpiente(cuerpo, comidaX, comidaY));
            } else {
                // Eliminar última parte (mover sin crecer)
                cuerpo.remove(cuerpo.size() - 1);
            }
        }

        System.out.println("Juego terminado. Puntuación final: " + puntuacion);
        sc.close();
    }

    // Función auxiliar: comprueba si la serpiente ocupa una posición
    private static boolean ocupaSerpiente(List<int[]> cuerpo, int x, int y) {
        for (int[] parte : cuerpo) {
            if (parte[0] == x && parte[1] == y) return true;
        }
        return false;
    }
}
