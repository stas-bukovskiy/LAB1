public class Lecturer {

    private String name;
    private String chair;

    Lecturer(String name, String chair) {
        this.name = name;
        this.chair = chair;
    }

    public String getName() {
        return name;
    }

    public String getChair() {
        return chair;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", chair='" + chair + '\'' +
                '}';
    }
}
