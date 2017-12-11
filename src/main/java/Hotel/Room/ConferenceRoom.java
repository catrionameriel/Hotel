package Hotel.Room;

import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private ArrayList<String> setupAV;
    private double rate;
    private String name;

    public ConferenceRoom(int inputCapacity, String inputName, double rate) {
        super(inputCapacity);
        this.setupAV = new ArrayList<>();
        this.name = inputName;
        this.rate = rate;

    }

    public int howMuchAV() {
        return this.setupAV.size();
    }

    public void addTechToRoom(String newTech) {
        this.setupAV.add(newTech);
    }

    public void deleteTechFromRoom(String techToDelete) {
        this.setupAV.remove(techToDelete);
    }

    public Boolean doesRoomContainSpecifiedTech(String techToCheck){
        return setupAV.contains(techToCheck);
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(Double newRate){
        this.rate = newRate;
    }

    public Object[] getSetupAV() {
        return this.setupAV.toArray();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
