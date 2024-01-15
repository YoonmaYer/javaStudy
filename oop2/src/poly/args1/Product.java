package poly.args1;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);    // bonusPoint는 price의 10%
    }
}
