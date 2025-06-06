public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public void setName(String nombre){
        this.nombre=nombre;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

}
