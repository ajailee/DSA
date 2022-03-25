
import java.util.ArrayList;
import java.util.List;
class Passanger
{
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }
    float fare;
    public Passanger(int id, float fare)
    {
        this.id=id;
        this.fare=fare;
    }
}
public class BusProb {

    public String output(int capacity, int stops, List<String> listOfInputStrings, String query)
    {
        String outstring="";
        if(query.equals("1")){
            outstring= PassangersList.addPassanger(capacity, listOfInputStrings);
        }
        if(query.equals("2")){

        }
        if(query.contains("3,")){
            String id = query.split(",")[1];
            double count=0;
            for(String s: listOfInputStrings){
                if(s.contains("+")){
                    s = s.replace("+","");
                    if(s.equals(id)){
                       // count=count+Fare;
                    }
                }
            }
            outstring="";
        }
        return outstring;
    }
}
class PassangersList{
    private static ArrayList<Passanger> list = new ArrayList<Passanger>();

    static String addPassanger(int capacity,List<String> listOfInputStrings){
        int in=0;
        int out=0;

        for(String s :listOfInputStrings){
            if(s.contains("+")){
                String id = s.replace("+", "");
                float price =(float) Fare.findFare(capacity, list.size());
                Passanger p = new Passanger(Integer.parseInt(id), price);
                list.add(p);
                in++;
            }else{
                String id = s.replace("+", "");
                list.removeIf((e)->e.id==Integer.parseInt(id));
                out++;
            }
        }
        return in+" passengers got on the pus and "+out+" passengers got out of the bus";
    }
}

class Fare{
    static double findFare(int capacity,int passangerCount){
        int currentPercentage = (passangerCount*100/capacity);
        double price=0;
        if(currentPercentage<=25){
            price=(capacity+(capacity*0.6));
        }
        if(currentPercentage>=25&&currentPercentage<=50){
            price=(capacity+(capacity*0.3));
        }
        if(currentPercentage>50){
            price=capacity;
        }
        if(capacity%2!=0||capacity%4!=0){
            price=Math.ceil(price);
        }
        return price;
    }
}