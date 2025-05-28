public class Estudiante {
    private String nombre;
    private String matricula;
    private double [] notas = new double [5];

        //Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public double[]getNota(int i) {
        return this.notas;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNotas(double [] notas) {
        int i = 0;
        while(i<5){
            this.notas[i] = notas[i];
            i++;
        }
        }

        public void setNota(int i, double nota) {
                this.notas[i] = nota;
        }

    //metodos
    public double calcularPromedio(){
        double promedio = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4])/5;
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