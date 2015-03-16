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
public abstract class Client implements BanqueInterface {
   private String ville;

    public Client(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return ville;
    }    

    public void setVille(String ville) {
        this.ville = ville;
    }

    public abstract void affiche();
    
}
