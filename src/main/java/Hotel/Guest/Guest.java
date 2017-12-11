package Hotel.Guest;

public class Guest {

private String name;
private boolean checkedInStatus;


public Guest(String inputName){
    this.name = inputName;
    this.checkedInStatus = false;
}

    public String getName() {
        return this.name;
    }


    public void setName(String newName) {
        this.name = newName;
    }


    public boolean getCheckedInStatus(){
     return this.checkedInStatus;
    }


    public void setCheckedInStatus(boolean newStatus) {
        this.checkedInStatus = newStatus;
    }
}
