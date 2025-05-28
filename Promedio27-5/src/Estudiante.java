public class Estudiante {
    private String nombre;
    private String matricula;
    private double [] notas = new double [5];

        //Getters
    public String getNombre() {
        return nombre;
    }
    public String getMatricula() {
        return matricula;
    }
    public double[] getNotas(int i) {
        while(i<5){
            String[]calf = new String[5];
            calf[i]= JOptionPane.showInputDialog("Ingrese la nota de la materia " + (i+1));
            notas[i] = Double.parseDouble(calf[i]);
            i++;
        }
        return notas;
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