public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1=new EmpleadoTiempoCompleto("JGR2024","Jonathan",16000,"2 semanas de vacaciones");
        EmpleadoPorHoras empleado2=new EmpleadoPorHoras("JFB2024","Jared",3200,24);
        System.out.println("Salario del empleado a tiempo completo"+empleado1.calcularSalario());
        System.out.println("Salario del empleado por horas"+empleado2.calcularSalario());
    }
}