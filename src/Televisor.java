public class Televisor {

    String onOf = "wyłączony";

    void turnOff(){
        onOf = "wyłączony";
    }
    void turnOn(){
        onOf = "włączony";
    }
    void showStatus(){
        System.out.println("Telewizor jest: " + onOf);
    }
}
