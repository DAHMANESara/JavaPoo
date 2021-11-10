import java.util.Scanner;

public class TP4_Laboratoire{

    private int poids;
    private int ageEnMois;
    private String couleur;
    private int esperanceDeVie;
    private boolean isClone;
    public static final int ESPERANCE_VIE_DEFAUT = 36;


    // Création de notre construteur
    public TP4_Laboratoire(int poids, int ageEnMois, String couleur) {
        this.poids = poids;
        this.ageEnMois = ageEnMois;
        this.couleur = couleur;
        this.esperanceDeVie = ESPERANCE_VIE_DEFAUT;
        this.isClone = false;
        System.out.println("une nouvelle souris !");

    }

    public TP4_Laboratoire(int poids, String couleur) {
        this(poids, 0, couleur);
    }

    //Création d'un constructeur de copie:
    public TP4_Laboratoire(TP4_Laboratoire sourisClone) {
        this.poids = sourisClone.getPoids();
        this.ageEnMois = sourisClone.getAgeEnMois();
        this.couleur = sourisClone.getCouleur();
        this.esperanceDeVie = sourisClone.getEsperanceDeVie()*4/5;
        this.isClone = true;

        System.out.println("Clonage d'une souris");
    }


    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getAgeEnMois() {
        return ageEnMois;
    }

    public void setAgeEnMois(int ageEnMois) {
        this.ageEnMois = ageEnMois;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getEsperanceDeVie() {
        return esperanceDeVie;
    }

    public void setEsperanceDeVie(int esperanceDeVie) {
        this.esperanceDeVie = esperanceDeVie;
    }

    public boolean isClone() {
        return isClone;
    }

    public void setClone(boolean clone) {
        isClone = clone;
    }

    public void vieillir (){

        this.ageEnMois=this.ageEnMois+1;
        if (this.isClone && this.ageEnMois>=esperanceDeVie/2){
            this.couleur="verte";
        }
    }

    public void evoluer(){
        this.ageEnMois = this.ageEnMois+(esperanceDeVie-this.ageEnMois);
    }


    public String toString() {
        if (isClone() == false) {
            return "une souris de couleur " + getCouleur() + " de " + getAgeEnMois() + " mois et pesant " + getPoids() + " grammes";
        } else {
            return "une souris de couleur " + getCouleur() + ",clonée, de " + getAgeEnMois() + " mois et pesant " + getPoids() + " grammes";
        }
    }

}

class Laboratoire {
    public static void main(String[] args) {

        Scanner clavierUtilisateur = new Scanner(System.in);
        TP4_Laboratoire sourisBlanche = new TP4_Laboratoire(50,2, "blanche");
        TP4_Laboratoire sourisGrise = new TP4_Laboratoire(45, "grise");
        TP4_Laboratoire sourisClone = new TP4_Laboratoire(sourisGrise);

        System.out.println(sourisBlanche);
        System.out.println(sourisGrise);
        System.out.println(sourisClone);




        System.out.println("De combien de moi souhaite tu faie veillir la souris blanche");
        int ageSourisBlanche = clavierUtilisateur.nextInt();
        ageSourisBlanche =  ageSourisBlanche - sourisBlanche.getAgeEnMois();
        for (int i=0; i<ageSourisBlanche;i++){
            sourisBlanche.vieillir();
        }
        System.out.println(sourisBlanche);

        System.out.println("De combien de moi souhaite tu faie veillir la souris Grise");
        int ageSourisGrise = clavierUtilisateur.nextInt();
        ageSourisGrise =  ageSourisGrise - sourisGrise.getAgeEnMois();
        for (int i=0; i<ageSourisGrise;i++){
            sourisGrise.vieillir();
        }
        System.out.println(sourisGrise);

        System.out.println("De combien de moi souhaite tu faie veillir la souris clone");
        int ageSourisClone = clavierUtilisateur.nextInt();
        ageSourisClone =  ageSourisClone - sourisClone.getAgeEnMois();
        for (int i=0; i<ageSourisClone;i++){
            sourisClone.vieillir();
        }
        System.out.println(sourisClone);












//
//        System.out.println("la souris clone "+sourisClone.getPoids());
//        System.out.println(nouvelleSouris.getPoids());
    }
}



