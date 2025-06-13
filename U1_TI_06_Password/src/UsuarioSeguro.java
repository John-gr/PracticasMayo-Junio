public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario){
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
        boolean verificadoMay = false;
        boolean verificadoMin = false;
        boolean verificadoDig = false;
        if(password.length()<8){
            System.out.println("Ingrese minimo 8 caracteres");
        }
        else{
            for(int i=0;i<password.length();i++){
                if((Character.isUpperCase(password.charAt(i)))){
                    verificadoMay=true;
                }
                else if((Character.isLowerCase(password.charAt(i)))){
                    verificadoMin=true;
                }
                else if((Character.isDigit(password.charAt(i)))){
                    verificadoDig=true;
                }
            }
            if(verificadoMay==true&&verificadoMin==true&&verificadoDig==true){
                this.password = password;
            }
            else{
                System.out.println("Ingrese al menos una mayuscula, una minuscula y un digito");
            }
        }
    }

    public boolean userAuthentication(String intentPassword){
        if(intentPassword.equals(this.password)){
            return true;
        }
        else{
            return false;
        }
    }
}
