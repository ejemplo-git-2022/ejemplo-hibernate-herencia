package ejemplohibernate;

import javax.persistence.*;

@Entity
public class Telefono {

	private long id;
	private String numero;
	
	@ManyToOne
	public Persona getPersona() {
		return persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	private Persona persona;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
