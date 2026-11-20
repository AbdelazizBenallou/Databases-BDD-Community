/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exo_03;

/**
 *
 * @author ubuntu
 */
public class Stagiaire {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String specialite;
    private String section;
    private int groupe;


    public Stagiaire(int id, String nom, String prenom, String adresse, String specialite, String section, int groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.specialite = specialite;
        this.section = section;
        this.groupe = groupe;
    }

    public void afficherInformations() {
        System.out.println("ID : " + id + " | Nom : " + nom + " " + prenom + 
                           " | Adresse : " + adresse + " | Spécialité : " + specialite + 
                           " | Section : " + section + " | Groupe : " + groupe);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }

    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }

    public int getGroupe() { return groupe; }
    public void setGroupe(int groupe) { this.groupe = groupe; }
}