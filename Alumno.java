public class Alumno extends Persona
{
private String numMat;
private int nota[];

public Alumno()
{
super();
}
public Alumno (String nM)
{
super();
numMat=nM;
}
public void setNumMat(String nm)
{
     numMat=nm;
}
	
public void setNota( int n[])
{
nota=n;
}
public String toString ()
		{
		    double s=0;
		String cad=super.toString()+" numMAT= "+numMat+" Notas ";
		for (int i=0;i<nota.length-1;i++)
		{
		    cad+=nota[i]+" ";
		}
		cad+="=>"+nota[3];
		return cad;
}

}