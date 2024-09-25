package web.model;

public class Car {
    private String carModel;
    private int createYear;
    private int countOfWheels;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public Car(String carModel, int createYear, int countOfWheels) {
        this.carModel = carModel;
        this.createYear = createYear;
        this.countOfWheels = countOfWheels;
    }
}
