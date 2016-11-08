
package desglosar_segundos;
import java.util.Scanner;
public class Desglosar_segundos {

    
    public static void main(String[] args) {
       
        int segundos;
        int semana,dia,hora,minuto;
        
        Scanner S=new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de segundos: ");
        segundos=S.nextInt();
        
        semana=segundos/604800;
        segundos=segundos%604800;
       
        
        dia=segundos/86400;
        segundos=segundos%86400;
        
        
        hora=segundos/3600;
        segundos=segundos%3600;
       
        
        minuto=segundos/60;
        segundos=segundos%60;
        
        
        System.out.println(semana+" semana/s, " + dia+" dia/s, " + hora+" hora/s, " + minuto +" minuto/s, " +segundos+" segundo/s");
        
        
        
    }
    
}
