public class Main {
    public static void main(String[] args) {

        Computer my_phone = new SmartPhone();
        my_phone.show_model();
        my_phone.set_model(new iPhone14());
        my_phone.show_model();
    }
}