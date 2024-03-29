package org.example.Ex3;

public class Ticket {
    private String startingPoint;
    private String endPoint;

    public Ticket(String startingPoint, String endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "startingPoint = '" + startingPoint + '\'' +
                ", endPoint = '" + endPoint + '\'' +
                '}';
    }
}
