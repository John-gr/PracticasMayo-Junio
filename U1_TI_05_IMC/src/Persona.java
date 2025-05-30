public class Persona {
    private String nombre;
    private double altura;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodos
    public double calcularIMC(){
        double imc=peso/(altura*altura);
        return imc;
    }

    public String clasificarIMC(){
        String valor="";
        if(calcularIMC()<18.5){
            valor="Bajo peso";
        }
        else if(calcularIMC()>18.5&&calcularIMC()<24.9){
            valor="Normal";
        }
        else if(calcularIMC()>24.9&&calcularIMC()<29.9){
            valor="Sobrepeso";
        }
        else {
            valor="Obesidad";
        }
        return valor;
    }
}
