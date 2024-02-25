package cuenta;


public class Main {

    
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

    public static void ingresaDinero(CuentaGilLópezSonia2324 miCuentaGilLópezSonia2324) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaGilLópezSonia2324.ingresar(x, Ingreso);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

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
