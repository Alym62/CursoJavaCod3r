package org.udemyCoder.classe_metodos.desafio.modulo;

public class Comida {
    private String nameFood;
    private double foodWeight;

    public Comida() {}

    public Comida(String nameFood, double foodWeight) {
        this.nameFood = nameFood;
        this.foodWeight = foodWeight;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public double getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(double foodWeight) {
        this.foodWeight = foodWeight;
    }

    public static String weightFormated(double weightFood) {
        if (weightFood <= 0.9)
            return String.format("Peso da comida: %s Gm", weightFood);
        else
            return String.format("Peso da comida: %s Kg", weightFood);
    }
}
