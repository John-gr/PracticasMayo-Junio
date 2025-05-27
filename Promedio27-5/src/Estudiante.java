public class Estudiante {
    private String nombre;
    private String matricula;
    private double [] notas = new double [5];

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNotas(double [] notas) {
        this.notas = notas;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getMatricula() {
        return matricula;
    }
    public double[] getNotas() {
        return notas;
    }

    //metodos
    public double calcularPromedio(){
        double promedio = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        return promedio;
    }

    public boolean aprobado(){
        if(calcularPromedio()>=70){
            return true;
        }
        else {
            return false;
        }
    }
}
