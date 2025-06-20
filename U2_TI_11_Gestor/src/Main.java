public class Main {
    public static void main(String[] args) {
        Inventario inv=new Inventario(3);
        Producto producto1=new Producto("1234","Jabon",10);
        Producto producto2=new Producto("2345","Desodorante",15);
        Producto producto3=new Producto("3456","Desinfectante",8);
        Producto producto4=new Producto("4567","Alcohol",5);
        inv.agregarProductos(producto2);
        inv.agregarProductos(producto3);
        inv.agregarProductos(producto1);
        inv.agregarProductos(producto4);
        System.out.println("Total de items:"+inv.totalItems());
        if(inv.buscar("1234")!=null){
            System.out.println("Nombre de lo buscado:"+inv.buscar("1234").getNombre());
        } else {
            System.out.println("No se encontro tal producto");
        }
        if(inv.buscar("1000")!=null){
            System.out.println("Nombre de lo  buscado:"+inv.buscar("1000").getNombre());
        } else {
            System.out.println("No se encontro tal producto");
        }
        System.out.println("Total de items:"+inv.totalItems());
        inv.eliminarProducto("2345");
        System.out.println("Total de items:"+inv.totalItems());
        inv.agregarProductos(producto4);
        System.out.println("Total de items:"+inv.totalItems());
    }
}