// creation de la class qui represente a nouveau type de donnée
public class personne {
    // nom,prenom, pays nbreenfants c'es des attributs de la class personne
    private String nom;
    private String prenom;
    private String pays;
    private boolean estMarie;
    private int nombreEnfants;
// creation d'un constructeur pour la classe personne
public personne( String nom,String prenom,String pays,boolean estMarie,int nombreEnfants)
{
    this.nom=nom;
    this.prenom = prenom;
    this.pays = pays;
    this.estMarie = estMarie;
    this.nombreEnfants = nombreEnfants;
}


//geters permet de retourner  a un attribut prive
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPays() {
        return pays;
    }

    public boolean EstMarie() {
        return estMarie;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }
    // modifier la valeur d’un attribut(privé) sont appelés manipulateurs ou “setters”.


    public void setNom(String nom)
    {
       this.nom=nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setEstMarie(boolean estMarie) {
        this.estMarie = estMarie;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    //creation d'une methode nom complets qui retourne le nom complet dans une class"personne"
    public String nomComplet() {
        return prenom + " " + nom;
    }

}

class main {
    public static void main(String[] args) {
        //creation d'un objet (moi )
        // moi c'est une instance de type personne

        personne moi = new personne("sara","dahmane","algerie",true,0);

        // acceder a un attribut de la class

        //   moi.nom = "sara";
        // moi.prenom = "dahmane";
        //moi.pays = "algerie";
        //moi.estMarie = true;
        //moi.nombreEnfants = 0;


        //moi.setNom("sara");
        //moi.setPrenom("dahmane");
        //moi.setPays("algerie");
        //moi.setNombreEnfants(0);
        //moi.setEstMarie(true);

        System.out.println("Nom : "+moi.getNom());
        System.out.println("Prenom : "+moi.getPrenom());
        System.out.println("Nom complet : "+moi.nomComplet());
        System.out.println("Pays : "+moi.getPays());
        System.out.println("Est married : "+(moi.EstMarie()?"Oui":"Non"));
        System.out.println("Enfants : "+moi.getNombreEnfants());


        // APPELER une methode avec le nom et deux parentheses mais pour un attribut pas besoin de mettre ()
       // System.out.println("Nom : " + moi.nomComplet());

        //    System.out.println("Prenom : "+moi.prenom);
        //  System.out.println("Pays : " + moi.pays);
        //   System.out.println("Est married : " + (moi.estMarie ? "Oui" : "Non"));
        //    System.out.println("Enfants : " + moi.nombreEnfants);
    }
}



