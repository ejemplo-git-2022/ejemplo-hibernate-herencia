package ejemplohibernate;

import javax.persistence.*;

@Entity
@Table(name = "DIRECCIONES")
public class Direccion {

	private long id;
	private String calle;
	private long altura;
	private Persona persona;
	
	@OneToOne(mappedBy = "direccion")
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Direccion() {
		
	}
	
	public Direccion(String calle, long altura) {
		super();
		this.calle = calle;
		this.altura = altura;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "NOMBRE_COMPLETO_CALLE")
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public long getAltura() {
		return altura;
	}
	public void setAltura(long altura) {
		this.altura = altura;
	}
	
	
}
