package ejemplohibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "alumno")
public class Alumno extends Persona {
	
	private Long numeroDeLegajo;

	public Long getNumeroDeLegajo() {
		return numeroDeLegajo;
	}

	public void setNumeroDeLegajo(Long numeroDeLegajo) {
		this.numeroDeLegajo = numeroDeLegajo;
	}

}
