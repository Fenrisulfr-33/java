public class Country implements Comparable<Country>{
    private String name;
    private double area;
    public static boolean compareData;

    public Country(String n, double a){
        name = n;
        area = a;
    }
    public String getName(){
        return name;
    }
    public double getArea(){
        return area;
    }
    public int compareTo(Country other){
        if(compareData){
            return name.compareTo(other.getName());
        }
        if(area == other.getArea()) return 0;
        if(area > other.getArea()) return 1;
        return -1;
    }

    public boolean equals(Country other){
        if(name.equals(other.getName()) && area == other.getArea())
            return true;
        return false;
    }


}