package mobile.mm13.aouth0.models;

public class TimeSheet {
    private String userID;
    private String projectName;
    private String date;
    private double hours;
    private int ID;

    public TimeSheet(String gUserID, String gProjectName, String gDate, double gHours, int gID) {
        this.userID = gUserID;
        this.projectName = gProjectName;
        this.date = gDate;
        this.hours = gHours;
        this.ID = gID;
    }

    public String getUserID() {
        return userID;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDateString() {
        return date;
    }

    public double getHours() {
        return hours;
    }

    public int getID() {
        return ID;
    }
}