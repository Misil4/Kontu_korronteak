
package kontu_korronteak;

import java.util.Scanner;
public class Banco {

    Cuenta cuentas[];
    int contador;    
    

    public Banco() {
        this.cuentas = new Cuenta[100];
        this.contador=0;
    }
    
    public void agregarCuenta  (Cuenta cuenta){
        this.cuentas[this.contador] = cuenta;
        contador++;
    }
    
    public void eliminariCuenta(int i){
        for(int j=i;j<contador-1;j++){
            cuentas[j]=cuentas[j+1];
        }
        cuentas[contador] = null;
        contador--;
    }
    
    

    public static void main(String[] args) {   
        
        Scanner sc = new Scanner(System.in);
        
        Banco banco = new Banco();    
        
        System.out.println("Ingrese tipo: \n"
                + "1) Cuentas de Ahorros\n"
                + "2) Cuenta Corriente\n"
                + "3) Finalizar");
        
        int option = sc.nextInt();       
        
        
        
        switch(option){
            case 1:
                System.out.println("Opciones: \n"
                        + "1) Crear Cuenta de Ahorro\n"
                        + "2) Cerrar Cuenta de Ahorro\n"
                        + "3) Cambiar Datos de Cuenta de Ahorro\n"
                        + "4) Ingresar Dinero\n"
                        + "5) Retirar Dinero\n"
                        + "6) Mostrar Saldo\n"
                        + "7) Calcular Intereses\n"                        
                        + "8) Salir");
                Cuenta cuenta1= new Cuenta_Ahorros("", "", "", "", "");                    
                banco.agregarCuenta(cuenta1);
                break;
            default:
                break;
        }
        
        
        
       
        
    }
}

class Cuenta {

    protected String NAN, Nombre, Apellidos, Direccion, Telefono, Tipo;
    protected double saldo, porcentaje_comision;
    
    public Cuenta(){
        this.NAN = "";
        this.Nombre = "";
        this.Apellidos = "";
        this.Direccion = "";
        this.Telefono = "";
        this.saldo = 0;
    }

    public Cuenta(String NAN, String Nombre, String Apellidos,
            String Direccion, String Telefono) {
        this.NAN = NAN;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.saldo = 0;
    }

    public String getNAN() {
        return NAN;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getPorcentaje_comision() {
        return porcentaje_comision;
    }

    public void setNAN(String NAN) {
        this.NAN = NAN;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPorcentaje_comisión(double porcentaje_comisión) {
        this.porcentaje_comision = porcentaje_comisión;
    }

    public String mostrarDatos() {
        return "NAN: " + this.NAN + "\n"
                + "Nombre: " + this.Nombre + "\n"
                + "Apellidos: " + this.Apellidos + "\n"
                + "Dirección: " + this.Direccion + "\n"
                + "Teléfono: " + this.Telefono + "\n"
                + "Saldo: " + this.saldo;
    }

}

class Cuenta_Ahorros extends Cuenta {
    
    private double gastosTarjeta;

    public Cuenta_Ahorros(String NAN, String Nombre, String Apellidos,
            String Direccion, String Telefono) {
        super(NAN, Nombre, Apellidos, Direccion, Telefono);
        this.Tipo = "Cuenta de Ahorros";
        this.porcentaje_comision = 0.15;
    }

    @Override
    public String mostrarDatos() {
        return "Tipo: " + this.Tipo + "\n"
                + super.mostrarDatos() + "\n"
                + "Porcentaje de Comisión: " + this.porcentaje_comision;
    }

}

class Cuenta_Corriente extends Cuenta {

    public Cuenta_Corriente(String NAN, String Nombre, String Apellidos,
            String Direccion, String Telefono) {
        super(NAN, Nombre, Apellidos, Direccion, Telefono);
        this.Tipo = "Cuenta Corriente";
        this.porcentaje_comision = 0.10;
    }

    @Override
    public String mostrarDatos() {
        return "Tipo: " + this.Tipo + "\n"
                + super.mostrarDatos() + "\n"
                + "Porcentaje de Comisión: " + this.porcentaje_comision;
    }
}