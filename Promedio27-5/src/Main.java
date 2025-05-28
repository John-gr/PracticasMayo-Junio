public class Main {
    public static void main(String[] args) {
        Estudiante promedio = new Estudiante();
        promedio.setNombre("Jonathan");
        promedio.setMatricula("20243ds060");
        promedio.setNota(0, 80);
        promedio.setNota(1, 90);
        promedio.setNota(2, 85);
        promedio.setNota(3, 75);
        promedio.setNota(4, 95);
        System.out.printf("Nombre:"+promedio.getNombre()+"\n");
        System.out.println("Matricula:"+promedio.getMatricula()+"\n");
        System.out.println("Promedio:"+ promedio.calcularPromedio()+"\n");
        if (promedio.aprobado()== true) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante no ha aprobado.");
        }
    }
}