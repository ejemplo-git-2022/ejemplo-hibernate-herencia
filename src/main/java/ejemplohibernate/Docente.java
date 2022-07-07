package ejemplohibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "docente")
public class Docente extends Persona {

	private Long numeroDeHoraTotales;

	public Long getNumeroDeHoraTotales() {
		return numeroDeHoraTotales;
	}

	public void setNumeroDeHoraTotales(Long numeroDeHoraTotales) {
		this.numeroDeHoraTotales = numeroDeHoraTotales;
	}
	

}
