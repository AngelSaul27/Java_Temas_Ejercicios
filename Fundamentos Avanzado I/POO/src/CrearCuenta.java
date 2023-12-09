public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta primerCuenta = new Cuenta();
        //primerCuenta.saldo = 1000;

        Cuenta segundaCuenta = new Cuenta();
        //segundaCuenta.saldo = 2000;

        primerCuenta.depositar(100);
        segundaCuenta.depositar(10);

        primerCuenta.transferir(500, segundaCuenta);

        //System.out.println(primerCuenta.saldo);
       // System.out.println(segundaCuenta.saldo);
    }

}
