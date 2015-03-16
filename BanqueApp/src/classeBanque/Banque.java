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
public class Banque implements BanqueInterface{
    private String nom;
    private Compte[] lesComptes;
    private int nbComptes;
    private Client[] lesClients;
    private int nbClients;

    public Banque(String nom) {
        this.nom = nom;
        lesComptes = new Compte[100];
        nbComptes = lesComptes.length;
    }
    public Banque(String nom, Client[] lesClients) {
        this.nom = nom;
        this.lesClients = lesClients;
        nbClients=lesClients.length;
        lesComptes = new Compte[100];
        nbComptes = 0; //lesComptes.length;
    }

    public int getNbComptes() {
        return nbComptes;
    }

    public int getNbClients() {
        return nbClients;
    }

    public String getNom() {
        return nom;
    }

    
    public void setNbComptes(int nbComptes) {
        this.nbComptes = nbComptes;
    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }

    

//    public Banque(String nom, Compte[] lesComptes) {
//        this.nom = nom;
//        this.lesComptes = lesComptes;
//        this.nbComptes = lesComptes.length;
//    }
    public boolean ajouterCompte(Client unClient,int solde) {
        int nbComptes = getNbComptes();
        if (nbComptes<lesComptes.length ){
            Compte c = new CompteCourant("COUR"+nbComptes, solde,unClient);
            lesComptes[nbComptes]=c;
            nbComptes++;
            this.setNbComptes(nbComptes);
            return true;
        } else { return false;}
    }
    public boolean ajouterCompte(Client unClient,int solde, int interet, int taux) {
        int nbComptes = getNbComptes();
        if (nbComptes<lesComptes.length ){
            Compte c = new CompteEpargne("EPAR"+nbComptes, solde,unClient, interet, taux);
            lesComptes[nbComptes]=c;
            nbComptes++;
            this.setNbComptes(nbComptes);
            return true;
        } else  return false;
    }

    public boolean ajouterCompte(Compte unCompte) {
        // renvoie un false si la taille du tableau est atteinte
        int nbComptes = getNbComptes();
        if (nbComptes<lesComptes.length ){
            lesComptes[nbComptes]=unCompte;
            nbComptes++;
            setNbComptes(nbComptes);
            return true;
        } else { return false;}
    }
    
    public void affiche() {
        System.out.println ("Fiche de la banque "+getNom());
        afficheClients();
        afficheComptes();
    }
          
    public void afficheClients() {
        int nbClients = getNbClients();
        System.out.println("la banque : "+ getNom());
        System.out.println("nbClients : "+ nbClients);
        for (int i=0;i<nbClients;i++) {
            System.out.println("-------------------------------- Client : n°" + i);
            lesClients[i].affiche();
        }
    }
    public void afficheComptes() {
        int nbComptes = getNbComptes();
        System.out.println("la banque : "+ getNom());
        System.out.println("nbComptes : "+ nbComptes);
        for (int i=0;i<nbComptes;i++) {
            System.out.println("-------------------------------- Compte Client : n°" + i);
            
            this.lesComptes[i].affiche();
            //System.out.println(lesComptes[i].getSolde()+" "+lesComptes[i].getNumCpt());
        }
    }
    
}
