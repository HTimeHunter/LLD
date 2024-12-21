public class BritishAircraftFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft(String type) {
        if (type.equals("Bomber")) {
//            return new BritishBomberCraft();
        } else if (type.equals("Fighter")) {
//            return new BritishFighterCraft();
        } else if (type.equals("Troop")) {
//            return new BritishTroopTransportCraft();
        }
        return null;
    }

}
