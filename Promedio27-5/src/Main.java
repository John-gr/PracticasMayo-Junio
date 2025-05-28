public class Main {
    public static void main(String[] args) {
        Estudiante promedio1 = new Estudiante();
        int i = 0;
        promedio1.setNombre("Jonathan");
        promedio1.setMatricula("20243ds060");
        promedio1.setNota(0, 80);
        promedio1.setNota(1, 90);
        promedio1.setNota(2, 85);
        promedio1.setNota(3, 75);
        promedio1.setNota(4, 95);

        Estudiante promedio2 = new Estudiante();
        promedio2.setNombre("Brayan");
        promedio2.setMatricula("20243ds");
        promedio2.setNota(0, 80);
        promedio2.setNota(1, 90);
        promedio2.setNota(2, 85);
        promedio2.setNota(3, 75);
        promedio2.setNota(4, 95);

        Estudiante promedio3 = new Estudiante();
        promedio3.setNombre("Alan");
        promedio3.setMatricula("20243ds");
        promedio3.setNota(0, 80);
        promedio3.setNota(1, 90);
        promedio3.setNota(2, 85);
        promedio3.setNota(3, 75);
        promedio3.setNota(4, 95);

        Estudiante promedio4 = new Estudiante();
        promedio4.setNombre("Jared");
        promedio4.setMatricula("20243ds");
        promedio4.setNota(0, 60);
        promedio4.setNota(1, 60);
        promedio4.setNota(2, 60);
        promedio4.setNota(3, 60);
        promedio4.setNota(4, 60);

        Estudiante promedio5 = new Estudiante();
        promedio5.setNombre("Nicholas");
        promedio5.setMatricula("20243ds");
        promedio5.setNota(0, 80);
        promedio5.setNota(1, 90);
        promedio5.setNota(2, 85);
        promedio5.setNota(3, 75);
        promedio5.setNota(4, 95);

        System.out.printf("Nombre:"+promedio1.getNombre()+"\n");
        System.out.println("Matricula:"+promedio1.getMatricula());
        System.out.println("Promedio:"+ promedio1.calcularPromedio());
        if (promedio1.aprobado()== true) {
            System.out.println("El estudiante ha aprobado\n");
        } else {
            System.out.println("El estudiante no ha aprobado\n");
        }

        System.out.printf("Nombre:"+promedio2.getNombre()+"\n");
        System.out.println("Matricula:"+promedio2.getMatricula());
        System.out.println("Promedio:"+ promedio2.calcularPromedio());
        if (promedio2.aprobado()== true) {
            System.out.println("El estudiante ha aprobado\n");
        } else {
            System.out.println("El estudiante no ha aprobado\n");
        }
        System.out.printf("Nombre:"+promedio3.getNombre()+"\n");
        System.out.println("Matricula:"+promedio3.getMatricula());
        System.out.println("Promedio:"+ promedio3.calcularPromedio());
        if (promedio3.aprobado()== true) {
            System.out.println("El estudiante ha aprobado\n");
        } else {
            System.out.println("El estudiante no ha aprobado\n");
        }
        System.out.printf("Nombre:"+promedio4.getNombre()+"\n");
        System.out.println("Matricula:"+promedio4.getMatricula());
        System.out.println("Promedio:"+ promedio4.calcularPromedio());
        if (promedio4.aprobado()== true) {
            System.out.println("El estudiante ha aprobado\n");
        } else {
            System.out.println("El estudiante no ha aprobado\n");
        }
        System.out.printf("Nombre:"+promedio5.getNombre()+"\n");
        System.out.println("Matricula:"+promedio5.getMatricula());
        System.out.println("Promedio:"+ promedio5.calcularPromedio());
        if (promedio5.aprobado()== true) {
            System.out.println("El estudiante ha aprobado\n");
        } else {
            System.out.println("El estudiante no ha aprobado\n");
        }
    }
}