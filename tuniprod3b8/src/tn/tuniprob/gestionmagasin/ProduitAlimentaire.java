package tn.tuniprob.gestionmagasin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author abdelazizmezri
 */

//public-default-protected-private

public class ProduitAlimentaire {
    
    private int identifiant;
    private String libelle;
    private String marque;
    private float prix;
    private Date dateExpiration;
    
    public ProduitAlimentaire(){
        System.out.println("Produit cree avec succes ! 0");
    }
    
    public ProduitAlimentaire(int identifiant, String libelle, String marque){
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        System.out.println("Produit cree avec succes ! 1");
    }
    
    public ProduitAlimentaire(int identifiant, String libelle){
        this.identifiant = identifiant;
        this.libelle = libelle;
    }
    
    public ProduitAlimentaire(int identifiant, String libelle, String marque, float prix){
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        System.out.println("Produit cree avec succes ! 2");
    }
    
    public void afficher(){
        String msg = "ProduitAlimentaire={";
        msg += "identifiant : " + this.identifiant + ", ";
        msg += "libelle : " + this.libelle + ", ";
        msg += "marque : " + this.marque + ", ";
        msg += "prix : " + this.prix;
        msg += "}";
        System.out.println(msg);
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    public float getPrix(){
        return this.prix;
    }
    
    public void setPrix(float prix){
        if(prix > 0)
            this.prix = prix;
        else
            System.out.println("Prix negatif");
    }
    
    public Date getDateExpiration(){
        return this.dateExpiration;
    }
    
    public void setDateExpiration(Date dateExpiration){
        this.dateExpiration = dateExpiration;
    }
    
    @Override
    public String toString() {
        String msg = "ProduitAlimentaire={";
        //msg += "identifiant : " + this.identifiant + ", ";
        msg += "libelle : " + this.libelle + ", ";
        //msg += "marque : " + this.marque + ", ";
        msg += "prix : " + this.prix;
        msg += "}";
        return msg;
    }
    
    public static boolean comparer(ProduitAlimentaire p1, ProduitAlimentaire p2){
        return p1.identifiant == p2.identifiant && p1.prix == p2.prix && p1.libelle.equals(p2.libelle);  
    }
    
    public boolean comparer(ProduitAlimentaire p){
        return this.identifiant == p.identifiant && this.prix == p.prix && this.libelle.equals(p.libelle);  
    }
    
    public String determinerTypeProduit() {
        String type = "ProduitAlimentaire";

        if (this instanceof ProduitAgricole) {
            type = "ProduitAgricole";
        } else if (this instanceof ProduitLaitier) {
            type = "ProduitLaitier";
        }

        return type;
    }
    
}
