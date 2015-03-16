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
public class Administration extends Client{
    private String nomOrganisme;
    private String ministere;

    public Administration(String nomOrganisme, String ministere, String ville) {
        super(ville);
        this.nomOrganisme = nomOrganisme;
        this.ministere = ministere;
    }

    public String getNomOrganisme() {
        return nomOrganisme;
    }

    public String getMinistere() {
        return ministere;
    }

    public void setNomOrganisme(String nomOrganisme) {
        this.nomOrganisme = nomOrganisme;
    }

    public void setMinistere(String ministere) {
        this.ministere = ministere;
    }
    
    public void affiche () {
        System.out.print ("Fiche adminstration : nom : " + this.getNomOrganisme());
        System.out.print (" ministere : " + this.getMinistere());
        System.out.println (" Ville "+ this.getVille());
        
    }
            
    
}
