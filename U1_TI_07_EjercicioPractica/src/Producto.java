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
        if(codigo==null){
            System.out.println("Ingrese un codigo valido");
        }
        else if(codigo.isEmpty()){
            System.out.println("Ingrese un codigo valido");
        }
        else{
            this.codigo=codigo;
        }
    }

    public void setName(String nombre){
        this.nombre=nombre;
    }

    public void setCantidad(int cantidad){
        if(cantidad<=0){
            System.out.println("Ingrese un cantidad valida");
        }
        else {
            this.cantidad=cantidad;
        }
    }

    public void setProducto(String nombre,String codigo,int cantidad) {
        setName(nombre);
        setCodigo(codigo);
        setCantidad(cantidad);
    }

}
