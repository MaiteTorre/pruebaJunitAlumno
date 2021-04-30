public class Persona 
{
	private String nombre;
	private String telefono;
	private int edad;
	
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nomb)
	{
		nombre = nomb;
	}
	
	public String getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(String tel) 
	{
		telefono = tel;
	}
	
	public int getEdad() 
	{
		return edad;
	}
	
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	
	
	public void vis()
	{
		System.out.println("Nombre: "+ nombre+" Edad: "+edad+" Telefono: "+telefono);
	}
public String toString ()
		{
		return "nombre= "+nombre+" Telefono "+telefono+ "Edad "+edad;
		}
}
	
	


