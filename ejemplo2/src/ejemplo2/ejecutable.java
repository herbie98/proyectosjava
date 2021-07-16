package ejemplo2;

public class ejecutable {

    public static void main(String[] args) {
        cuenta pesos = new cuenta();
        cuenta dolar = new cuenta();
        
        pesos.setmoneda("pesos");
        pesos.setncuenta("123456");
        pesos.deposito(1500);
        pesos.retiro(200);
        
        dolar.setmoneda("dolar");
        dolar.setncuenta("255634");
        dolar.deposito(15600);
        dolar.retiro(1200);

        //esta es una fora de imprimir los datos
        /*
        System.out.println("num. cuenta:" + pesos.getncuenta());
        System.out.println("moneda:" + pesos.getmoneda());
        System.out.println("saldo:" + pesos.getsaldo());
        
        System.out.println("num. cuenta:" + dolar.getncuenta());
        System.out.println("moneda:" + dolar.getmoneda());
        System.out.println("saldo:" + dolar.getsaldo());
        */

        //esta es otra forma de imprir los datos pero mas eficiente
        System.out.println(pesos.datos());
        System.out.println(dolar.datos());
        
    }
    
}
