public class Inventario {
    private Producto[] prod;

    public void tamañoProducto (int tamaño){
        this.prod=new Producto[tamaño];
    }

    public boolean agregarProductos(Producto p){
        for (int i=0;i<this.prod.length;i++){
            if(this.prod[i]==null){
                this.prod[i]=p;
                return true;
            }
        }
        return false;
    }


}
