public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario){
        for (int i=0;i<nombreUsuario.length();i++){
            if (nombreUsuario.charAt(i)==" "){
                System.out.println("Ingrese un nombre valido");
            }
        }
        if(nombreUsuario == null) {
            System.out.println("Ingrese un nombre valido");
        } else {
            this.nombreUsuario=nombreUsuario;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
