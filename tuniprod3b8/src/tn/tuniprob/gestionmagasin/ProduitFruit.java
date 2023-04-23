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
public class ProduitFruit extends ProduitAgricole  implements Critere{
    
    public ProduitFruit (int id, String libelle, float quantite, String saison){
        super(id, libelle, quantite, saison);
    }

    @Override
    public boolean estFrais(String saison) {
        return this.getSaison().equals(saison);
    }
    
}
