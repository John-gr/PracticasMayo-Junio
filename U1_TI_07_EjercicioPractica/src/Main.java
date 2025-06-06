public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.sizeProducto(3);
        Producto prodc = new Producto();
        prodc.setProducto("Lapiz","1",5);
        inv.agregarProducto(prodc);
        System.out.println(inv.totalItems());
        prodc.setProducto("Goma","2",8);
        inv.agregarProducto(prodc);
        System.out.println(inv.totalItems());
        prodc.setProducto("Regla","3",2);
        inv.agregarProducto(prodc);
        System.out.println(inv.totalItems());
        prodc.setProducto("Color","4",10);
        if(inv.agregarProducto(prodc)==false){
            System.out.println("Fallo, ya esta lleno");
        }
        System.out.println("Producto nombre:"+inv.buscar("1"));
        System.out.println("Producto nombre:"+inv.buscar("5"));
        inv.eliminarProducto("2");
        inv.agregarProducto(prodc);
        System.out.println(inv.totalItems());
    }
}