package exercise1_2;

public class GallonToLiters12 {
    private double gallon;
    private double liters;

    public void ConvertGallonToLiters(){
       int counter = 0;

       for (gallon = 1; gallon <= 100; gallon++){

           liters = gallon * 3.7854;
           System.out.println(gallon + " галлонам соответствует " + liters + " литров");

           counter++;

           if (counter == 10){
               System.out.println("");
               counter = 0;
           }




       }

    }
}
