/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exo_03;

/**
 *
 * @author ubuntu
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scolarite scolarite = new Scolarite();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n MENU GESTION DES STAGIAIRES");
            System.out.println("1. Ajouter un stagiaire");
            System.out.println("2. Afficher tous les stagiaires");
            System.out.println("3. Rechercher un stagiaire par ID");
            System.out.println("4. Modifier un stagiaire par ID");
            System.out.println("5. Supprimer un stagiaire par ID");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Spécialité : ");
                    String specialite = scanner.nextLine();
                    System.out.print("Section : ");
                    String section = scanner.nextLine();
                    System.out.print("Groupe : ");
                    int groupe = scanner.nextInt();
                    scanner.nextLine();

                    Stagiaire nouveau = new Stagiaire(id, nom, prenom, adresse, specialite, section, groupe);
                    scolarite.ajouterStagiaire(nouveau);
                    break;

                case 2:
                    scolarite.afficherListe();
                    break;

                case 3:
                    System.out.print("Entrez l'ID du stagiaire à rechercher : ");
                    int idRech = scanner.nextInt();
                    scolarite.rechercherStagiaire(idRech);
                    break;

                case 4:
                    System.out.print("Entrez l'ID du stagiaire à modifier : ");
                    int idModif = scanner.nextInt();
                    scolarite.modifierStagiaire(idModif);
                    break;

                case 5:
                    System.out.print("Entrez l'ID du stagiaire à supprimer : ");
                    int idSupp = scanner.nextInt();
                    scolarite.supprimerStagiaire(idSupp);
                    break;

                case 0:
                    System.out.println("Fermeture de l'application.");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 0);

        scanner.close();
    }
}