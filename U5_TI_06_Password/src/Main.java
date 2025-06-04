import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre de usuario");
        Scanner sc=new Scanner(System.in);
        String nombre=sc.nextLine();
        System.out.println("Ingrese su contraseña");
        String password=sc.nextLine();
        System.out.println("Ingrese de nuevo su contraseña");
        String auth=sc.nextLine();

        UsuarioSeguro usuario=new UsuarioSeguro();
        usuario.setNombreUsuario(nombre);
        usuario.setPassword(password);
        if(usuario.userAuthentication(auth)){
        System.out.println("Acceso concedido");
        }
        else {
            System.out.println("Acceso denegado");
        }

    }
}