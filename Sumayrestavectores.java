import java.util.Scanner;
public class Sumayrestavectores {
    public static void main(String[] args) {
        int a1, a2, b1, b2, c1, c2,  d1, d2, e1, e2, op;
        boolean resu;
        boolean repetir = true;  

        Scanner lectura = new Scanner(System.in);
        System.out.println("Elige una opcion");

        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("5. Salir");
            System.out.println("¿Que opcion desea realizar?");
            op = lectura.nextInt();

            if (op == 1) {
                System.out.println("Ingresa el valor de a1 para u1");
                a1 = lectura.nextInt();

                System.out.println("Ingresa el valor de b1 para u1");
                b1 = lectura.nextInt();

                System.out.println("Ingresa el valor de c1 para u1");
                c1 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de d1 para u1");
                d1 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de a2 para u2");
                a2 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de b2 para u2");
                d2 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de c2 para u2");
                c2 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de d2 para u2");
                d2 = lectura.nextInt();
                               

                resu = (a1+a2,b1+b2,c1+c2,d1+d2);
                
                System.out.println("El resultado de la suma de vectores es :" + resu);

            } else if (op == 2) {
                System.out.println("Ingresa el valor de a1 para u1");
                a1 = lectura.nextInt();

                System.out.println("Ingresa el valor de b1 para u1");
                b1 = lectura.nextInt();

                System.out.println("Ingresa el valor de c1 para u1");
                c1 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de d1 para u1");
                d1 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de a2 para u2");
                a2 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de b2 para u2");
                d2 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de c2 para u2");
                c2 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de d2 para u2");
                d2 = lectura.nextInt();

                resu = (-a1-a2,b1-b2,c1-c2,d1-d2);

                System.out.println("El resultado de la resta de vectores es :" + resu);

            } else {
                System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (repetir);

        System.out.println("¿Quieres comenzar de nuevo? (1 para si o 0 para no)");
        repetir = lectura.nextInt() == 1;
    }
}