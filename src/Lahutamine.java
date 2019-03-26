import java.util.Scanner;

public class Lahutamine {
    private int arv1;
    private int arv2;

    public Lahutamine(int arv1, int arv2) {
        if (arv1 >= arv2){
            this.arv1 = arv1;
            this.arv2 = arv2;
        }else{
            this.arv1 = arv2;
            this.arv2 = arv1;
        }
    }

    public int getArv1() {
        return arv1;
    }

    public void setArv1(int arv1) {
        this.arv1 = arv1;
    }

    public int getArv2() {
        return arv2;
    }

    public void setArv2(int arv2) {
        this.arv2 = arv2;
    }

    @Override
    public String toString() {
        return arv1 + " - " + arv2;
    }

    public int Lahutustehe(){
        return arv1 - arv2;

    }

    public int userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sisesta taisarv ");
        int kasutajaVastus = scan.nextInt();
        return kasutajaVastus;
    }

    public boolean tehteKontroll(int arv1, int arv2){
        if (userInput() == arv1 - arv2){
            return true;
        }else{
            return false;
        }
    }
}
