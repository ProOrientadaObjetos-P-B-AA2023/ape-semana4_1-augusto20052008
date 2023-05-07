package semana4_1_problema4;
class cheque{
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    public cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }
    public void setCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public void setBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void calcularComisionBanco() {
        this.comisionBanco = this.valorCheque*(0.003/100);
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    public String getNombreBanco() {
        return this.nombreBanco;
    }
    public double getValorCheque() {
        return this.valorCheque;
    }
    public double getcalcularComisionBanco() {
        return this.comisionBanco;
    }
    //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   DATOS DE IDENTIDAD FINANCIERA
                                   Nombre del Cliente: %s 
                                   Nombre del Banco: %s 
                                   Valor del Cheque: %.2f
                                   Año Actual: %.2f
                                   """
                ,this.getNombreCliente()
                ,this.getNombreBanco()
                ,this.getValorCheque()
                ,this.getcalcularComisionBanco());
        return msj;
    }
}
public class Semana4_1_Problema4 {
    public static void main(String[] args) {
        cheque cheque2 = new cheque("Augusto Valentino Davila Robles","Banco de Loja",20000);
        cheque2.calcularComisionBanco();
        System.out.print(cheque2);
        
    }
    
}
