

class TP1_DimRect {
    private int longeur;
    private int largeur;
//Donner l'acces leccture
    public int getLongeur() {return longeur;}

    public int getLargeur() {return largeur;}

    //donner l'acces pour modifier

    public void setLongeur(int longeur) {this.longeur = longeur;}

    public void setLargeur(int largeur) {this.largeur = largeur;}

    public int Aire() { int Aire= longeur*largeur;
        return Aire ;
    }
    public int  Perimetre() {
       int  perimetre=2*(longeur+largeur);
        return perimetre;
    }


}

 class CalculerDimensionsRectangle {
    public static void main(String[] args) {

        TP1_DimRect DimenRect= new TP1_DimRect();

      DimenRect.setLongeur(20);
       DimenRect.setLargeur(30);

        System.out.println("aire: "+ DimenRect.Aire());
        System.out.println("perimetre: "+ DimenRect.Perimetre());



    }

}