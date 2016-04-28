// package ???;

import android.location.Location;
import java.util.Date;

/**
 * Created by A.Lorenz on 27.04.2016.
 *
 * Fachwert für eine einzelne GPS-Koordinate.
 * Jede Koordinate gehört zu einem bestimmten Track.
 */

public class Position {

    private long positionId;
    private int trackId;
    private String deviceId;
    private Date time;
    private double latitude;
    private double longitude;
    private double altitude;

    //Standardkonstruktor

    public Position() {
    }

    //Konstruktor

    public Position(int trackId, String deviceId, Location location){
        this.trackId = trackId;
        this.deviceId = deviceId;
        time = new Date(location.getTime());
        latitude = location.getLatitude();
        longitude = location.getLongitude();
        altitude = location.getAltitude();
    }

    // Getter und Setter

    public long getPositionId() {return positionId;}
    public void setPositionId(long positionId) {this.positionId = positionId;}

    public int getTrackId() {return trackId;}
    public void setTrackId(int trackId) {this.trackId = trackId;}

    public String getDeviceId() {return deviceId;}
    public void setDeviceId(String deviceId) {this.deviceId = deviceId;}

    public Date getTime() {return time;}
    public void setTime(Date time) {this.time = time;}

    public double getLatitude() {return latitude;}
    public void setLatitude(double latitude) {this.latitude = latitude;}

    public double getLongitude() {return longitude;}
    public void setLongitude(double longitude) {this.longitude = longitude;}

    public double getAltitude() {return altitude;}
    public void setAltitude(double altitude) {this.altitude = altitude;}
}
