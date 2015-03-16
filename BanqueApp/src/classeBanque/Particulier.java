/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeBanque;

/**
 *
 * @author barbacole
 */
public class Particulier extends Client {
    private String nom;
    private String prenom;
    private int anneeNais;

    public Particulier(String nom, String prenom, int anneeNais, String ville) {
        super(ville);
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNais = anneeNais;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneeNais() {
        return anneeNais;
    }

    public void setAnneeNais(int anneeNais) {
        this.anneeNais = anneeNais;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void affiche() {
        System.out.print ("Fiche client : nom : " + this.getNom());
        System.out.print (" : Prénom  : " + this.getPrenom());
        System.out.print (" : Année de naissance : " + this.getAnneeNais());
        System.out.println (" Ville "+ this.getVille());
    }
    

    
}
