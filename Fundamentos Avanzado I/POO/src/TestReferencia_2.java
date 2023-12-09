public class TestReferencia_2 {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "12H23A23";
        diego.telefono = "99939378457";

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.titular = diego;
        cuentaDeDiego.agencia = 1;

        System.out.println(cuentaDeDiego.titular.documento);
    }
}
