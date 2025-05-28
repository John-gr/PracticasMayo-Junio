public class Main {
    public static void main(String[] args) {
        Estudiante[] promedio = new Estudiante[5];
        int i = 0;
        promedio[0] = new Estudiante();
        promedio[0].setNombre("Jonathan");
        promedio[0].setMatricula("20243ds060");
        promedio[0].setNota(0, 80);
        promedio[0].setNota(1, 90);
        promedio[0].setNota(2, 85);
        promedio[0].setNota(3, 75);
        promedio[0].setNota(4, 95);

        promedio[1] = new Estudiante();
        promedio[1].setNombre("Brayan");
        promedio[1].setMatricula("20243ds");
        promedio[1].setNota(0, 80);
        promedio[1].setNota(1, 90);
        promedio[1].setNota(2, 85);
        promedio[1].setNota(3, 75);
        promedio[1].setNota(4, 95);

        promedio[2] = new Estudiante();
        promedio[2].setNombre("Alan");
        promedio[2].setMatricula("20243ds");
        promedio[2].setNota(0, 80);
        promedio[2].setNota(1, 90);
        promedio[2].setNota(2, 85);
        promedio[2].setNota(3, 75);
        promedio[2].setNota(4, 95);

        promedio[3] = new Estudiante();
        promedio[3].setNombre("Jared");
        promedio[3].setMatricula("20243ds");
        promedio[3].setNota(0, 60);
        promedio[3].setNota(1, 60);
        promedio[3].setNota(2, 60);
        promedio[3].setNota(3, 60);
        promedio[3].setNota(4, 60);

        promedio[4] = new Estudiante();
        promedio[4].setNombre("Nicholas");
        promedio[4].setMatricula("20243ds");
        promedio[4].setNota(0, 80);
        promedio[4].setNota(1, 90);
        promedio[4].setNota(2, 85);
        promedio[4].setNota(3, 75);
        promedio[4].setNota(4, 95);

        while (i < 5) {
        System.out.printf("Nombre:"+promedio[i].getNombre()+"\n");
        System.out.println("Matricula:"+promedio[i].getMatricula());
        System.out.println("Promedio:"+ promedio[i].calcularPromedio());
        if (promedio[i].aprobado()== true) {
            System.out.println("El estudiante ha aprobado\n");
        } else {
            System.out.println("El estudiante no ha aprobado\n");
        }
        i++;
    }
    }
}