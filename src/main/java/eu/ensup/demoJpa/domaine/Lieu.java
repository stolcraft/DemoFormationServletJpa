package eu.ensup.demoJpa.domaine;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String adresse;
	
	@OneToMany(mappedBy="lieu")
	//@OneToMany(fetch=FetchType.EAGER)
	private Collection<Formation> formations;
	
	
	
	public Lieu(int id, String nom, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
	}
	
	
	public Collection<Formation> getFormations() {
		return formations;
	}


	public void setFormations(Collection<Formation> formations) {
		this.formations = formations;
	}


	public Lieu(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	public Lieu() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Lieu [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	
	
}
