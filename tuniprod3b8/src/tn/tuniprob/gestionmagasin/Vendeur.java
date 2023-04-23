/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author abdelazizmezri
 */
public class Vendeur extends Employe{
    
    private int tauxDeVente;

    public Vendeur(int tauxDeVente, int identifiant, String nom, String adresse, int nbrHeures) {
        super(identifiant, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{ "+ super.toString() + ", tauxDeVente=" + tauxDeVente + '}';
    }
    
    
    
}
