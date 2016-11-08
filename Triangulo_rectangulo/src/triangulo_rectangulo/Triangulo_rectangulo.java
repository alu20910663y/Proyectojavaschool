package triangulo_rectangulo;
/*Importar Scanner*/
import java.util.Scanner;
public class Triangulo_rectangulo {
    public static void main(String[] args) {
    /*Declarar variables*/
        double cateto1,cateto2,hipotenusa,angulo1,angulo2;
        /*Crear Scanner*/
        Scanner S=new Scanner(System.in);
        /*Introducir datos*/
        System.out.println("Introduce los dos catetos ");
        cateto1=S.nextInt();
        cateto2=S.nextInt();
        /*Calcular hipotenusa*/
        hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        /*Mostrar hipotenusa*/
        System.out.println("La hipotenusa mide " + hipotenusa);
        /*Calcular angulos*/
        angulo1=Math.atan(cateto1/cateto2);
        angulo2=Math.atan(cateto2/cateto1);
        /*Mostrar angulos*/
        System.out.println("Los angulos miden "+ angulo1 + " radianes y " + angulo2 + " radianes." ); 
    }   
}
