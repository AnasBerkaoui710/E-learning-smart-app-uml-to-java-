package CommandeEtProduit;

public class Produit {
    private String nom;
    private Double PrixUnite;
    private int quantite;

    Produit(String nom, Double PrixUnite, int quantite){
        this.nom=nom;
        this.PrixUnite=PrixUnite;
        this.quantite=quantite;
    }




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrixUnite() {
        return PrixUnite;
    }

    public void setPrixUnite(Double prixUnite) {
        PrixUnite = prixUnite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", PrixUnite=" + PrixUnite +
                ", quantite=" + quantite +
                '}';
    }
}





