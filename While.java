import javax.swing.JOptionPane;

public class While {            
    public void SolicitarInfo() {
        int opcion;
        do {
            String input = JOptionPane.showInputDialog(null, "Elija la opción que desea realizar:\n1: Calcular Factorial\n2: Determinar si es par\n3: Salir");
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    String numeroStr = JOptionPane.showInputDialog(null, "Ingrese el número al que le desea calcular el factorial:");
                    int numeroEntrada = Integer.parseInt(numeroStr);
                    int factorial = 1;
                    for (int i = 1; i <= numeroEntrada; i++) {
                        factorial *= i;
                    }
                    JOptionPane.showMessageDialog(null, factorial + " es el factorial de " + numeroEntrada);
                    break;

                case 2:
                    String numeroParStr = JOptionPane.showInputDialog(null, "Ingrese el número que quiere verificar si es par:");
                    int numeroPar = Integer.parseInt(numeroParStr);
                    if ((numeroPar % 2) == 0) {
                        JOptionPane.showMessageDialog(null, numeroPar + " es par");
                    } else {
                        JOptionPane.showMessageDialog(null, numeroPar + " es impar");
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 3);
    }
}
