package abstraction;
/* only name without body using signature called abstration declare as well as class abstartion*/

abstract class Plane {
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}

class CargoPlane extends Plane {
    void takeOff(){
        System.out.println("CargoPlane is taking off from a long sized runway");
    }
    void fly(){
        System.out.println("CargoPlane is flying at low height");
    }
    void land(){
        System.out.println("CargoPlane is landing on long sized runway");
    }
}

class PassengerPlane extends Plane {
    void takeOff(){
        System.out.println("PassengerPlane is taking off from a medium sized runway");
    }
    void fly(){
        System.out.println("PassengerPlane is flying at medium heights");
    }
    void land(){
        System.out.println("PassengerPlane is landing on medium sized runway");
    }
}

class FighterPlane extends Plane {
    void takeOff(){
        System.out.println("FighterPlane is taking off from a short sized runway");
    }
    void fly(){
        System.out.println("FighterPlane is flying at great heights");
    }
    void land(){
        System.out.println("fighterPlane is landing on short sized runway");
    }
}
class Airport {
    void permit(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}
class Demo {
    public static void main(String[] args) {
      CargoPlane cp = new CargoPlane();
      PassengerPlane pp = new PassengerPlane();
      FighterPlane fp = new FighterPlane();

      Airport a = new Airport();
      a.permit(cp);
      a.permit(pp);
      a.permit(fp);

    }
}

