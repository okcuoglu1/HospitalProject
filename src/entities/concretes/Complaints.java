package entities.concretes;

public class Complaints {

    private int id;
    private String complaint; //Bas agrisi, kusma, bulanti.....

    public Complaints() {
    }

    public Complaints(int id, String complaint) {
        this.id = id;
        this.complaint = complaint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", complaint='" + complaint + '\'';
    }
}
