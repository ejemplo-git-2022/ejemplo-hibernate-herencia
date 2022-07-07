package ejemplohibernate;

import org.hibernate.*;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();


		Persona persona1 = new Persona();
		persona1.setNombre("Juan");
		session.save(persona1);
		
		Direccion direccion = new Direccion();
		direccion.setPersona(persona1);
		session.save(direccion);
		
		persona1.setDireccion(direccion);
		session.update(persona1);
		
		Alumno alumno = new Alumno();
		alumno.setNombre("Lucas");
		alumno.setNumeroDeLegajo(12342L);
		
		session.save(alumno);

		
		transaction.commit();
		session.close();
		sf.close();
	}

}
