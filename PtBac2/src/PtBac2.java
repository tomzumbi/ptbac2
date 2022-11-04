import java.util.Scanner;

public class PtBac2 {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b*b -4*a*c;
        return delta;
    }

    public double getRoot1(){
        double r1 = (-b +Math.sqrt(b*b -4*a*c))/2*a;
        return r1;
    }
    public




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PtBac2 ptBac2 = new PtBac2();
        System.out.println("nhap a");
        ptBac2.setA(scanner.nextDouble());
        System.out.println("nhap b");
        ptBac2.setB(scanner.nextDouble());
        System.out.println("nhap c");
        ptBac2.setC(scanner.nextDouble());
        if (ptBac2.getDiscriminant() >= 0){
            System.out.println(ptBac2.getRoot1());
        }
    }

}
