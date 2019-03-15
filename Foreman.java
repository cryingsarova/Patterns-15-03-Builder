
public class Foreman {

    HouseBuilder houseBuilder;

    public Foreman() {

    }

    public void setHouseBuilder() {
        this.houseBuilder = houseBuilder;
    }

    public void buildRishHouse(House house){
        houseBuilder = new RishHouseBuilder();
        houseBuilder.buildRoof();
        houseBuilder.buildFloor(house.getFloor());
        houseBuilder.setStatyes(house.getStatyes());
        houseBuilder.buildBasement();
    }

    public void buildPoorHouse(House house){
        houseBuilder = new PoorHouseBuilder();
        houseBuilder.buildRoof();
        houseBuilder.buildFloor(house.getFloor());
        houseBuilder.buildBasement();
    }
}
