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
public class CompteEpargne extends Compte {
    private int interet;
    private int taux;

    public CompteEpargne(String numCpt, int solde, Client unClient, int interet, int taux) {
        super(numCpt, solde, unClient);
        this.interet = interet;
        this.taux = taux;
    }


    public CompteEpargne(int solde) {
        super(solde);
    }

    public int getInteret() {
        return interet;
    }

    public int getTaux() {
        return taux;
    }

    

    public void affiche () {
        System.out.print ("Compte Epargne: N° : " + this.getNumCpt());
        System.out.print (" solde : " + this.getSolde());
        System.out.print (" dont intérêts : " + this.getInteret());
        System.out.println (" avec un taux : " + this.getTaux());
        
    }
     
    
}
