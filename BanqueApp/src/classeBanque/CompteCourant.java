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
public class CompteCourant extends Compte {

    public CompteCourant() {
    }

    public CompteCourant(String numCpt, int solde, Client unClient) {
        super(numCpt, solde, unClient);
    }

    public CompteCourant(int solde) {
        super(solde);
    }


    public void affiche () {
        System.out.print ("Compte courant : N° : " + this.getNumCpt()+" ");
        this.getUnClient().affiche();
        System.out.println (" solde : " + this.getSolde());
    }
     
    
}
