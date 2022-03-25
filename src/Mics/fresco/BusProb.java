package fresco;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
            System.out.println(listOfInputStrings);
            outstring= PassangersList.addPassanger(capacity, listOfInputStrings,query);
        }
        if(query.equals("2")){
            int noOfPassengersInBus=0;
            int n=0;
            int n3=0;
            int n6=0;
            float n6price=0;
            float n3price=0;
            float nprice=0;
      for (String str : listOfInputStrings) {
        int noOfPassengerGotInBus = 0;
        int noOfPassengerGotOutBus = 0;
        String[] strArr = str.split(" ");
        for (String s : strArr) {

          if (s.contains("+")) {
            noOfPassengerGotInBus++;
          } else {
            noOfPassengerGotOutBus++;
          }
        }
        noOfPassengersInBus =
            noOfPassengersInBus +(noOfPassengerGotInBus - noOfPassengerGotOutBus);
        System.out.println(noOfPassengersInBus);
        System.out.println(
            Fare.findFare(capacity, noOfPassengersInBus) + "->" + noOfPassengerGotInBus);
        if (((noOfPassengersInBus * 100) / capacity) <= 25) {
          n6++;
        }
        if (((noOfPassengersInBus * 100) / capacity) > 50) {
          n++;
        } if(((noOfPassengersInBus * 100) / capacity) >= 25 && ((noOfPassengersInBus * 100) / capacity) <=50 ) {
          n3++;
        }
      }
        }
        if(query.contains("3,")){
            outstring= PassangersList.addPassanger(capacity, listOfInputStrings,query);
        }
        if (query.contains("4,")){
            outstring= PassangersList.addPassanger(capacity, listOfInputStrings,query);
        }
        if(query.contains("5,")){
            outstring= PassangersList.addPassanger(capacity, listOfInputStrings,query);
        }
    System.out.println(outstring);
        return outstring;
    }
}
class PassangersList{
    private static ArrayList<Passanger> list = new ArrayList<Passanger>();

    static String addPassanger(int capacity,List<String> listOfInputStrings,String query){
        int in=0;
        int out=0;
        int n=0;
        int n3=0;
        int n6=0;
        float totalFare=0;
        int inCountById=0;
        for(String str :listOfInputStrings){
           String[] strArr = str.split(" ");
            int incountperstop=0;
            int outcountperstop=0;
           for(String s :strArr){

               if(s.contains("+")){
                   incountperstop++;
                   String id = s.replace("+", "");
                   int currentPercentage = ((incountperstop-outcountperstop)*100/capacity);
                   double price=0;
                   System.out.println(currentPercentage);
                   if(currentPercentage<25){
                       price=(capacity+(capacity*0.6));
                       n6++;
                   }
                   if(currentPercentage>=25&&currentPercentage<=50){
                       price=(capacity+(capacity*0.3));
                       n3++;
                   }
                   if(currentPercentage>50){
                       price=capacity;
                       n++;
                   }
                   if(capacity%2!=0||capacity%4!=0){
                       price=Math.ceil(price);
                   }
                   if(query.contains("3,")){
                       String inputid = query.split(",")[1];

                       if(inputid.contains(id)){

                           totalFare=totalFare+(float) price;
                       }
                   }
                   if(query.contains("4,")){
                       String inputid = query.split(",")[1];

                       if(inputid.contains(id)){

                           inCountById++;
                       }
                   }
                   Passanger p = new Passanger(Integer.parseInt(id),(float)price);
                   list.add(p);
                   in++;
               }else{
                   String id = s.replace("+", "");
                   list.removeIf((e)->e.id==Integer.parseInt(id));
                   out++;
                   outcountperstop++;
               }
           }

        }

        if(query.equals("1")){
            return in+" passengers got on the bus and "+out+" passengers got out of the bus";
        }
        if(query.equals("2")){
            float n6price=(float)(capacity+(capacity*0.6));
            float n3price=(float)(capacity+(capacity*0.3));
            float nprice=capacity;
            if(capacity%2!=0||capacity%4!=0){
                nprice=(float) Math.ceil(nprice);
            }
      return n6
          + " passengers traveled with a fare of "+n6price+","+ n3 +" passengers traveled with a fare of "+n3price+" and "+n+" passengers traveled with a fare of "+nprice;
        }
        if(query.contains("3,")){
            return "Passenger"+ query.split(",")[1] +" spent a total fare of "+ totalFare;
        }
        if(query.contains("4,")){
            return "Passenger"+ query.split(",")[1] +" has got on the bus for "+inCountById+" times";
        }
        if (query.contains("5,")){
           if(list.stream().map((e)->(e.id+"").contains(query.split(",")[1])).collect(Collectors.toList()).isEmpty()){
               return "Passenger"+query.split(",")[1]+" was not inside the bus at the end of the trip";
           }else{
               return "Passenger"+query.split(",")[1]+" was inside the bus at the end of the trip";
           }
        }
        return "";
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