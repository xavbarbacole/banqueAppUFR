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
public class Banque {
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


//    public Banque(String nom, Compte[] lesComptes) {
//        this.nom = nom;
//        this.lesComptes = lesComptes;
//        this.nbComptes = lesComptes.length;
//    }
    public boolean ajouterCompteCourrant(Client unClient,int solde) {
        if (nbComptes<lesComptes.length ){
            Compte c = new CompteCourant("COUR"+nbComptes, solde,unClient);
            lesComptes[nbComptes]=c;
            nbComptes++;
            return true;
        } else { return false;}
    }
    public boolean ajouterCompteEpargne(Client unClient,int solde, int interet, int taux) {
        if (nbComptes<lesComptes.length ){
            Compte c = new CompteEpargne("EPAR"+nbComptes, solde,unClient, interet, taux);
            lesComptes[nbComptes]=c;
            nbComptes++;
            return true;
        } else { return false;}
    }

    public boolean ajouterCompte(Compte unCompte) {
        // renvoie un false si la taille du tableau est atteinte
        
        if (nbComptes<lesComptes.length ){
            lesComptes[nbComptes]=unCompte;
            nbComptes++;
            return true;
        } else { return false;}
    }
    
//    public void affiche() {
//        System.out.print ("La banque "+nom);
//        for (int i=0;i<nbComptes;i++)
//            System.out.println("compte : " + lesComptes[i].getSolde()+ " "+ lesComptes[i].getUnClient().getNom());
//    }
          
    public void afficheClients() {
       System.out.println("la banque : "+ nom);
       System.out.println("nbClients : "+ nbClients);
        for (int i=0;i<nbClients;i++) {
            System.out.println("-------------------------------- Client : n°" + i);
            lesClients[i].affiche();
        }
    }
    public void afficheComptes() {
       System.out.println("la banque : "+ nom);
       System.out.println("nbComptes : "+ nbComptes);
        for (int i=0;i<nbComptes;i++) {
            System.out.println("-------------------------------- Compte Client : n°" + i);
            
            this.lesComptes[i].affiche();
            //System.out.println(lesComptes[i].getSolde()+" "+lesComptes[i].getNumCpt());
        }
    }
}
