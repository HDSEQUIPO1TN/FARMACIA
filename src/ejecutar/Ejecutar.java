package ejecutar;
//___

import java.util.Scanner;
import Clases.Almacen;

public class Ejecutar {

    public static void menu() {

        System.out.println("************************************************" + "\n*     BIENVENIDO A BOTICAS ATENDEL      *\n"
                + "************************************************");
        System.out.println("----------INGRESE UNA OPCION----------");
        System.out.println("1-INGRESAR PRODUCTO");
        System.out.println("2-BUSCAR PRODUCTO POR NOMBRE");
        System.out.println("3-ELIMINAR PRODUCTO MAL INGRESADO");
        System.out.println("4-MOSTRAR PRODUCTOS EN STOCK");
        System.out.println("5-SALIR");

    }

    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Scanner scan = new Scanner(System.in); // objeto creado para las credenciales 
        final String user = "admin"; //declaramos el usuario "admin"
        final String contra = "1234"; //declaramos que contraseña sera "1234"
        int cont = 0;
        do {
            System.out.println("----------LOGIN----------\nINGRESE CREDENCIALES");
            System.out.print("Usuario: ");
            String user2 = scan.next(); // la variable de tipo cadena "user2" se ingresa por teclado y se alamacena en el objeto scan 
            System.out.print("Contraseña: ");
            String contra2 = scan.next(); //la variable de tipo cadena "user2" se ingresa por teclado y se alamacena en el objeto scan 
            if (contra2.equals(contra) && user2.equals(user)) { //equals comparar
                System.out.println("DATOS CORRECTOS\n");
                menu();
                opcion = sc.nextInt();
                sc.nextLine();


                while (opcion != 5) {

                    if (opcion == 1) {
                        System.out.print("Ingrese el nombre: ");
                        String nombre = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese el codigo: ");
                        int codigo = sc.nextInt();
                        System.out.print("Ingrese el codigo del catálogo: ");
                        String cod_cat = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese el contenido del producto: ");
                        int contenido = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el laboratorio del producto: ");
                        String laboratorio = sc.next();
                        System.out.print("Ingrese fecha de produccion del produto : ");
                        String fecha_prod = sc.next();
                        System.out.print("Ingrese fecha de vencimiento del produto : ");
                        String fecha_venc = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese el precio: ");
                        Double precio = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Ingrese el stock: ");
                        int stock = sc.nextInt();
                        System.out.print("Ingrese fecha de ingreso a almacen del producto : ");
                        String fecha_ingreso = sc.next();
                        almacen.agregarProductos(nombre, codigo, cod_cat, contenido, laboratorio, fecha_prod, fecha_venc, precio, stock, fecha_ingreso);;

                    }
                    if (opcion == 2) {
                        System.out.println("Ingrese nombre del producto: ");
                        String nombre = sc.next();
                        System.out.println(almacen.buscarProductos(nombre));
                    }
                    if (opcion == 3) {
                        System.out.println(almacen.obtenerListado());
                        System.out.println("Ingrese el producto a eliminar: ");
                        int numero = sc.nextInt();
                        String datos = (almacen.buscarProductos(numero));
                        if (!datos.equals("Producto no encontrado")) {
                            System.out.println("Se dispone a eliminar a " + datos);
                            System.out.println("¿Esta seguro? [1]SI [0]NO");
                            int seguro = sc.nextInt();
                            if (seguro == 1) {
                                almacen.eliminarProductos(numero);
                                System.out.println("Producto Eliminado");
                            }
                        } else {
                            System.out.println(datos);
                        }
                    }
                    if (opcion == 4) {
                        System.out.println(almacen.obtenerListado());
                    } else {
                        System.out.println("");
                    }
                    menu();
                    opcion = sc.nextInt();
                }
                return;
            } else {
                System.out.println("¡DATOS INCORRECTOS!\n");

                cont = cont + 1;
                if (cont == 3) {
                    System.out.println("CUENTA BLOQUEADA...");
                    System.out.println("Intende dentro de 5 min");
                }
            }

        } while (cont < 3);

    }
}
