package BankAccounts;

public class Compte {
    public int numero;
    public double solde;

    Compte(int numero, double solde){
     this.numero=numero;
     this.solde=solde;
    }
    public double verser(double montant){
        System.out.println("versemment effectué avac suucees!!");
        return solde += montant;
    }

    public void retirer(double montant){
        solde -= montant;
    }
}
