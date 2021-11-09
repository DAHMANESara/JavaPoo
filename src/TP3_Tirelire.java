import java.util.Scanner;

public class TP3_Tirelire{
    private double solde;

    public double getSolde() {
        return solde;
    }

//    public void setSolde(double solde) {
//        this.solde = solde;
//    }

    //Création du construtor
    public TP3_Tirelire(double solde) {
        this.solde = solde;
    }

    public void afficher() {
        if (solde == 0) {
            System.out.println("Vous n'avez pas d'argent");
        } else {
            System.out.println("Vous avez : " + solde + "€ dans votre tirelire");
        }
    }

    public void secouer() {
        if (solde > 0) {
            System.out.println("Bing Bing \n");
        }
    }

    public double remplir(double ajoutMontant) {
        solde = solde + ajoutMontant;
        return solde;
    }

    public void vider() {
        solde = 0;
    }

    public void puiser(double puiserMontant) {
        if (puiserMontant >= solde) {
            solde = 0;
        } else {
            solde = solde - puiserMontant;
        }
    }

    public double caculerSolde(double budget) {

        if (budget <= 0) {
            return solde;
        } else {
            double testSolde = solde - budget;
            return testSolde;
        }
    }

    public void caculerSoldeVaccances(double budget) {
        double testSolde = solde - budget;
        if (testSolde >= 0) {
            System.out.println("Vous êtes assez riche pour partir en vaccances ! il vous restera " + testSolde + "€ à la rentrée");
        } else {                                 //Math.abs pour ne pas avoir le signe negatif sur le nombre ( retourne un positif au lieu du negatif
            System.out.println(" Il vous manque " + Math.abs(testSolde) + " € pour partir en vaccances !");
        }
    }
}


class Tirelire {
    public static void main(String[] args) {
        TP3_Tirelire maTirelire = new TP3_Tirelire(0);
        Scanner clavierUtilisateur = new Scanner(System.in);

        // Exemple d'exécution:
        maTirelire.afficher();
        maTirelire.afficher();
        maTirelire.remplir(550);
        maTirelire.secouer();
        maTirelire.afficher();
        maTirelire.puiser(15);
        maTirelire.afficher();
        System.out.println(maTirelire.getSolde());

        System.out.println("Donnez le budget de vos vaccances :");
        double budgetVaccances = clavierUtilisateur.nextDouble();
        maTirelire.caculerSoldeVaccances(budgetVaccances);

//        System.out.println("mon solde actuel : " + maTirelire.getSolde());

    }

}
