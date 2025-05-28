public class Computadora {
    private String marca="ASUS";
    private String modelo;
    private boolean encendido;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodos
    public void encender() {
        if(encendido == false){
            encendido = true;
            System.out.println("Encendiendo...");
        }
    }
    public void apagar() {
        if(encendido == true){
            encendido = false;
            System.out.println("Apagando...");
        }
    }
}
