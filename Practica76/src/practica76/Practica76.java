package practica76;

import java.util.Scanner;

public class Practica76 {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int exit=1,opcion,num1,num2;
        
        do{
        System.out.println("CALCULADORA : 1.Suma 2.Resta 3.Multiplicacion 4.Division 5.Salir");
        opcion=S.nextInt();
        
        if(opcion==5){
            exit=0;
            System.out.println("BYE");
        }
        else if(opcion>5){
            System.out.println("No existe la opcion, introduce un numero valido.");
        }
        else{
        System.out.println("Primer numero: ");
        num1=S.nextInt();
        System.out.println("Segundo numero: ");
        num2=S.nextInt();
        
        calculadora calc=new calculadora(num1,num2);
        
        switch(opcion){
            case 1:
                System.out.print("Resultado: ");
                System.out.println(calc.GetSuma());
                break;
            case 2:
                System.out.print("Resultado: ");
                System.out.println(calc.GetResta());
                break;
            case 3:
                System.out.print("Resultado: ");
                System.out.println(calc.GetMult());
                break; 
            case 4:
                System.out.print("Resultado: ");
                System.out.println(calc.GetDiv());
                break;
            }
        }
        }while(exit==1);
        
    }
    
}
