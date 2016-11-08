
package banco;
import java.util.Arrays;
import java.util.Scanner;

public class Banco {

   
    public static void main(String[] args) {
   
        int eleccion;
        Usuario prueba[]=new Usuario[10];
        double introducir,retirar;
        String[] user={"","",""};
        double[] cuenta=new double[2];
        //cuenta=new double[2];
        
        String nombre="";
        String apellido="";
        String dni=" ";
        String documento_ident=" ";
        
        boolean scape=false;
        boolean scape_gestion=false;
        
        /*System.out.println("introduce tu nombre,apellido y dni.");
        Scanner X=new Scanner(System.in);
        String n=X.next();
        String a=X.next();
        String d=X.next();
        
        prueba[0]=new Usuario(n,a,d);
        
        
        System.out.println(prueba[0].dar_nombre()+" "+prueba[0].dar_apellido()+" "+prueba[0].dar_dni());*/
        
        System.out.println("Bienvenido al programa de gestion de cuenta.");
        
        do{    
    
        System.out.println("¿Que accion quieres realizar?");
        System.out.println("1.Dar de alta usuario.");
        System.out.println("2.Dar de baja usuario.");
        System.out.println("3.Gestionar cuenta de usuario.");
        System.out.println("4.Salir del programa.");
    
        Scanner S=new Scanner(System.in);
        eleccion=S.nextInt();
    
    
        switch(eleccion){
            case 1: 
                System.out.println("Introduce nombre: ");
                nombre=S.next();
                //S.next(); Limpiar buffer.
                System.out.println("Introduce apellido: ");
                apellido=S.next();
                System.out.println("Introduce dni: ");
                dni=S.next();
                Usuario datos=new Usuario(nombre,apellido,dni);
                user[0]=datos.dar_nombre();
                user[1]=datos.dar_apellido();
                user[2]=datos.dar_dni();
                Cuenta valores=new Cuenta();
                cuenta[0]=valores.obtener_cuenta();
                cuenta[1]=valores.obtener_saldo();
                System.out.println("Usuario creado,redireccionando a Inicio.");
                break;
            case 2:
                Arrays.fill(user, null);
                System.out.println("Usuario borrado correctamente");
                break;
            case 3:
                System.out.print("Introduce el DNI: ");
                documento_ident=S.next();
                if(documento_ident.equals(user[2])){
                System.out.println("Usuario valido, que accion quiere realizar: ");
                do{
                scape_gestion=false;
                System.out.println("1.Introducir saldo.");
                System.out.println("2.Sacar saldo.");
                System.out.println("3.Mostrar datos.");
                System.out.println("4.Salir de gestion de usuario.");
                 
                eleccion=S.nextInt();
                   
                    switch(eleccion){
                        case 1: 
                            System.out.println("¿Que cantidad quiere introducir?");
                            introducir=S.nextDouble();
                            cuenta[1]=cuenta[1]+introducir;
                            System.out.println("Cantidad ingresada correctamente");
                            break;
                        case 2:
                            System.out.println("¿Que cantidad quiere retirar?");
                            retirar=S.nextDouble();
                            cuenta[1]=cuenta[1]-retirar;
                            System.out.println("Cantidad retirada correctamente");
                            break;
                        case 3:
                            for (int i=0;i<user.length;i++){
                                System.out.println(user[i]);
                            }
                        
                            System.out.println("Numero de cuenta "+ cuenta[0]+ " con saldo = " + cuenta[1] + "€");
                            
                            break;
                        case 4:
                            scape_gestion=true;
                            break;
                    }
                            
                    }while(scape_gestion==false);
                }
                
            
                else{
                    System.out.println("El usuario con ese DNI no existe");
                
                }
                break;
    
            case 4:
                scape=true;
                break;
            
        
        
        
        
            }    
        }while(scape==false);
        
/*System.out.println(nombre+" "+apellido+" "+ dni);    
System.out.println(user[0]);    
System.out.println(user[1]);   
System.out.println(user[2]);*/   
//System.out.println(cuenta[1]);    
        
/*Comentarios al introducir y sacar dinero*/
/*Mas de un usuario*/
/*teclado.flush();*/    
        
        
        
        
        
        
        
        
    }
    
}
    
    

