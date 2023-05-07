package semana4_1_problema3;
class Automotor{
    //atrivutos
    private String cedulaDueno;
    private long anioFabricante;
    private double valorVehiculo;
    private double valorMatricula;
    private long anioActual;
    //constructores
    public Automotor(String cedulaDueno, long anioFabricante, long anioActual, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.anioFabricante = anioFabricante;
        this.anioActual = anioActual;
        this.valorVehiculo = valorVehiculo;
    }
    //operaciones 
    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }
    public void setAnioFabricante(long anioFabricante) {
        this.anioFabricante = anioFabricante;
    }
    public void setAnioActual(long anioActual) {
        this.anioActual = anioActual;
    }
    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    public void calcularValorMatricula() {
        this.valorMatricula = (((0.002/100)*this.valorVehiculo) *(this.anioActual-this.anioFabricante));
    }
    public String getCedulaDueno() {
        return this.cedulaDueno;
    }
    public long getAnioFabricante() {
        return this.anioFabricante;
    }
    public long getAnioActual() {
        return this.anioActual;
    }
    public double getValorVehiculo() {
        return this.valorVehiculo;
    }
    public double getValorMatricula() {
        return this.valorMatricula;
    }
        //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   DATOS SOBRE AUTOMOTOR
                                   Cedula dueño: %s 
                                   Año de Fabricacion: %d
                                   Año Actual: %d
                                   Valor de Vehiculo: %.2f
                                   Valor de Matricula: %.2f
                                   """
                ,this.getCedulaDueno()
                ,this.getAnioFabricante()
                ,this.getAnioActual()
                ,this.getValorVehiculo()
                ,this.getValorMatricula());
        return msj;
    }
}
public class Semana4_1_Problema3 {
    public static void main(String[] args) {
        Automotor automotor2 = new Automotor("1950060796",2005,2023,20220);
        automotor2.calcularValorMatricula();
        System.out.print(automotor2);
    }
}
