package MyCar;

import java.util.Random;

public class CarDemo implements RandomCar {
    @Override
    public int getRandomCar(int min, int max) {
        Random rndm = new Random();
        int randomNum = rndm.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void main(String[] args) {
        // моторы
        Engine petrol1800 = new Engine("petrol 92", 1.8);
        Engine petrol2500 = new Engine("petrol 95", 2.5);
        Engine petrol3000 = new Engine("petrol 98", 3.0);
        Engine diesel2000 = new Engine("diesel", 2.0);
        Engine diesel3000 = new Engine("diesel", 3.0);
        Engine[] engineArr = {petrol1800, petrol2500, petrol3000, diesel2000, diesel3000};

        // коробка передач
        Transmission automatic = new Transmission("automatic");
        Transmission mechanical = new Transmission("mechanical");
        Transmission[] transmissionArr = {automatic, mechanical};

        // тормоза
        Brakes mixed = new Brakes("mixed");
        Brakes disc = new Brakes("disc");
        Brakes drum = new Brakes("drum");
        Brakes[] brakesArr = {mixed, disc, drum};

        // фары
        Headlight laser = new Headlight("laser");
        Headlight LED = new Headlight("LED");
        Headlight xenon = new Headlight("xenon");
        Headlight[] headlightArr = {laser, LED, xenon};

        // интерьер (обшивка солона)
        Interior blackLeather = new Interior("black", "leather");
        Interior whiteLeather = new Interior("white", "leather");
        Interior blackVelour = new Interior("black", "velour");
        Interior whiteVelour = new Interior("white", "velour");
        Interior[] InteriorArr = {blackLeather, whiteLeather, blackVelour, whiteVelour};

        // персональный конфигуратор
        HondaAccord configurationTop = new HondaAccord(petrol1800, mechanical, disc, xenon, blackVelour);

        // рандомный конфигуратор
        RandomCar randNum = new CarDemo();
        HondaAccord randomHondaAccord = new HondaAccord(
                engineArr[randNum.getRandomCar(0, engineArr.length - 1)],
                transmissionArr[randNum.getRandomCar(0, transmissionArr.length - 1)],
                brakesArr[randNum.getRandomCar(0, brakesArr.length - 1)],
                headlightArr[randNum.getRandomCar(0, headlightArr.length - 1)],
                InteriorArr[randNum.getRandomCar(0, InteriorArr.length - 1)]);

        System.out.println("Honda Accord of personal configuration:");
        configurationTop.getCarInfo();
        System.out.println("\n\nHonda Accord of random configuration:");
        randomHondaAccord.getCarInfo();
    }
}
