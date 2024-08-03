package entity;

public class Reservation {
    private int id;
    private String resDate;
    private String chair;
    private int passengerId;
    private int flightId;

    Reservation(){
    }

    public Reservation(int id, String resDate, String chair, int passengerId, int flightId) {
        this.id = id;
        this.resDate = resDate;
        this.chair = chair;
        this.passengerId = passengerId;
        this.flightId = flightId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResDate() {
        return resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", resDate='" + resDate + '\'' +
                ", chair='" + chair + '\'' +
                ", passengerId=" + passengerId +
                ", flightId=" + flightId +
                '}';
    }
}
