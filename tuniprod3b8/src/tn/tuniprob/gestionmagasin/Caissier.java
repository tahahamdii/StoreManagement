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
public class Caissier extends Employe{
    
    private int numCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbrHeures, int numCaisse){
        super(identifiant, nom, adresse, nbrHeures);
        this.numCaisse = numCaisse;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{ "+ super.toString() + ", numCaisse=" + numCaisse + '}';
    }
    
    
}
