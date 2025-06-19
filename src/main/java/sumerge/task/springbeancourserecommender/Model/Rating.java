package sumerge.task.springbeancourserecommender.Model;

public class Rating {
    private int id;
    private int number;
    public Rating(int id, int number) {
        this.id = id;
        this.number = number;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
