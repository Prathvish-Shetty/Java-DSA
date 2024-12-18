package _1.Basics;

import java.util.Scanner;

class Country{
    private final String name;
    float area;
    long population;
    double gdp;
    Country(){
        this.name = "Bharat";
        this.area = 32_87_263.65f;
        this.population =142_354_143;
        this.gdp = 3732224486517.15;
    }
//    Constructor Overloading
    Country(String name,float area,long population,double gdp){
        this.name = name;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
    }
    public void showData(){
        System.out.println("Country's name : "+name);
        System.out.println("Country's area : "+area+" sq.km");
        System.out.println("Country's population : "+population);
        System.out.println("Country's gdp : $"+gdp);
        System.out.println();
    }
    public double pci(){
        return gdp/population;
    }
    public static void getCountryAddress(){
        System.out.println("This country is located on Earth which is the only habitable planet in the Solar System of Milkiway Galaxy");
    }

    public void setArea(float area){
        this.area = area;
    }
    public void setPopulation(long population){
        this.population = population;
    }
    public void setGdp(double gdp){
        this.gdp = gdp;
    }
}
public class myCountry {
    public static void main(String[] args) {
        Country c1 = new Country();
        c1.showData();

        Country c2 = new Country("America",9832517,333290534,25439700264870.0);
        c2.showData();

        System.out.println("GDP per person is : "+c1.pci());
        double pci = c2.pci();
        System.out.println("GDP per person is : "+String.format("%.2f", pci));
        System.out.println();

        c1.setArea(5325456.56f);
        c1.setPopulation(157854143);
        c1.setGdp(35486155486310.65);

        c1.showData();

//        Array of country objects
        System.out.println("Enter number of countries : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Country[] countries = new Country[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i+1+" Enter Country name,area,population,gdp : ");
            String name = sc.next();
            float area = sc.nextFloat();
            long population = sc.nextLong();
            double gdp = sc.nextDouble();
            countries[i] = new Country(name,area,population,gdp);
        }
        System.out.println();

//        Display Array of objects
        for (int i = 0; i < n; i++) {
            countries[i].showData();
        }

        Country.getCountryAddress();
    }
}
