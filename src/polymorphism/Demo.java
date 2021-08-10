package polymorphism;

  class Plane {
    void fly(){
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("CargoPlane is flying at low height");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("PassengerPlane is flying at medium heights");
    }
}

class FighterPlane extends Plane{
    void fly(){
        System.out.println("FighterPlane is flying at great heights");
    }
}
class Demo {
    public static void main(String[] args) {
        // Non-polymorphism 3:3 (3 statement : 3 output)//
        /*CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        cp.fly();
        pp.fly();
        fp.fly();*/
      /*------------------------------------------------*/
        // Plymorphism 1:Many//
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Plane ref;

        ref = cp;
        ref.fly();

        ref = pp;
        ref.fly();

        ref = fp;
        ref.fly();
    }
}