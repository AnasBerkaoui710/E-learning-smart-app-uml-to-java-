package CommandeEtProduit;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private List<Produit> produits;


Commande(int id){
    this.id=id;
    produits = new ArrayList<>();

}

public void ajouterProduits(Produit p){
    produits.add(p);
}


    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", produits=" + produits +
                '}';
    }
}