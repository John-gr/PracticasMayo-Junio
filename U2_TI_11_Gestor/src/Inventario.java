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

    public boolean eliminarProducto(String codigo){
        for(int i=0;i<this.prod.length;i++){
            if(codigo.equals(this.prod[i].getCodigo())){
                this.prod[i]=null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String codigo){
        for(int i=0;i<this.prod.length;i++){
            if(codigo.equals(this.prod[i].getCodigo())){
                return this.prod[i];
            }
        }
        return null;
    }

    public int totalItems(){
        int contador=0;
        for(int i=0;i<this.prod.length;i++){
            if(this.prod[i]!=null){
                contador++;
            }
        }
        return contador;
    }

}
