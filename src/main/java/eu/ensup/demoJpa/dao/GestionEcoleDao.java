package eu.ensup.demoJpa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.demoJpa.domaine.Formation;
import eu.ensup.demoJpa.domaine.Lieu;

public class GestionEcoleDao extends AccesBd {

	ResultSet rs = null;
	int id;
	String nom;
	String prenom;
	String mail;
	String adresse;
	int tel;
	String dateNaissance;
	String ecole;

	public void insertion() {
		// TODO Auto-generated method stub
		seConnecter();
		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		// 2 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet m�tier
		/*
		 * Lieu lieu = new Lieu("Objis","2 rue colonell driant"); Formation formation =
		 * new Formation("JPA", lieu);
		 */

		Lieu lieu = new Lieu("Objis", "2 rue colonell driant");
		Formation formation = new Formation("JPA", lieu);

		/* Lieu lieux = em.getReference(Lieu.class, 1); */
		/*
		 * Formation formation = em.getReference(Formation.class, 2); Lieu lieu =
		 * formation.getLieu();
		 */

		/* System.out.println("toues le lieux : " + lieux); */

		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
		em.persist(formation);

		// 5 : Fermeture transaction
		tx.commit();

		// 6 : Fermeture unit� de travail JPA
		em.close();
		emf.close();

		System.out.println("la base est fini d'etre crée");
		seDeconnecter();

	}

}
