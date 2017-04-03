
package practica76;


public class calculadora {
   private int num1;
   private int num2;
   private int resultado;
   
   public calculadora(int num1,int num2){
       this.num1=num1;
       this.num2=num2;
   }
   
   public int GetSuma(){
       resultado=num1+num2;
       return resultado;
   }
   public int GetResta(){
       resultado=num1-num2;
       return resultado;
   }
   public int GetMult(){
       resultado=num1*num2;
       return resultado;
   }
   public int GetDiv(){
       resultado=num1/num2;
       return resultado;
   }
   
}
