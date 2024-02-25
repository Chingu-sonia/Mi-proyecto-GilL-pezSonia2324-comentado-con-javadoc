package cuenta;

/**
 * Esta clase Main contiente el método proncipal que realiza operaciones con una cuenta bancaria.
 * @author GilLópez sonia.
 */

public class Main {

 /**
  * El Método proncipal que realiza operaciones con un cuenta bancaria.
  * 
  * @param args Los argumetnos de la línea de comando no son utilizados en este
  * caso.
  */  
    
    public static void main(String[] args) {
        CuentaGilLópezSonia2324 miCuentaGilLópezSonia2324;
        double saldoActual;
        int x;
        
        miCuentaGilLópezSonia2324 = new CuentaGilLópezSonia2324("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaGilLópezSonia2324.estado()+"€");
        retiraDinero(miCuentaGilLópezSonia2324);
        
        ingresaDinero(miCuentaGilLópezSonia2324);
        saldoActual = miCuentaGilLópezSonia2324.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }
    
    /**
     * Método ingresaDinero realiza in ingreso a cuenta de la cuenta 
     * especificada.
     * 
     * @param miCuentaGilLópezSonia2324 Es la cuenta bancaria en la que se 
     * realizará el ingreso.
     */
        public static void ingresaDinero(CuentaGilLópezSonia2324 miCuentaGilLópezSonia2324) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaGilLópezSonia2324.ingresar(x, "Ingreso en cuenta");
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }
    
    /**
     * Método retiraDinero realiza una retirada de dinero de la cuenta bancaria
     * especificada.
     * 
     * @param miCuentaGilLópezSonia2324 Es la cuenta bancaria de la que se 
     * realizará la retirada.
     */

    public static void retiraDinero(CuentaGilLópezSonia2324 miCuentaGilLópezSonia2324) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaGilLópezSonia2324.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
