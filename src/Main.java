public class Main {

    static void main() {

        //instancias para probar
        Socia socia1= new Socia("Paula", 35678567,1);

        Socia socia2= new Socia("Luz", 34678567,10);

        //casos de prueba
        socia1.regalarPuntos(50,socia2);

        //negativo
        socia1.regalarPuntos(-50,socia2);
        socia1.regalarPuntos(501,socia2);


    }
}
