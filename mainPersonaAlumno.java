//package Practica_II;

import java.util.*;

public class mainPersonaAlumno
{
    static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
    
        String cad;
        Alumno al=new Alumno(); 
        al.setNombre("Jose");
        al.setEdad(21);
        al.setTelefono("777654321");
        al.vis();
        al.setNumMat("A2222");
        int notas[]=new int[4];
        float s=0;
        for (int i=0;i<notas.length-1;i++)
        {
          notas[i]=(int)(Math.random()*11);
          s+=notas[i];
        }
        notas [3]=(int)(s/3);
        al.setNota(notas);
        System.out.println("Los datos del alumno son");
        System.out.println(al.toString());
    //  Persona persona2=new Persona();
        
    /*  System.out.println("Introduce el nombre");
        cad=teclado.nextLine();
        Alumno al=new Alumno("addd",9);
        al.vis();
        System.out.println(al.getEdad());
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
            }*/
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


