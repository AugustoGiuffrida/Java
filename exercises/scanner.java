import java.util.Scanner;

public class scanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//Se crea el objeto scanner y se pasa como parametro
                                                //System.in para indicar que recibira datos desde la consola
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println(nombre);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println(edad);

        System.out.println("Tu nombre es "+nombre+", tu edad es "+edad);
    }
}