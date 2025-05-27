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
}
