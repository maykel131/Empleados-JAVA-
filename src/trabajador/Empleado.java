package trabajador;



import javax.swing.JOptionPane;



public class Empleado {
    public final int horaSem = 40;
    public final float pagoHoras = 250, porc = 1.45f;
    public final String[] opcion= {"Seleccione","Soltero","Casado","Divorciado","Viudo"};
    public String nombre, dpto, codigo,edoCivil;
    public float horasTrab;
    public float salario, pagoExtra, horasExtras;

    

    public float calcularSalario() {
        if (horasTrab <= horaSem) {
            salario = (horasTrab * pagoHoras);
        } else {
            salario = horasExtras * pagoExtra + horaSem * pagoHoras;
        }
        return (salario);
    }

    public void calcularPagoHoraExtra() {
        if (horasTrab >horaSem) {
            pagoExtra = (pagoHoras * porc);
            horasExtras = horasTrab - horaSem;
        }
    }

    public void Leerdatos() {
        codigo = JOptionPane.showInputDialog("Ingrese el Código:");
        nombre = JOptionPane.showInputDialog("Ingrese el Nombre: ");
        dpto = JOptionPane.showInputDialog("Ingrese el  Departamento");
        edoCivil= (String)JOptionPane.showInputDialog(null,"Seleccione el Estado Civil", "Entrada", 3, null, opcion, null);
        horasTrab = Float.parseFloat(JOptionPane.showInputDialog("Ingrese las Horas Trabajadas"));
    }

    public void imprimirNomina() {
        JOptionPane.showMessageDialog(null, "\nCodigo: " + getCodigo() + "\nNombre: " + getNombre() +"\nEstdo Civil: " + getEdoCivil()+
                "\nDepartamento: " + getDpto() + "\nHoras Trabajada: " + getHorasTrab() + "\nPago por Horas: " + pagoHoras + "\nHoras Extra: " + horasExtras
                + "\nPagos Extra: " + pagoExtra + "\nSalario: " + salario, "NOMINA DE LOS EMPLEADOS", JOptionPane.DEFAULT_OPTION);
    }

    public Empleado() {
    }

    public String getEdoCivil() {
        return edoCivil;
    }

    public void setEdoCivil(String edoCivil) {
        this.edoCivil = edoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

}
