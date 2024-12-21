public class Main {
    public static void main(String[] args) {
        AircraftProcessor britishProcessor=new AircraftProcessor(new BritishAircraftFactory());
        AircraftProcessor usProcess=new AircraftProcessor(new USAircraftFactory());

    }
}