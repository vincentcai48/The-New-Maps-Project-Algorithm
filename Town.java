public class Town {
    private int district;
    private String name;
    private int population;
    private Location location;

    public Town(String name, int population, double lat, double lng) {
        this.name = name;
        this.population = population;
        this.location = new Location(lat, lng);
        this.district = -1;
    }

    public String getName() {
        return name;
    }

    public int getDistrict() {
        return district;
    }

    public Location getLocation() {
        return location;
    }

    public int getPopulation() {
        return population;
    }

    public String toString() {
        return name + ", District: " + district + ", Location:" + location + ", Population: " + population;
    }

    public void setDistrict(int district) {
        this.district = district;
    }
}

