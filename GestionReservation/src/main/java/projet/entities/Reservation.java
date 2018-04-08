package projet.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date dateDebutFreq;
	private Date dateFinFreq;
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Secretaire secretaire;
	
	public Reservation(Date dateDebutFreq, Date dateFinFreq, Patient patient, Secretaire secretaire) {
		super();
		this.dateDebutFreq = dateDebutFreq;
		this.dateFinFreq = dateFinFreq;
		this.patient = patient;
		this.secretaire = secretaire;
	}
	public Reservation(Long id, Date dateDebutFreq, Date dateFinFreq, Patient patient, Secretaire secretaire) {
		super();
		this.id = id;
		this.dateDebutFreq = dateDebutFreq;
		this.dateFinFreq = dateFinFreq;
		this.patient = patient;
		this.secretaire = secretaire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDebutFreq() {
		return dateDebutFreq;
	}
	public void setDateDebutFreq(Date dateDebutFreq) {
		this.dateDebutFreq = dateDebutFreq;
	}
	public Date getDateFinFreq() {
		return dateFinFreq;
	}
	public void setDateFinFreq(Date dateFinFreq) {
		this.dateFinFreq = dateFinFreq;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Secretaire getSecretaire() {
		return secretaire;
	}
	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDebutFreq == null) ? 0 : dateDebutFreq.hashCode());
		result = prime * result + ((dateFinFreq == null) ? 0 : dateFinFreq.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + ((secretaire == null) ? 0 : secretaire.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (dateDebutFreq == null) {
			if (other.dateDebutFreq != null)
				return false;
		} else if (!dateDebutFreq.equals(other.dateDebutFreq))
			return false;
		if (dateFinFreq == null) {
			if (other.dateFinFreq != null)
				return false;
		} else if (!dateFinFreq.equals(other.dateFinFreq))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (secretaire == null) {
			if (other.secretaire != null)
				return false;
		} else if (!secretaire.equals(other.secretaire))
			return false;
		return true;
	}
	
	
	
}