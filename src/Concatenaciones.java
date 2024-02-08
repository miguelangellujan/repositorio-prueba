public class Concatenaciones {
    public static void testConcatenar(int pTiempo, String pCadena) {
        System.out.println("Ejecutando testConcatenar...");
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (pTiempo * 1000);
        int concatenaciones = 0;

        while (System.currentTimeMillis() < endTime) {
            concatenaciones++;
            System.out.printf("%8d, %4d segundos\n", concatenaciones, (System.currentTimeMillis() - startTime) / 1000);
            String resultado = pCadena + concatenaciones;
        }
    }
    public static void testLista(int pTiempo, String pCadena) {
        System.out.println("Ejecutando testLista...");

        long startTime = System.currentTimeMillis();
        long endTime = startTime + (pTiempo * 1000);
        int concatenaciones = 0;

        StringBuilder builder = new StringBuilder();

        while (System.currentTimeMillis() < endTime) {
            concatenaciones++;
            System.out.printf("%8d, %4d segundos\n", concatenaciones, (System.currentTimeMillis() - startTime) / 1000);
            builder.append(pCadena).append(concatenaciones);
        }
    }

    public static void main(String[] args) {
        int tiempo = 10;
        String cadena = "Hola";

        // primer método
        System.out.println("\n Test usando operador +");
        testConcatenar(tiempo, cadena);

        // segundo método
        System.out.println("\n Test usando StringBuilder ");
        testLista(tiempo, cadena);
    }
}