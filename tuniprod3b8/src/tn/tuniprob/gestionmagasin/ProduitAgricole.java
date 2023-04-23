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
public class ProduitAgricole extends ProduitAlimentaire{

    private float quantite;
    private String saison;

    public ProduitAgricole() {

    }

    public ProduitAgricole(int id, String libelle, float quantite, String saison) {
        super(id, libelle);
        this.quantite = quantite;
        this.saison = saison;
    }

    @Override
    public String determinerTypeProduit() {
        String type = "Autre";

        if (this.getClass().equals(ProduitFruit.class)) {
            type = "ProduitFruit";
        } else if (this instanceof ProduitLegume) {
            type = "ProduitLegume";
        }

        return type;
        //return this.getClass().toString();
    }
    
    public float getQuantite(){
        return this.quantite;
    }
    
    public String getSaison(){
        return this.saison;
    }

}
