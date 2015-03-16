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
public class Entreprise extends Client {
    private String raisonSociale;

    public Entreprise(String raisonSociale, String ville) {
        super(ville);
        this.raisonSociale = raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void affiche() {
        System.out.print ("Fiche entreprise : raison social : " + this.getRaisonSociale());
        System.out.println (" Ville "+ this.getVille());
        }
    

}
