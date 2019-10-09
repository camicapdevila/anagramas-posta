package strings;


import java.util.Arrays;
import java.util.Scanner;


public class ger 
{

	
	 public static void main(String[] args) 
	 {
		
	  var entrada=new Scanner (System.in);
		String nombre;
		String nombre2;

	int i=0,bandera=0;
		System.out.println("ingrese dos palabras para saber si son anagramas");
		System.out.println("primera palabra ");
		nombre=entrada.nextLine();
		System.out.println("segunda palabra ");
		nombre2=entrada.nextLine();
		
		

		
		char [] caracteres1=nombre.toCharArray();
		char [] caracteres2=nombre2.toCharArray();
		
		
	      Arrays.sort(caracteres1);
	      
	      Arrays.sort(caracteres2);
	      
	      int longitud1=caracteres1.length;
	      int longitud2=caracteres2.length;
	     
	      if(longitud1==longitud2)
	      {  
	          for (i=0;i<longitud1;i++)
	         {  
	    	 if (caracteres1[i]==caracteres2[i])
	    	    {
	    		
	    		 bandera=bandera+1;
	    	    }
	         }
	     }
	     
	     
		
	    if (bandera==longitud1)  
	    {
	    	System.out.println("es un anagrama");
	    }
	      
	    
	    else 
	    	if (longitud1!=longitud2 || bandera!=longitud1)
	    	{
	    		System.out.println("No es un anagrama");
	    	}
	      
	    	
	    	
	     
	    	  
	      
	      
			
     }


}


