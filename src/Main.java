//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main() {

    Sube sube1 = new Sube(1, 2000.0);
    Sube sube2 = new Sube(2, 2000.0);
    Sube sube3 = new Sube(3, 2000.0);


    //consultar y modificar el saldo negativo desde la clase
    IO.println(Sube.getLimiteSaldoNegativo());

    Sube.setLimiteSaldoNegativo(-1000.0);

    IO.println(Sube.getLimiteSaldoNegativo());

    IO.println("La sube 2 " + sube2.getLimiteSaldoNegativoInstancia());


    //lo mismo desde la instancia
    IO.println("El problema de cambiar el saldo negativo que es estático desde una instancia " + sube1.getLimiteSaldoNegativoInstancia());

    //sube1.setLimiteSaldoNegativoInstancia(-3000.0);

//    IO.println("ver como quedan los tres saldos \n sube 1 "+sube1.getLimiteSaldoNegativoInstancia());
//    IO.println("La sube 2 "+sube2.getLimiteSaldoNegativoInstancia());
//    IO.println("La sube 3 "+sube3.getLimiteSaldoNegativoInstancia());

    IO.println( "Prueba de carga y pago de viajes \n"+
            sube3.getSaldo());
    sube3.pagarViaje(3000.0);
    IO.println(sube3.getSaldo());
    sube3.cargarSaldo(-1200.0);
    IO.println(sube3.getSaldo());
    sube3.pagarViaje(1500.0);
    IO.println(sube3.getSaldo());
}






