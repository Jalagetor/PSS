
public class socio implements Serializable
{
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private GregorianCalendar nacimiento;

	public socio( String nombre,String apellido1,String apellido2,String dni,GregorianCalendar nacimiento)
	{
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.dni=dni;
		this.nacimiento=nacimiento;
	}

	public String toString()
	{
		return ("Nombre: "+ nombre + " " + apellido1 + " " + apellido2 +" DNI: " + dni + "\nFecha  de nacimiento: " + nacimiento.get(Calendar.DAY_OF_MONTH)+"/"+(1+nacimiento.get(Calendar.MONTH))+"/"+nacimiento.get(Calendar.YEAR));
	}
}