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
public class Tuniprod3b8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ProduitAgricole p1 = new ProduitFruit(1254, "Fraise", 12.3f, "Mars");
        ProduitAgricole p2 = new ProduitFruit(1224, "Pasteque", 12.3f, "Juin");
     ProduitAgricole p3 = new ProduitFruit(7896, "Mandarine", 12.3f, "Decembre");
       ProduitAgricole p4 = new ProduitLegume(8521, "Artichauts", 12.3f, "Janvier");
        ProduitAlimentaire p5 = new ProduitAlimentaire(222 , "TROPICO " , "danon" , -12f);

            Magasin mg = new Magasin(0, "MG", "Ghazela");

        try {
             mg.ajouterProduit(p5);
             mg.ajouterProduit(p2);
             mg.ajouterProduit(p3);
             mg.ajouterProduit(p4);
        }
        catch (MagasinPleinException e) {
            System.out.println("IMPOSSIBLE MON AMI  " + e.getMessage());
        }
        catch (PrixNegatifException e1) {
            System.out.println("IMPOSSIBLE AUSSI: " + e1.getMessage());
        }


        //mg.ajouterProduit(p2);

        //mg.ajouterProduit(p3);
        //mg.ajouterProduit(p4);
        
       // System.out.println(p4.determinerTypeProduit());
        
        
////        ProduitAlimentaire pa0 = new ProduitAlimentaire();
////        
////        ProduitAlimentaire pa1 = new ProduitAlimentaire(1021,"Lait","Delice");
////        ProduitAlimentaire pa2 = new ProduitAlimentaire(2510,"Yaourt","Vitalait");
////        
////        ProduitAlimentaire pa3 = new ProduitAlimentaire(3250,"Tomate", "Sicam" , 1.200f);
////        
////        //pa0.afficher();
////        //pa1.afficher();
////        //pa2.afficher();
////        //pa3.afficher();
////        
////        pa1.setPrix(0.7f);
////        pa2.setPrix(0.9f);
////        
////        pa3.setPrix(4f);
////        
////        pa0.setLibelle("Pain");
////        pa0.setMarque("Baguette");
////        pa0.setPrix(0.2f);
////        
////        //System.out.println(pa1.getPrix());
////        //System.out.println(pa1);
////        
////        System.out.println(pa0);
////        System.out.println(pa1);
////        System.out.println(pa2);
////        System.out.println(pa3);
////        
////        Date dateExpiration = new Date(805642200000l);
////        pa1.setDateExpiration(dateExpiration);
////        System.out.println(pa1.getDateExpiration());
//
//        
//        /*Magasin mg = new Magasin(1, "Ghazela");
//        Magasin mg1 = new Magasin(2, "Mornag");
//        
//        ProduitAlimentaire pa0 = new ProduitAlimentaire();
//        ProduitAlimentaire pa1 = new ProduitAlimentaire(1021, "Lait", "Delice");
//        ProduitAlimentaire pa2 = new ProduitAlimentaire(2510, "Yaourt", "Vitalait");
//        ProduitAlimentaire pa3 = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);
//
//        mg.ajouterProduit(pa0);
//        mg1.ajouterProduit(pa1);
//        mg1.ajouterProduit(pa2);
//        mg1.ajouterProduit(pa3);
//        
//        
//        System.out.println(mg);
//        System.out.println(mg1);*/
//        
//        //ProduitAlimentaire pa1 = new ProduitAlimentaire(1021,"Lait","Delice");
//        //ProduitAlimentaire pa2 = new ProduitAlimentaire(2510,"Yaourt","Vitalait");
//    
//        //ProduitAlimentaire.comparer(pa1, pa2);
//        //pa1.comparer(pa2);
//        
//        ProduitAlimentaire produit1 = new ProduitAlimentaire();
//        ProduitAlimentaire produit2 = new ProduitAlimentaire(1021, "Lait", "Delice");
//        ProduitAlimentaire produit3 = new ProduitAlimentaire(2510, "yaourt", "Vitalait");
//        ProduitAlimentaire produit4 = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);
//        ProduitAlimentaire produit44 = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);
//
//        
//        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
//        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");
//
//        Caissier caissierC1 = new Caissier(123456, "Ariana", "Mahamed", 36,5);
//        Caissier caissierC2 = new Caissier(894679, "Tunis", "Ali", 40,2);
//        Vendeur vendeurC1 = new Vendeur(10,849895, "Charguia", "Nihel", 50);
//        Responsable responsableC1 = new Responsable(500, 6889566, "Raoued", "taheni", 52);
//
//        Caissier caissierM1 = new Caissier(48912, "Tunis", "Kais", 42,9);
//        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Abdou", 15);
//        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
//
//        System.out.println(vendeurC1);
//        
//        //monoprix.ajouterEmploye(caissierC1);
//        //monoprix.ajouterEmploye(caissierC2);
//        //monoprix.ajouterEmploye(vendeurC1);
//        //monoprix.ajouterEmploye(responsableC1);
//
//        //carrefour.ajouterEmploye(caissierM1);
//        //carrefour.ajouterEmploye(vendeurM1);
//        //carrefour.ajouterEmploye(responsableM1);
////        System.out.println("-------------");
////        monoprix.afficherEmployes();
////        System.out.println("-------------");
////        carrefour.afficherEmployes();
//
//        //monoprix.ajouterProduit(produit2);
//        //monoprix.ajouterProduit(produit3);
//        //carrefour.ajouterProduit(produit3);
//        //carrefour.ajouterProduit(produit4);
//        //System.out.println("-------------");
//        //System.out.println(monoprix);
//        //System.out.println("-------------");
//        //System.out.println(carrefour);
//        
//    }
    }
}
