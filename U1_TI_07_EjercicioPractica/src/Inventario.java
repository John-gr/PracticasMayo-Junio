public class Inventario {
    private Producto[]producto;

    public Producto[] getProducto() {
        return producto;
    }

    public void sizeProducto(int tamaño) {
        this.producto=new Producto[tamaño];
    }

    public boolean agregarProducto(Producto prod){
        for(int i=0;i<this.producto.length;i++) {
            if(this.producto[i]==null) {
                producto[i]=prod;
                return true;
            }
        }
        if(this.producto!=null){
            return false;
        }
        return true;
    }

    public boolean eliminarProducto(String codigo){
        for(int i=0;i<this.producto.length;i++) {
            if(this.producto[i].getCodigo().equals(codigo)) {
                producto[i]=null;
                return true;
            }
        }
        return false;
    }

    pub
}
