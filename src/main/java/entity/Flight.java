package entity;


    public class Flight {
        private int id;
        private String destination;
        private String flightDate;
        private String flightTime;
        private int airPlaneId;

        public Flight(){
        }

        public Flight(int id, String destination, String flightDate, String flightTime, int airPlaneId) {
            this.id = id;
            this.destination = destination;
            this.flightDate = flightDate;
            this.flightTime = flightTime;
            this.airPlaneId = airPlaneId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getFlightDate() {
            return flightDate;
        }

        public void setFlightDate(String flightDate) {
            this.flightDate = flightDate;
        }

        public String getFlightTime() {
            return flightTime;
        }

        public void setFlightTime(String flightTime) {
            this.flightTime = flightTime;
        }

        public int getAirPlaneId() {
            return airPlaneId;
        }

        public void setAirPlaneId(int airPlaneId) {
            this.airPlaneId = airPlaneId;
        }

        @Override
        public String toString() {
            return "Flight{" +
                    "id=" + id +
                    ", destination='" + destination + '\'' +
                    ", flightDate='" + flightDate + '\'' +
                    ", flightTime='" + flightTime + '\'' +
                    ", airPlaneId=" + airPlaneId +
                    '}';
        }
    }
