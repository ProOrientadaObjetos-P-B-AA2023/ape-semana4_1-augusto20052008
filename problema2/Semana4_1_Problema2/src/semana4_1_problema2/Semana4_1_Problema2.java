package semana4_1_problema2;
class Profesor{
    //atrivutos
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    //constructores
    public Profesor(){}
    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }
    //operadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void calcularSueldoTotal(){
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * 0.2);
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public double getSueldoTotal() {
        return this.sueldoTotal;
    }
    public String getCedula() {
        return this.cedula;
    }
    public String toString(){
        String msj = String.format("""
                                   DATOS SOBRE PROFESOR
                                   Nombre: %s 
                                   Apellido: %s 
                                   Sueldo Basico: %f
                                   SueldoTotal: %f
                                   Cedula: %s
                                   """
                ,this.getNombre()
                ,this.getApellido()
                ,this.getSueldoBasico()
                ,this.getSueldoTotal()
                ,this.getCedula());
        return msj;
    }
}
public class Semana4_1_Problema2 {
    public static void main(String[] args) {
        Profesor profesor2 = new Profesor("Austo ","Piedra",2000,"1950060794");
        profesor2.calcularSueldoTotal();
        System.out.print(profesor2);
    }
}
