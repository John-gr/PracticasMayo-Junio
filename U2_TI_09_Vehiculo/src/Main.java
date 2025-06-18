public class Main {
    public static void main(String[] args) {
        Garage garage=new Garage(4);
        Coche carro1=new Coche("1234","Chevrolet",4);
        Motocicleta moto1=new Motocicleta("2345","Italika",true);
        Coche carro2=new Coche("3456","Toyota",4);
        Motocicleta moto2=new Motocicleta("4567","vento",false);

        garage.estacionar(carro1);
        garage.estacionar(moto1);
        garage.estacionar(carro2);
        garage.estacionar(moto2);
        System.out.println("El conteo de vehiculos es:"+garage.contarVehiculos());
        garage.retirar(carro2.getPlaca());
        System.out.println("El nuevo conteo de vehiculos es:"+garage.contarVehiculos());
    }
}