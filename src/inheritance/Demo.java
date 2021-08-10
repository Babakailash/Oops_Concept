package inheritance;
// Inheritance is the process of one class acquiring the properties and behaviour of another class.
// advantage 1- code reusability, 2- reduce development time and effort, 3- increse profitability

class CreditCard {
     public int cardNo = 12345; //use private,protected,default(no modifier), public
    public int pin = 8888; //use private,protected,default(no modifier), public
}

class Hacker extends CreditCard{
    void viewDetails(){
        System.out.println(cardNo);
        System.out.println(pin);
    }
     void changeDetails(){
        cardNo = 67890;
        pin = 9999;
     }
}
class Demo{
    public static void main(String[] args) {
        Hacker h = new Hacker();
        h.viewDetails();
        h.changeDetails();
        h.viewDetails();
    }
}
