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
        System.out.println("Ingrese las notas de la materia 1\n");
        this.notas[0] = notas[0];
        System.out.println("Ingrese las notas de la materia 2\n");
        this.notas[1] = notas[1];
        System.out.println("Ingrese las notas de la materia 3\n");
        this.notas[2] = notas[2];
        System.out.println("Ingrese las notas de la materia 4\n");
        this.notas[3] = notas[3];
        System.out.println("Ingrese las notas de la materia 5\n");
        this.notas[4] = notas[4];
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