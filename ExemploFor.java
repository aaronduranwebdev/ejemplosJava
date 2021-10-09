package exemplofor;

/**
 * @author a21aarondn
 */
public class ExemploFor {

    public static void main(String[] args) {
        byte proba = 4;
        switch (proba) {
            case 1: // Contador
                for (int i = 10; i >= 0; i--) {
                    System.out.println(i);
                }
                break;
            case 2: // Infinito
                for (int i = 1; i > 0; i++) {
                    System.out.println(i);
                }
                break;
            case 3: // Non se cumpre a condición
                for (int i = 0; i < 0; i++) {
                    System.out.println("Non se cumpre");
                }
                break;
            case 4: // Potencias de 2 ata 128
                for (int i = 1; i <= 128; i*=2) {
                    System.out.println(i);
                }
                break;
            default:
                System.out.println("Sen bucle");
        }

    }

}
