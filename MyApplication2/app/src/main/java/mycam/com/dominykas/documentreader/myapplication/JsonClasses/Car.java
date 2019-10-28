
package mycam.com.dominykas.documentreader.myapplication.JsonClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("plateNumber")
    @Expose
    private String plateNumber;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("model")
    @Expose
    private Model model;
    @SerializedName("batteryPercentage")
    @Expose
    private Integer batteryPercentage;
    @SerializedName("batteryEstimatedDistance")
    @Expose
    private Integer batteryEstimatedDistance;
    @SerializedName("isCharging")
    @Expose
    private Boolean isCharging;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(Integer batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public Integer getBatteryEstimatedDistance() {
        return batteryEstimatedDistance;
    }

    public void setBatteryEstimatedDistance(Integer batteryEstimatedDistance) {
        this.batteryEstimatedDistance = batteryEstimatedDistance;
    }

    public Boolean getIsCharging() {
        return isCharging;
    }

    public void setIsCharging(Boolean isCharging) {
        this.isCharging = isCharging;
    }

}
