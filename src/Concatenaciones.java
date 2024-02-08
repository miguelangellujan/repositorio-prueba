public class Concatenaciones {
    public static void testConcatenar(int pTiempo, String pCadena) {
        System.out.println("Ejecutando testConcatenar...");
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (pTiempo * 1000);
        int concatenaciones = 0;

        while (System.currentTimeMillis() < endTime) {
            concatenaciones++;
            System.out.printf("%8d, %4d segundos\n", concatenaciones, (System.currentTimeMillis() - startTime) / 1000);
            // Concatenar cadena con el operador +
            String resultado = pCadena + concatenaciones;
        }
    }
    // Método para realizar la concatenación usando StringBuilder
    public static void testLista(int pTiempo, String pCadena) {
        System.out.println("Ejecutando testLista...");

        long startTime = System.currentTimeMillis();
        long endTime = startTime + (pTiempo * 1000);
        int concatenaciones = 0;

        // Usar StringBuilder para realizar la concatenación eficientemente
        StringBuilder builder = new StringBuilder();

        while (System.currentTimeMillis() < endTime) {
            concatenaciones++;
            System.out.printf("%8d, %4d segundos\n", concatenaciones, (System.currentTimeMillis() - startTime) / 1000);
            // Concatenar cadena usando StringBuilder
            builder.append(pCadena).append(concatenaciones);
        }
    }

    public static void main(String[] args) {
        int tiempo = 5; // Ejecutar durante 5 segundos
        String cadena = "Hola";

        // Ejecutar el primer método
        System.out.println("\n*** Test usando operador + ***");
        testConcatenar(tiempo, cadena);

        // Ejecutar el segundo método
        System.out.println("\n*** Test usando StringBuilder ***");
        testLista(tiempo, cadena);
    }
}