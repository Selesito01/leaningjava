package leaningjava.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Eggg", 119);
//        products[4] = new Product("Egggg", 129);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
//        System.out.println("Удаляем значение из ячейки с индексом 1");
//        products[1] = null;
//
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }

        System.out.println();
//        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
//        products[1] = products[2];
//        products[2] = null;
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }

        Shop shop = new Shop();
        shop.delete(products, 1);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }


    }
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length; i++) {
            if (i == products.length - 1) {
                products[i] = null;
                break;
            }
            products[i] = products[i + 1];
        }
        return products;
    }


}
