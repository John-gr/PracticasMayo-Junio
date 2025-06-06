public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.sizeProducto(3);
        inv.setProducto("Lapiz",1,5);
        inv.agregarProducto(inv)
    }
}