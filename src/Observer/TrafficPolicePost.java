package Observer;

public class TrafficPolicePost implements Observer {
    private String nameOfPost;
    private String violation;
    private String area;
    private int carNumber;


    public TrafficPolicePost(String nameOfPost) {
        this.nameOfPost = nameOfPost;
    }

    private void displayInfo() {
        System.out.println(this);
    }

    @Override
    public void update(String violation, String area, int carNumber) {
        this.violation = violation;
        this.area = area;
        this.carNumber = carNumber;
        displayInfo();
    }

    @Override
    public String toString() {
        return "Пост ГАИ '" + nameOfPost + "' получил распоряжение по нарушению " +
                "'" + violation + "' " +
                "в зоне '" + area + "' " +
                "с номером автомобиля: " + carNumber + "\n";
    }
}
