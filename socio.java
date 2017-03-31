import java.io.*;
import java.util.*;
public class socio implements Serializable
{
  //Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private GregorianCalendar nacimiento;
  
  //Constructor
	public socio( String nombre,String apellido1,String apellido2,String dni,GregorianCalendar nacimiento)
	{
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.dni=dni;
		this.nacimiento=nacimiento;
	}//cierre del constructor
  //Metodo para imprimir en pantalla
	public String toString()
	{
		return ("Nombre: "+ nombre + " " + apellido1 + " " + apellido2 +" DNI: " + dni + "\nFecha  de nacimiento: " + nacimiento.get(Calendar.DAY_OF_MONTH)+"/"+(nacimiento.get(Calendar.MONTH))+"/"+nacimiento.get(Calendar.YEAR));
	}//cieere del metodo de imprimir
  //Metodo para escribir
  public void escritura(){
  
		File f=new File("socios.txt");
		Scanner sc=new Scanner(sc);
		FileOutputStream fos= new FileOutputStream("socios.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
  
		while(sc.hasNext()){


			String linea=sc.nextLine();
			StringTokenizer st=new StringTokenizer(linea,'\n');

			while(st.hasMoreElements()){

				String nombre=st.nextToken();
				String apellido1=st.nextToken();
				String apellido2=st.nextToken();
				String dni=st.nextToken();
				String fecha=st.nextToken();

				StringTokenizer fch=new StrinTokenizer(fecha,'/');

				int dia=Integer.parseInt(fch.nextElement());
				int mes=Integer.parseInt(fch.nextElement());
				int anyo=Integer.parseInt(fch.nextElement());
				GregorianCalendar gc=new GregorianCalendar(anyo,mes,dia);

				socio s=new socio(nombre,apellido1,apellido2,dni,gc);

				oos.writeObject(s);
        }
		if(oos!=null){

			oos.close();
			fos.close();

    }

		if(f!=null){

			f.close();

    }
    }
}//cierre del metodo escritura
}//cierre de la clase socio
