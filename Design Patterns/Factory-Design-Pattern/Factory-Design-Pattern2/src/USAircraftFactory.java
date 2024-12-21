public class USAircraftFactory extends AircraftFactory{
    @Override
    public Aircraft createAircraft(String type) {
        if (type.equals("Bomber")){
//            return new USBomberCraft();
        } else if(type.equals("Fighter")){
//            return new USFighterCraft();
        } else if(type.equals("Troop")){
//            return new USTroopTransportCraft();
        }
        return null;
    }
}
