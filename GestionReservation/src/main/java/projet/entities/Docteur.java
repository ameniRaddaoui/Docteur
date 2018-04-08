package projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Docteur implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nom;
	private String specialite;
	private String adresse;
	private String conventionnecnam;
	private String email;
	private String genre;
	private String gouvernorat;
	private String motPasse;
	private String prenom;
	private String telephone;
	
	
	public Docteur(Long id, String nom, String specialite, String adresse, String conventionnecnam, String email,
			String genre, String gouvernorat, String motPasse, String prenom, String telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.specialite = specialite;
		this.adresse = adresse;
		this.conventionnecnam = conventionnecnam;
		this.email = email;
		this.genre = genre;
		this.gouvernorat = gouvernorat;
		this.motPasse = motPasse;
		this.prenom = prenom;
		this.telephone = telephone;
	}
	
	public Docteur(String nom, String specialite, String adresse, String conventionnecnam, String email, String genre,
			String gouvernorat, String motPasse, String prenom, String telephone) {
		super();
		this.nom = nom;
		this.specialite = specialite;
		this.adresse = adresse;
		this.conventionnecnam = conventionnecnam;
		this.email = email;
		this.genre = genre;
		this.gouvernorat = gouvernorat;
		this.motPasse = motPasse;
		this.prenom = prenom;
		this.telephone = telephone;
	}
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getConventionnecnam() {
		return conventionnecnam;
	}
	public void setConventionnecnam(String conventionnecnam) {
		this.conventionnecnam = conventionnecnam;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getMotPasse() {
		return motPasse;
	}
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
