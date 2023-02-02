package entities.concretes;

public class Priorities {

    private int id;
    private String priority; //Acil, poliklinik vb.

    public Priorities() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Priorities(int id, String priority) {
        this.id = id;
        this.priority = priority;
    }


    @Override
    public String toString() {
        return
                "id=" + id +
                ", priority='" + priority + '\'' +
                '}';
    }
}
