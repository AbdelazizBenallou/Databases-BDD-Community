package com.mycompany.exo_03;
import java.util.ArrayList;
import java.util.Scanner;


public class Scolarite {
    private ArrayList<Stagiaire> listeStagiaires;

    public Scolarite() {
        this.listeStagiaires = new ArrayList<>();
    }

    public void ajouterStagiaire(Stagiaire s) {
        listeStagiaires.add(s);
        System.out.println("Stagiaire ajouté avec succès.");
    }

    public void supprimerStagiaire(int id) {
        for (int i = 0; i < listeStagiaires.size(); i++) {
            if (listeStagiaires.get(i).getId() == id) {
                listeStagiaires.remove(i);
                System.out.println("Stagiaire (ID " + id + ") supprimé avec succès.");
                return;
            }
        }
        System.out.println("Aucun stagiaire trouvé avec l'ID : " + id);
    }

    public void modifierStagiaire(int id) {
        Scanner sc = new Scanner(System.in);
        for (Stagiaire s : listeStagiaires) {
            if (s.getId() == id) {
                System.out.print("Nouveau nom (" + s.getNom() + ") : ");
                s.setNom(sc.nextLine());
                
                System.out.print("Nouveau prénom (" + s.getPrenom() + ") : ");
                s.setPrenom(sc.nextLine());
                
                System.out.print("Nouvelle adresse (" + s.getAdresse() + ") : ");
                s.setAdresse(sc.nextLine());
                
                System.out.print("Nouvelle spécialité (" + s.getSpecialite() + ") : ");
                s.setSpecialite(sc.nextLine());
                
                System.out.print("Nouvelle section (" + s.getSection() + ") : ");
                s.setSection(sc.nextLine());
                
                System.out.print("Nouveau groupe (" + s.getGroupe() + ") : ");
                s.setGroupe(sc.nextInt());
                sc.nextLine(); // Consommer le retour à la ligne

                System.out.println("Informations mises à jour avec succès.");
                return;
            }
        }
        System.out.println("Aucun stagiaire trouvé avec l'ID : " + id);
    }

    public void rechercherStagiaire(int id) {
        for (Stagiaire s : listeStagiaires) {
            if (s.getId() == id) {
                System.out.println("Stagiaire trouvé :");
                s.afficherInformations();
                return;
            }
        }
        System.out.println("Aucun stagiaire trouvé avec l'ID : " + id);
    }


    public void afficherListe() {
        if (listeStagiaires.isEmpty()) {
            System.out.println("La liste des stagiaires est vide.");
        } else {
            System.out.println("--- Liste des Stagiaires ---");
            for (Stagiaire s : listeStagiaires) {
                s.afficherInformations();
            }
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ubuntu
 */
