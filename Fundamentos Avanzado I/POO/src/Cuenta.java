public class Cuenta {
    private double saldo;
    public int agencia;
    public int numero;
    public Cliente titular = new Cliente();

    void depositar(double valor){
        saldo = saldo + valor;
    }

    boolean retirar (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    double getSaldo(){
        return this.saldo;
    }

    void transferir(double valor, Cuenta cuenta){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
        }
    }
}
