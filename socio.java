

		public void escritura(){


		File f=new File("socios.txt");
		//BufferedReader bf=new BufferedReader(f);
		Scanner sc=new Scanner(sc);
		FileOutputStream fos= new FileOutputStream("socios.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		//bf.readline()

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
}
