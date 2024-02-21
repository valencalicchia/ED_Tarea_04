import cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        float cant = 2;
        operativa_cuenta(cant);
    }

    public static void operativa_cuenta(float cantidad){
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta(git remote add origin https://github.com/valencalicchia/ED_Tarea_04.git
        git branch -M main
        git push -u origin main"Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
