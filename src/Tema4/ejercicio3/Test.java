package Tema4.ejercicio3;

public class Test {
    public static void main(String[] args) {

        Taxi taxi1= new Taxi("12345BCD", Distrito.SUR,TipoMotor.GASOLINA);
        Taxi taxi2= new Taxi("45678DHZ",Distrito.NORTE,TipoMotor.DIESEL);
        System.out.println(taxi1.getMatricula());
    }
}
