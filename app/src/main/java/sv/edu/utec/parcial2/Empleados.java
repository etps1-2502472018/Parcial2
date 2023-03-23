package sv.edu.utec.parcial2;

public class Empleados {
    private String empleado,cargo,compañia;

    public Empleados(String empleado, String cargo, String compañia) {
        this.empleado=empleado;
        this.cargo=cargo;
        this.compañia=compañia;
    }

    public String getEmpleado() {
        return empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCompañia() {
        return compañia;
    }

}
