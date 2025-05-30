import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Ingrese su altura");
        Scanner sc1 = new Scanner(System.in);
        double altura=sc.nextDouble();
        System.out.println("Ingrese su peso");
        Scanner sc2 = new Scanner(System.in);
        double peso=sc.nextDouble();

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setAltura(altura);
        persona.setPeso(peso);

        System.out.println("Su IMC:"+persona.calcularIMC());
        System.out.println("Clasificado como:"+persona.clasificarIMC());
    }
}