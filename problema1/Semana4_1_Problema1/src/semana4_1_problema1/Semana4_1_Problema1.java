package semana4_1_problema1;
class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void calcularPromedio(){
        this.promedio = (this.nota1+this.nota2+this.nota3)/3;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getNota1() {
        return this.nota1;
    }
    public double getNota2() {
        return this.nota2;
    }
    public double getNota3() {
        return this.nota3;
    }
    public double getCalcularPromedio() {
        return this.promedio;
    }
    public String toString() {
        return """
               Estudiante 
               Nombre :""" + nombre 
                + "\nNota1: " + nota1 
                + "\nNota2: " + nota2 
                + "\nNota3: " + nota3 
                + "\nPromedio: " + promedio;
    }
}
public class Semana4_1_Problema1 {
    public static void main(String[] args) {
        Estudiante estudiante2 = new Estudiante ("Augusto",6,10,10);
        estudiante2.calcularPromedio();
        System.out.print(estudiante2);
    }
}