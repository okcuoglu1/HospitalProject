package entities.concretes;

public class LastStatus {

    private int id;
    private String lastStatus;

    public LastStatus(int id, String lastStatus) {
        this.id = id;
        this.lastStatus = lastStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }


    @Override
    public String toString() {
        return
                "id=" + id +
                ", lastStatus='" + lastStatus + '\'' +
                '}';
    }
}
