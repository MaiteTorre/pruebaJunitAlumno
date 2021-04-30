//package Practica_II;

import java.util.*;

public class AppArrayAlumnos
{
    static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
    
        String cad;
        System.out.println("Introduce numero de alumnos");
        int num=leerEntero();
        Alumno arrayAlumnos[]=new Alumno[num];
        
        Alumno alu1=new Alumno();
        alu1.setNombre("Jose");
        ak1.setEdad(21);
        persona1.setTelefono("777654321");
        
        persona1.vis();
        
        Persona persona2=new Persona();
        
        System.out.println("Introduce el nombre");
        cad=teclado.nextLine();
        persona2.setNombre(cad);
        
        System.out.println("Introduce edad");
        int num=leerEntero();
        persona2.setEdad(num);
        
        System.out.println("Introduce telefono");
        teclado=new Scanner(System.in);
        cad=teclado.nextLine();
        persona2.setTelefono(cad);
        persona2.vis();
        
        
        if(persona1.getEdad()<persona2.getEdad())
            System.out.println("La persona de menor edad es"+persona1.getNombre());
        else
            System.out.println("La persona de menor edad es"+persona2.getNombre());
        
        
            System.out.println("Dame el numero de personas adel array");
            int n=leerEntero();
                
            Persona arrayPersonas[]=new Persona[n];
            for (int i=0;i<n;i++)
            {
            arrayPersonas[i]=new Persona();
            System.out.println("Introduce el nombre de la Persona "+(i+1)+": ");
                teclado=new Scanner(System.in);//liberar buffer de lectura
            arrayPersonas[i].setNombre(teclado.nextLine());
        
            System.out.println("Introduce edad");
            arrayPersonas[i].setEdad(leerEntero());
        
            System.out.println("Introduce telefono");
            teclado=new Scanner(System.in);//liberar buffer de lectura
            arrayPersonas[i].setTelefono(teclado.nextLine());
            }
            System.out.println("El array es: ");
            for (int i=0;i<arrayPersonas.length;i++)
            {
            arrayPersonas[i].vis();
            }
    }   
        
        
        public static int leerEntero()
        {
            int n=0;
            boolean error=false;
            
            do
            {
                try
                {
                    error=false;
                    teclado=new Scanner(System.in);//liberar el buffer
                    n=teclado.nextInt();
                    
                    if(n<=0)
                    {
                        System.out.println("Introduce un numero positivo");
                        error=true;
                    }
                }
                
                catch (Exception e)
                {
                    error=true;             
                    System.out.println("Error en la lectura, introduce un numero ");
                }
            }
            while(error);
            
            return n;
        }
        
        
        
        
}


