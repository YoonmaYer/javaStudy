package poly.args3;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);    // bonusPoint는 price의 10%
    }
    Product() {
        price = 0;
        bonusPoint = 0;
    }
}
