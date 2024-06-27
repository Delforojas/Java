

import java.util.List;
import java.util.Scanner;


public class Main extends Dinero{

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        Usuario usuario = nuevoUsuario(scanner);

        Cuenta cuenta = new Cuenta(usuario);
        int opcion =-1;
        String descripcion;
        double cantidad;
        
        
        
        while(opcion ! =0) {
        System.out.println ("(1) Introducir un nuevo gasto: ");
        System.out.println ("(2) Introducir un nuevo ingreso: ");
        System.out.println ("(3) Mostrar gastos: ");
        System.out.println ("(4) Mostrar ingresos: ");
        System.out.println ("(5) Mostrar saldo: ");
        opcion =scanner.nextInt();      }
        scanner.nextLine();
        
        switch(opcion);{
        case 1: {
			System.out.println("Por favor, introduce la descripci�n del gasto");
			descripcion = sc.nextLine();
        }
        
        
	}
        private static void finPrograma() {
            System.out.println("Fin del programa.");
            System.out.print("Gracias por utilizar la aplicación M03B en el curso 1s2223.");
        }
        private static boolean menu(Scanner scanner, Cuenta cuenta) {

            int opciones = scanner.nextInt();

            switch (opciones){
                case 0:
                    finPrograma();
                    return true;
                case 1:
                    nuevoGasto(cuenta, scanner);
                    break;
                case 2:
                    nuevoIngreso(cuenta, scanner);
                    break;
                case 3:
                    mostrarGastos(cuenta);
                    break;
                case 4:
                    mostrarIngresos(cuenta);
                    break;
                case 5:
                    mostrarSaldo(cuenta);
                    break;
                default:
                    System.out.println("Introduce una opción valida");
            }
            return false;

        }
        private static void mostrarSaldo(Cuenta cuenta) {
            System.out.println("El saldo actual de la cuenta es: " + (cuenta.getSaldo()));
        }
        private static void mostrarIngresos(Cuenta cuenta) {
            List<Ingreso> ingresos = cuenta.getIngresos();
            for(Ingreso ingreso : ingresos){
                System.out.println(ingreso);
            }
        }
        private static void mostrarGastos(Cuenta cuenta) {
            List<Gasto> gastos = cuenta.getGastos();
            for(Gasto gasto : gastos){
                System.out.println(gasto);
            }
        }
        private static void nuevoIngreso(Cuenta cuenta, Scanner scanner) {
            System.out.println("Introduce el concepto: ");
            String concepto = scanner.nextLine();
            System.out.println("Introduce la cantidad: ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine();
            double saldoRestante = cuenta.addIngreso(concepto, cantidad);
            System.out.println("Saldo actual: " + (saldoRestante));
        }
	
	private static void nuevoGasto(Cuenta cuenta, Scanner scanner) {
        try {
            System.out.println("Introduce el concepto: ");
            String description = scanner.nextLine();
            System.out.println("Introduce la cantidad: ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine();
            double saldoRestante = cuenta.addGasto(description, cantidad);
            System.out.println("Saldo restante: " + (saldoRestante));
        } catch (GastoException e) {
            System.err.println(e.getMessage());
        }
	}
        private static Usuario nuevoUsuario (Scanner scanner){

            Usuario usuario = new Usuario();

            System.out.print("Introduzca el nombre: ");
            String nombre = scanner.nextLine();
            usuario.setNombre(nombre);

            System.out.print("Introduzca la edad: ");
            int edad = scanner.nextInt();
            usuario.setEdad(edad);
			
        
            boolean esDNIValido;
            do{
                System.out.print("Introduzca DNI: ");
                String DNI = scanner.nextLine();
                esDNIValido = usuario.setDNI(DNI);
                if(!esDNIValido){
                    System.out.println("DNI introducido incorrecto");
                }
            }while(!esDNIValido);
            System.out.println(usuario);
            System.out.println("Usuario creado correctamente");
            
            return usuario;
           /* boolean DNIValido;
            do{
                System.out.print("Introduzca DNI: ");
                String DNI = scanner.nextLine();
                DNIValido = usuario.setDNI(DNI);
                if(!DNIValido){
                    System.out.println("DNI introducido incorrecto");
                }
            }while(!DNIValido);
            
            boolean Dnivalido ;
            System.out.print("Introduzca DNI: ");
            String Dniusuario = scanner.nextLine();
            do {
                if (usuario.setDNI(Dniusuario)) {
                    Dnivalido = true;
                } else {
                    System.out.println("DNI introducido incorrecto");
                    Dnivalido =false;
                }
            } while (!Dnivalido);
            System.out.println(usuario);
            return usuario;*/
        }
		
		
         
        }
                    
		
