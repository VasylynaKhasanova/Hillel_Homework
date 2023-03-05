package com.homework8;

import com.homework8.animals.Bird;
import com.homework8.animals.Fish;
import com.homework8.animals.Mammal;
import com.homework8.vehicle.airMachines.Balloon;
import com.homework8.vehicle.airMachines.Helicopter;
import com.homework8.vehicle.airMachines.Plane;
import com.homework8.vehicle.landTransport.Bus;
import com.homework8.vehicle.landTransport.Car;
import com.homework8.vehicle.landTransport.Tractor;
import com.homework8.vehicle.waterTransport.Barge;
import com.homework8.vehicle.waterTransport.Boat;
import com.homework8.vehicle.waterTransport.Cutter;

public class Objects {
    public static void main(String[] args) {
        Plane plane = new Plane("airplane", "in the air", "Airfix",
                "jet fuel", "passenger", "452 passengers", "170.6 m³",
                2554, 170.6, 4.4, 6.4, 43.2,
                10000, 15);

        plane.fly();

        Helicopter helicopter = new Helicopter("helicopter", "in the air", "Bronco",
                "jet fuel", "military", "30 passengers", "70.6 m³",
                3554, 12.6, 1.8, 2.8, 5.2,
                5000, 4, 5);

        helicopter.fly();

        Balloon balloon = new Balloon("air balloon", "in the air", "Flex",
                "helium", "6 passengers", "0.6 m³",
                20, 0.45, 10, 3, 4,
                0.5, 2);

        balloon.fly();

        Car car = new Car("car", "on the road", "Volvo", "petrol",
                "5 persons", "20.6 m³", 220, 1.8, 1.4,
                1.5, 6.0);

        car.move();

        Bus bus = new Bus("bus", "on the road", "Bohdan", "petrol", "public",
                "80 passengers", "30.6 m³", 220, 4.3,
                3.2, 4.1, 11.0, true);

        bus.move();
        bus.goAbroad();

        Tractor tractor = new Tractor("tractor", "on the road and on the ground", "Centaur",
                "petrol", "agricultural", "2 persons", "20.6 m³", 160,
                4.1, 5, 5, 6, false, true);

        tractor.move();

        Cutter cutter = new Cutter("water cutter", "by water", "Jamaha", "petrol",
                "10 passengers", "10.4 m³", 200, 1.45, 2.5,
                2.59, 6.48, false, false);

        cutter.swim();

        Barge barge = new Barge("barge", "by water", "Alumarine", "diesel", "cargo",
                "20 passenger", "400 t", 120, 1.7, 4,
                5, 12, false, true, true);

        barge.swim();
        barge.carryShipment();

        Boat boat = new Boat("boat", "by water", "Aqua", "diesel", "5 passenger",
                "300 kg", 80, 0.01, 1, 2.4, 5,
                true, false, true, true);

        boat.swim();

        Bird penguin = new Bird("Aves", "Neognathae", "penguin", "Eudyptes sclateri", "wild",
                "land and water", 20, true);

        penguin.swim();
        penguin.move();
        penguin.eatFish();
        penguin.layEggs();

        Bird kiwi = new Bird("Aves", "Paleognathae", "kiwi", "Apteryx haastii", "wild",
                "tropical forest", 2.5, true);

        kiwi.fly();
        kiwi.layEggs();

        Bird ostrich = new Bird("Aves", "Paleognathae", "ostrich", "Struthio camelus",
                "wild or farm", "savanna", 100, true);

        ostrich.move();
        ostrich.layEggs();

        Bird duck = new Bird("Aves", "Neognathae", "duck", "Anas undulata",
                "wild or domestic", "land and water", 2, true);

        duck.swim();
        duck.fly();
        duck.move();
        duck.layEggs();
        duck.eatFish();

        Bird eagle = new Bird("Aves", "Neognathae", "eagle", "Aquila chrysaёtos",
                "wild", "forest", 3, true);

        eagle.fly();
        eagle.layEggs();

        Bird stork = new Bird("Aves", "Neognathae", "stork", "Ciconia ciconia",
                "wild", "land and trees near water and swamp", 3, true);

        stork.fly();
        stork.move();
        stork.eatFish();
        stork.layEggs();

        Bird pigeon = new Bird("Aves", "Neognathae", "pigeon", "Columba livia",
                "wild", "coastal cliffs, steep riverbanks, often near farmland",
                0.4, true);

        pigeon.fly();
        pigeon.move();
        pigeon.layEggs();

        Fish pike = new Fish("Pisces", "pike", "Esox americanus", "wild", "river",
                1.2, false);

        pike.swim();
        pike.eatFish();

        Fish crucian = new Fish("Pisces", "crucian", "Carassius carassius", "industrial",
                "swampy lakes and rivers", 1.1, true);

        crucian.swim();

        Fish catfish = new Fish("Pisces", "catfish", "Silurus glanis", "wild",
                "fresh water", 80, false);

        catfish.swim();
        catfish.eatFish();

        Mammal cat = new Mammal("Mammals", "cat", "Abyssinian", "domestic and wild",
                "households or forest", 8, true);

        cat.move();
        cat.eatFish();

        Mammal dog = new Mammal("Mammals", "dog", "Miniature Pinscher", "domestic",
                "households", 5, true);

        dog.move();

        Mammal hamster = new Mammal("Mammals", "hamster", "Cricetus cricetus", "wild or domestic",
                "households of fields", 0.4, false);

        hamster.move();

    }
}
