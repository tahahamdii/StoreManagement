package tn.tuniprob.gestionmagasin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abdelazizmezri
 */
public class Magasin {

    private int id;
    private String nom;
    private String adresse;
     final int CAPACITE = 2;
    private ProduitAlimentaire[] produits;
    private Employe[] employees;

    private int nbProduits;
    private int nbEmployes;

    private static int nbProduitsTotal = 0;

    public Magasin() {

        this.produits = new ProduitAlimentaire[CAPACITE];
        this.employees = new Employe[20];
        this.nbProduits = 0;

    }

    public Magasin(int id, String adresse) {

        this.id = id;
        this.adresse = adresse;
        this.produits = new ProduitAlimentaire[CAPACITE];
        this.employees = new Employe[20];
        this.nbProduits = 0;

    }

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.produits = new ProduitAlimentaire[CAPACITE];
        this.employees = new Employe[20];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Employe[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employe[] employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ProduitAlimentaire[] getProduits() {
        return produits;
    }

    public void setProduits(ProduitAlimentaire[] produits) {
        this.produits = produits;
    }

    public void ajouterProduit(ProduitAlimentaire produit) throws MagasinPleinException, PrixNegatifException {
        if (nbProduits < CAPACITE) {
            if (produit.getPrix() >= 0) {
                produits[nbProduits] = produit;
                nbProduits++;
            } else {
                throw new PrixNegatifException("Le prix est négatif.");
            }
        } else {
            throw new MagasinPleinException("Le magasin est plein.");
        }
    }


    public void ajouterEmploye(Employe e) {
        if (nbEmployes < 20) {

            this.employees[nbEmployes] = e;
            nbEmployes++;
            System.out.println("Emloye ajoute");

        } else {
            System.out.println("Magasin saturee");
        }
    }

    @Override
    public String toString() {

        String msg = "Magasin{" + "id=" + id + ", adresse=" + adresse + ", nbTotal=" + nbProduitsTotal + '}';
        msg += "Produits : [";

        for (int i = 0; i < this.nbProduits; i++) {
            msg += this.produits[i];
        }
        msg += " ]";
        return msg;
    }

    public int getNbProduits() {
        return this.nbProduits;
    }

    public static int getNbProduitsTotal() {
        return Magasin.nbProduitsTotal;
    }

    public boolean chercherProduit(ProduitAlimentaire p) {

        for (ProduitAlimentaire pa : produits) {
            if (pa.comparer(p)) {
                return true;
            }
        }

        return false;
    }

    public int indexProduit(ProduitAlimentaire p) {

        for (int i = 0; i < nbProduits; i++) {
            if (p.comparer(produits[i])) {
                return i;
            }
        }

        return -1;
    }

    public void supprimerProduit(ProduitAlimentaire p) {
        int index = indexProduit(p);
        if (index != -1) {
            for (int i = index; i < nbProduits - 1; i++) {
                produits[i] = produits[i + 1];
            }
            nbProduits--;
            produits[nbProduits] = null;
        } else {
            System.out.println("Produit introuvable");
        }
    }

    public Magasin comparerMagasin(Magasin mg) {
        if (this.nbProduits > mg.nbProduits) {
            return this;
        }
        return mg;
    }

    public static Magasin comparerMagasin(Magasin mg1, Magasin mg2) {
        if (mg1.nbProduits > mg2.nbProduits) {
            return mg1;
        }
        return mg2;
    }
    
    public float calculStock(){
        //inhanced for loop
        /*for(ProduitAlimentaire p : produits){
            
        }*/
        float stock = 0;
        
        for(int i=0; i<nbProduits ; i++){
            if(produits[i] instanceof ProduitFruit)
                stock += ((ProduitFruit)produits[i]).getQuantite();
        }
        return stock;
    }

}
