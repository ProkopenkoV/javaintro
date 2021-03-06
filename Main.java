package _10;


import _10_Interfaces.AudiQ8;
import _10_Interfaces.BMWX5;
import _10_Interfaces.Car_Interface;
import _12.NegativeSpeedException;


public class Main {
    public static void main(String[] args) throws NegativeSpeedException {
        CarSegments[] cars = new CarSegments[]{
                new LadaKalina(13000,6,160,2,5),
                new JaguarXJ(100000,15,300,9,8),
                new AudiA7(60000,12,240,10,7),



        };
        System.out.println("INFORMATION ABOUT CARS IN THE TAXI PARK");

        TaxiPark endTask = new TaxiPark(cars);

        CarSegments[] end;

        System.out.print(endTask.CostOfAllCars());
        System.out.println(" ");
        try{
            end=endTask.getCarsByMaxSpeed(290,400);
            for(int i = 0; i < end.length; i++)
                System.out.println(end[i].toString());
        }catch(Exception e){
            System.out.println("It's impossible to display the technical specifications of the cars staying in a taxi park due to a negative speed value.\n   Car speed must be more than zero. Try again. ");
        }

        Car_Interface audi = new AudiQ8();
        System.out.print(audi.getPrice(70000));
        Car_Interface bmw =  new BMWX5();
        System.out.print(bmw.getPrice(65000));

    }

}























/*System.out.println(endTask);
        System.out.println(" ");*/

       /* endTask.sortByFuelConsumption();
        System.out.println(endTask);*/




       /* System.out.println(Arrays.toString(endTask.searchMaxSpeed(0,10)));

        System.out.println();*/
