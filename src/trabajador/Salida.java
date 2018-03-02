package trabajador;

import javax.swing.JOptionPane;

public class Salida {
    public static char resp = 'S';
    public static void main(String[] args) {
        Empleado emp = new Empleado();
	       while (Character.toUpperCase(resp) == 'S'){
                   emp.Leerdatos();
                   emp.calcularPagoHoraExtra();
	           emp.calcularSalario();
	           emp.imprimirNomina();
	           resp=JOptionPane.showInputDialog("Desea procesar otro cliente s/n:  ").charAt(0);
	      }
               System.exit(0);        
    }    
}
