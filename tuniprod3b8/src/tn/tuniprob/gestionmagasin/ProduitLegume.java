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
public class ProduitLegume extends ProduitAgricole implements Critere{
    public ProduitLegume (int id, String libelle, float quantite, String saison){
        super(id, libelle, quantite, saison);
    }

    @Override
    public boolean estFrais(String saison) {
        String[] mois = {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre", "janvier"};
        
        int ind = -1;
        
        for(int i=0 ; i<mois.length-1 ;i++){
            if(mois[i].equals(this.getSaison()))
                ind = i;
        }
        
        return saison.equals(mois[ind]) || saison.equals(mois[ind+1]);
    }
}
