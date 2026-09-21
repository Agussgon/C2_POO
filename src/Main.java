//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main() {


    Sube sube1= new Sube(123,1000.0);

    Sube sube2= new Sube(234,0.0);

    //caso positivo
    sube1.transferirSaldo(500.0, sube2);
    //casos negativos
    sube1.transferirSaldo(5000.0, sube2);

    sube1.transferirSaldo(-500.0, sube2);

    //caso negativo si tengo saldo negativo
    sube1.pagarViaje(1000.0);
    sube1.transferirSaldo(500.0, sube2);

}






