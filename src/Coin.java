package by.bsu.fund.bean;
public class Coin {
    private double diameter; // нарушение инкапсуляции
    private double weight; // правильная инкапсуляция

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if(value > 0) {
            diameter = value;
        } else {
            System.out.println("Oтрицательный диаметр!");
        }
    }

    public double takeWeight() { // некорректно: неправильное имя метода
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}