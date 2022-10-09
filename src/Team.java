public class Team {
    private String name;
    private int point;

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }

    public Team(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
