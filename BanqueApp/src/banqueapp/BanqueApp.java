/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banqueapp;

import classeBanque.Compte;
import classeBanque.Client;
import classeBanque.Particulier;
import classeBanque.Entreprise;
import classeBanque.Administration;
import classeBanque.Banque;



/**
 *
 * @author barbacole
 */
public class BanqueApp {

    /**
     * @param args the command line arguments
     */
    // Les comptes appartiennent à la banque.
    // le contenu des comptes appartient au client
    public static void main(String[] args) {
//       Compte c1,c2;
//       c1 = new Compte();
//       c2 = new Compte();
//      System.out.println((Object)c1.equals(c2)); //transtypage appel la class mère (cast)
//      System.out.println(c1.equals(c2));
//      c2=c1;
//      System.out.println((Object)c1.equals(c2));
//      System.out.println(c1.equals(c2));
//      Client cl = new Client("Dupont","arture","Nancy",1963);
//      Compte c3 = new Compte(100,cl);
//      System.out.println("compte : " + c3.getSolde()+ " "+ c3.getUnClient().getNom());
//      
        // TODO code application logic here
      
      Client[] mesClients;
      mesClients = new Client[7];
      //mesClients[] = new Particulier("","",19,"");
      //mesClients[] = new Entreprise("","");
      mesClients[0] = new Particulier("Dupont","Artur",1965,"Nancy");
      mesClients[1] = new Entreprise("Collectif LaboFolk","Metz");
      mesClients[2] = new Particulier("Durant","Alain",1945,"Metz");
      mesClients[3] = new Entreprise("rdv Folk","Metz");
      mesClients[4] = new Administration("Folk","fede de folk","Metz");
      mesClients[5] = new Particulier("Albert","Dupont",19,"Ludres");
      mesClients[6] = new Entreprise("Folk en Boeuf","Nancy");
      
      Banque maBanque ;
      maBanque = new Banque("Crédit FC",mesClients); //avec 100 comptes
      maBanque.afficheClients();
      
      // affectue des comptes à des client
      if (maBanque.ajouterCompteEpargne(mesClients[0], 100,10,1)) {System.out.println("impossible d'ajouter un compte Epargne au client "+0);}
      if (!maBanque.ajouterCompteCourrant(mesClients[0], 101)) {System.out.println("impossible d'ajouter un compte courrant au client "+0);}
      if (!maBanque.ajouterCompteEpargne(mesClients[1], 110,10,1)) {System.out.println("impossible d'ajouter un compte Epargne au client "+1);}
      if (!maBanque.ajouterCompteCourrant(mesClients[1], 111)) {System.out.println("impossible d'ajouter un compte courrant au client "+1);}
      if (!maBanque.ajouterCompteEpargne(mesClients[2], 220,20,2)) {System.out.println("impossible d'ajouter un compte Epargne au client "+2);}
      if (!maBanque.ajouterCompteCourrant(mesClients[2], 221)) {System.out.println("impossible d'ajouter un compte courrant au client "+2);}
      if (!maBanque.ajouterCompteEpargne(mesClients[3], 330,30,3)) {System.out.println("impossible d'ajouter un compte Epargne au client "+3);}
      if (!maBanque.ajouterCompteCourrant(mesClients[3], 331)) {System.out.println("impossible d'ajouter un compte courrant au client "+3);}
      if (!maBanque.ajouterCompteEpargne(mesClients[4], 440,40,4)) {System.out.println("impossible d'ajouter un compte Epargne au client "+4);}
      if (!maBanque.ajouterCompteCourrant(mesClients[4], 441)) {System.out.println("impossible d'ajouter un compte courrant au client "+4);}
      if (!maBanque.ajouterCompteEpargne(mesClients[5], 550,50,5)) {System.out.println("impossible d'ajouter un compte Epargne au client "+5);}
      if (!maBanque.ajouterCompteCourrant(mesClients[5], 551)) {System.out.println("impossible d'ajouter un compte courrant au client "+5);}
      if (!maBanque.ajouterCompteEpargne(mesClients[6], 660,60,6)) {System.out.println("impossible d'ajouter un compte Epargne au client "+6);}
      if (!maBanque.ajouterCompteCourrant(mesClients[6], 661)) {System.out.println("impossible d'ajouter un compte courrant au client "+6);}

      maBanque.afficheComptes();
}
    
}
