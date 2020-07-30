import java.util.Scanner;
public class tar4{
    static Scanner input=new Scanner(System.in);
    public static void ejercicio1(){
        int salario=1500;
        for (int i=1; i<=6;i++){
            salario+=salario*0.10;
            System.out.print("El salario de un "+ i +"año es:"+salario);
        }
    }    
    public static void ejercicio2() {
        int n, valor, i = 1, rojo = 0, blanco = 0, verde = 0;
        System.out.println("Ingresar cantidad de focos: ");
        n = input.nextInt();
        while (i <= n) {
            System.out.println("Ingresa el color de focos: \n" +
                    "   1 = rojo \n" +
                    "   2 = blanco \n" +
                    "   3 = verde");
            valor = input.nextInt();
            if (valor == 1) {
                rojo++;
            }
            if (valor == 2) {
                blanco++;
            }
            if (valor == 3) {
                verde++;
            }
            i++;
        }
        System.out.println("focos de color rojo: "+ rojo);
        System.out.println("focos de color blanco: "+ blanco);
        System.out.println("focos de color verde: "+ verde);
    }
    public static void ejercicio3(){
        long ahorro = 1;
        for(int i=1; i<=365; i++){
            ahorro*=3;
        }
        System.out.println("El ahorro total es:"+ahorro);
    }
    public static void ejercicio4() {
        int num, total;
        System.out.println("Digite el número para la tabla correspondiente: ");
        num = input.nextInt();
        for (int i = 1; i <= 12; i++ ) {
            total = num*i;
            System.out.println(num + " x " + i + " = "+total);
        }
    }
    public static void ejercicio5(){
        int n, valor, nota, aprobado = 0, reprobado = 0;
        System.out.print("Ingrese el número de alumnos: ");
        n = input.nextInt();
        System.out.print("Ingrese la nota aprobatoria: ");
        valor = input.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print("Ingrese la nota del alumno "+i+": ");
            nota = input.nextInt();
            if (valor <= nota) {
                aprobado++;
            }
            else {
                reprobado++;
            }
        }
        System.out.println("El número de aprobados es: "+ aprobado);
        System.out.println("El número de reprobados es: "+ reprobado);
    }
    public static void ejercicio6(){
        int n, arti; double totalr = 0; double total_1, total = 0;
        System.out.println("Ingrese el número de artículos: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("El costo del "+i+" artículo: ");
            arti = input.nextInt();
            if (arti >= 200) {
                total_1 = arti * 0.15;
                totalr = arti - total_1;
            }
            if (arti > 100 && arti < 200) {
                total_1 = arti * 0.12;
                totalr = arti - total_1;
            }
            if (arti <= 100) {
                total_1 = arti * 0.10;
                totalr = arti - total_1;
            }
            total += totalr;
            System.out.println("El monto a pagar es: "+ totalr);
        }
        System.out.println("El total a pagar es de: "+ total);
    }
    public static void main(String[] args) {
        System.out.println("Probar Algoritmos: ");
        String opcion;
        int numero;
        do {
            System.out.println("Ingrese el Algoritmo que desea probar: ");
            numero = input.nextInt();
            switch (numero) {
                case 1:ejercicio1();
                    break;
                case 2:ejercicio2();
                    break;
                case 3:ejercicio3();
                    break;
                case 4:ejercicio4();
                    break;
                case 5:ejercicio5();
                    break;
                case 6:ejercicio6();
                    break;
                default:
                    System.out.println("El valor que ingresó es incorrecto");
                    break;
            }
            System.out.println("Desea probar mas algoritmos? SI/NO");
            opcion = input.next();
        }while(opcion.equals("SI")|| opcion.equals("si"));
    }
}
