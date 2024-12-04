package Lab_11.src;
import java.util.*;


public class Flights {
    ArrayList<Plane> FlightList = new ArrayList<>();
    public Flights(String fileName) {
        CSVReader reader = new CSVReader(fileName, false);
        while (reader.hasNext()){
            List<String> p = reader.getNext();
            FlightList.add(new Plane(p.get(0), p.get(1), Integer.parseInt(p.get(2))));
        }
    }

    public ArrayList<Plane> filter(String airline){
        ArrayList<Plane> lst = new ArrayList<>();
        for (Plane p : FlightList){
            if (p.airline.equalsIgnoreCase(airline)){
                lst.add(p);
            }
        }
        return lst;
    }

    public ArrayList<Plane> sorter(ArrayList<Plane> p){
        Collections.sort(p, new Comparator<Plane>() {
            @Override
            public int compare(Plane a, Plane b) {
            // 1. If a > b, return 1
            // 2. If a < b, return -1
            // 3. If a == b, return 0
                //Students write this
                //compare airline first, then city, then time
                int airlineComparison = a.airline.compareToIgnoreCase(b.airline);
                if (airlineComparison != 0) {
                    return airlineComparison;
                }

                int cityComparison = a.city.compareToIgnoreCase(b.city);
                if (cityComparison != 0) {
                    return cityComparison;
                }

                // Compare time manually
                if (a.time > b.time) {
                    return 1;
                } else if (a.time < b.time) {
                    return -1;
                } else {
                    return 0;
                }
                
                
                }
        });
        return p;
    }

    public Plane findFlight(String airline, String city, int earliest, int latest){
        ArrayList<Plane> shortened = filter(airline);
        shortened = sorter(shortened);

        for(Plane p : shortened){
            if (p.city.equalsIgnoreCase(city)){
                if (p.time > earliest && p.time < latest){
                    return p;
                }
            }
        }
        return new Plane("nonexistent", "nowhere", -1);
    }
    public static void main(String[] args){
        //put your tests here
    }
}
