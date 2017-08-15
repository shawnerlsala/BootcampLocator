package startactivityforresult.shawnerlsala.packagecom.bootcamplocator;

/**
 * Created by ShawnErl on 14/08/2017.
 */

public class Develop {
    private float longitude;
    private float latitude;
    private String locationTittle;
    private String locationAddress;
    private String locationImgUrl;
    final String DRAWABLE = "drawable/";


    public Develop(float latitude, float longitude, String locationTittle, String locationAddress, String locationImgUrl) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationTittle = locationTittle;
        this.locationAddress = locationAddress;
        this.locationImgUrl = locationImgUrl;

    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLocationTittle(String locationTittle) {
        this.locationTittle = locationTittle;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public void setLocationImgUrl(String locationImgUrl) {
        this.locationImgUrl = locationImgUrl;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getLocationTittle() {
        return locationTittle;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getLocationImgUrl() {
        return  DRAWABLE + locationImgUrl;
    }

}
