package eu.ensup.demoJpa.domaine;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String theme;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Lieu lieu;
	
	public Formation(int id, String theme, Date datedebut, int duree) {
		super();
		this.id = id;
		this.theme = theme;
	}
	public Formation() {
		super();
	}
	
	
	public Formation(int id, String theme, Lieu lieu) {
		super();
		this.id = id;
		this.theme = theme;
		this.lieu = lieu;
	}
	
	public Formation(String theme, Lieu lieu) {
		super();
		this.theme = theme;
		this.lieu = lieu;
	}
	public Formation(String theme) {
		super();
		this.theme = theme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	

	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + ", lieu=" + lieu + "]";
	}
	
	
}
