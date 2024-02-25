package cuenta;
/**
 * En esta Clase, se representa una cuenta bancaria,
 * y los siguentes atributos: nombre, cuenta saldo y tipo de interás.
 * @author Gil López,Sonia
 */

public class CuentaGilLópezSonia2324 {


        private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

   
    public CuentaGilLópezSonia2324 ()
    {
    }
    
   /**
    * Constructor de la clase CuentaGilLópezSonia2324 que inicializa los atributos con los valores proporcionanos.
    * 
    * @param nom    Aqui sería el Nombre de la cuenta.
    * @param cue    El Número de cuenta.
    * @param sal    El Saldo inicial de la cuenta.
    * @param tipo   El Tipo de interés de la cuenta.
    */
   
    public CuentaGilLópezSonia2324 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
    
    /**
     * Se le asigna un nombre a la cuenta.
     * 
     * @param nom  Nombre a asignar. 
     */
   
    
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
   /**
    * Se obtiene el nombre de la cuenta.
    * 
    * @return Nombre de la cuenta. 
    */
   
    public String obtenerNombre()
    {
        return getNombre();
    }
    
    /**
     * Devuelve el estado actual del saldo de la cuenta.
     * 
     * @return  Del Saldo actual de la cuenta.
     */
    
     public double estado ()
    {
        return getSaldo();
    }
     
     /**
      * Método para realizar un ingraso a cuenta.
      * 
      * @param cantidad Cantidad que se ingresa.
      * @param concepto Concpto del depósito.
      * @throws Exception  Si se intentara depositar una cantidad negativa saltaria la excepcion.
      */
   
    public void ingresar(double cantidad, String concepto) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para retirear dinero.
     * 
     * @param cantidad (Cantidad de dinero).
     * @throws Exception, Si se intentara retirar una cantidad de dinero
     * negativa o si no hay suficiente saldo, saltaria la excepción.
     */
    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Método para obtener el Número de la cuenta.
     * 
     * @return Número de la cuenta.
     */
    
    public String obtenerCuenta ()
    {
        return getCuenta();
    }
    
    /**
     * Se obtiene el nombre de la cuenta.
     * 
     * @return the nombre, (Nombre de la cuenta).
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Se establece el nombre de la cuenta.
     * 
     * @param nombre the nombre to set( Nombre de la cuenta).
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Se obtiene el n´úmero de cuenta.
     * 
     * @return the cuenta.
     */
    
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Se establece el número de la cuenta.
     * 
     * @param cuenta the cuenta to set, Número de la cuenta.
     */
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Se obtiene el saldo de la cuenta.
     * 
     * @return the saldo, saldo de la cuenta.
     */
    
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo, the saldo to set,de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Se obtiene el tipo de interés de la cuenta.
     * 
     * @return the tipoInteres.
     */
    
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Y por último se establece el tipo de interés de la cuenta.
     * 
     * @param tipoInteres the tipoInteres to set, de la cuenta.
     */
    
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
