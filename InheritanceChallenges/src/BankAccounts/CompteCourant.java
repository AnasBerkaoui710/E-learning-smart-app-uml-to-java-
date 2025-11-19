package BankAccounts;

public class CompteCourant extends Compte {
    public double limiteDecouvert;

    CompteCourant(int numero, double solde){
        super(numero, solde);
    }

}
