package day44;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Food {
        private String foodName;
        private String category;
        private int price;
    @JsonProperty("isVegetarian")
        private boolean isVegetarian;

        public Food(){}

    public Food(String foodName, String category, int price, boolean isVegetarian){
            this.foodName = foodName;
            this.category = category;
            this.price = price;
            this.isVegetarian= isVegetarian;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean isVegetarian) {
        isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}
