public class PruebaAccesso {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        //cuenta.saldo = 200;
        cuenta.retirar(300);

        System.out.println(cuenta.getSaldo());
    }

}
