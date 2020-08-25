public class Location {
    private double lat;
    private double lng;

    public Location(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String toString() {
        return "(Lat: " + lat + " Lng: " + lng + ")";
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double distTo(Location that){
        return haversine(lat,lng,that.getLat(),that.getLng());
    }

    private static double haversine(double lat1, double lng1, double lat2, double lng2){
        lng1 = Math.toRadians(lng1);
        lng2 = Math.toRadians(lng2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        int r = 6371; //radius of earth in km
        return 2*r*Math.asin(Math.sqrt(Math.pow(Math.sin((lat2-lat1)/2.0),2)+Math.cos(lat1)*Math.cos(lat2)*Math.pow(Math.sin((lng2-lng1)/2.0),2)));
    }
}
