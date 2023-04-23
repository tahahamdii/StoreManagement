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
public class Responsable extends Employe{
    
    private float prime;

    public Responsable(float prime, int identifiant, String nom, String adresse, int nbrHeures) {
        super(identifiant, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{ "+ super.toString() + ", prime=" + prime + '}';
    }
    
}
