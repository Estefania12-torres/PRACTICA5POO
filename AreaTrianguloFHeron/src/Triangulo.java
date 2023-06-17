import java.lang.Math;
public class Triangulo { //Creacion de la clase Triangulo

    //Declaración de los atributos 
    private double valorLadoA;
    private double valorLadoB;
    private double valorLadoC;

    //Delaracíon del Constructor que inicializa a los valores de los Lados
    public Triangulo(double valorLadoA, double valorLadoB, double valorLadoC) {
        this.valorLadoA = valorLadoA;
        this.valorLadoB = valorLadoB;
        this.valorLadoC = valorLadoC;
    }

    //Metodos
    //Método para calcular el perimetro de los lados del Triangulo
    public double calcularPerimetro(){
        return this.valorLadoA + this.valorLadoB + this.valorLadoC;
    }

    //Método para calcular el Semiperimetro, tomando el resultado del perimetro
    public double calcularSemiperimetro(){
        return calcularPerimetro() / 2;
    }

    //Método para calcular el Area del Triangulo usando la Formula de Heron, tomando el valor del Semiperimetro 
    public double calcularAreaTrianguloFormulaHeron(){
        double semiperimetro = calcularSemiperimetro();
        double area = Math.sqrt(semiperimetro * (semiperimetro - this.valorLadoA) * (semiperimetro - this.valorLadoB) * (semiperimetro - this.valorLadoC));
        return area;
    }

    //Creación de los getter y setter de los atributos
    public double getValorLadoA() {
        return valorLadoA;
    }
    public void setValorLadoA(double valorLadoA) {
        this.valorLadoA = valorLadoA;
    }

    public double getValorLadoB() {
        return valorLadoB;
    }
    public void setValorLadoB(double valorLadoB) {
        this.valorLadoB = valorLadoB;
    }

    public double getValorLadoC() {
        return valorLadoC;
    }
    public void setValorLadoC(double valorLadoC) {
        this.valorLadoC = valorLadoC;
    }

    //toString
    //Presentación de los resultados y implementacion de una condicional, ya que si hay valores negativos no se puede realizar los calculos
    //Caso contrario si es positivo se realiza los calculos 
    @Override
    public String toString() {
        if (valorLadoA <= 0 || valorLadoB <= 0 || valorLadoC <= 0) {
            return "No se puede realizar el cálculo con valores negativos o iguales a cero";
        }
        return "Triangulo = {" + "valorLadoA=" + valorLadoA + ", valorLadoB=" + valorLadoB + ", valorLadoC=" + valorLadoC + '}'
        + "\nEl valor del perimetro es igual a = " + calcularPerimetro() + " cm" + "\nEl valor del Semiperimetro es = " + calcularSemiperimetro() + " cm"
        + "\nEl valor del Area aplicando la Formula de Herón es = " + calcularAreaTrianguloFormulaHeron() + "m²";
    }

}
