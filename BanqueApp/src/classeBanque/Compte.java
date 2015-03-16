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
public abstract class Compte {
    private int solde;
    private String numCpt;
    private Client unClient;

    public Compte() {
        this.solde = 0;
        this.unClient = null;
    }
    public Compte(String numCpt, int solde, Client unClient) {
        this.numCpt = numCpt;
        this.solde = solde;
        this.unClient = unClient;
    }
    public Compte(int solde) {
        this.solde = solde;
        this.unClient = null;
    }

    public int getSolde() {
        return solde;
    }

    public Client getUnClient() {
        return unClient;
    }

    public String getNumCpt() //accessor
        {
        return numCpt;
    }

    public void crediter (int montant) {
        this.solde = this.solde + montant;
    }
    public boolean equals(Compte c){
        return( (c.getSolde() == this.solde) && (c.getUnClient() == this.unClient));
    }
    
    public abstract void affiche();
}
