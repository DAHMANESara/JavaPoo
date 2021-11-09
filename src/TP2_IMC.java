

class TP2_IMC{
    private double Poids;
    private double Taille;

    public double getPoids() {
        return Poids;
    }

    public double getTaille() {
        return Taille;
    }

    public void setPoids(double Poids) {
        this.Poids = Poids;
    }

    public void setTaille(double Taille) {
        this.Taille = Taille;
    }

    public double CalculeImc() { double IMC= Poids/(Taille*Taille);
        return IMC ;
    }



}

class main2 {
    public static void main(String[] args) {

        TP2_IMC ImcPatient= new TP2_IMC();

        ImcPatient.setPoids(60);
        ImcPatient.setTaille(1.60);
        System.out.println("IMC patient: "+ ImcPatient.getPoids()+" kg");
        System.out.println("IMC patient: "+ ImcPatient.getTaille()+" m");
        System.out.println("IMC patient: "+ ImcPatient.CalculeImc());




    }

}