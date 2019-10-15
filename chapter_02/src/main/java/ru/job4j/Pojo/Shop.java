package ru.job4j.Pojo;

public class Shop{
       private static Product[] delete (Product[] products, int index) {
        products = new Product[ 4];
        products[ 0 ]=new Product("Milk",10);
        products[ 1 ]=new Product("Egg",19);
        products[ 2 ]= new Product("Bread",4);

           for(int i=0; i<products.length; i++) {
               Product product=products[ i ];
               if ( product != null ){
                   System.out.println(product.getName());
               } else {
                   System.out.println("null");
               }
           }
        System.out.println();

        products[ 1 ]=null;
           for (int i = 0; i < products.length; i++) {
               Product product = products[i];
               if (product != null) {
                   System.out.println(product.getName());
               } else {
                   System.out.println("null");
               }
           }
           System.out.println();

           products[1] = products[index];
           products[index] = products[index + 1];
           products[index + 1] = null;
           for (int i = 0; i < products.length; i++) {
               Product product = products[i];
               if (product != null) {
                   System.out.println(product.getName());
               } else {
                   System.out.println("null");
               }
           }
           System.out.println();
        return products;
    }

    public static void main(String[] args){
        Product[] products={new Product(),new Product(),new Product(),new Product(),new Product()};
        Product[] result= delete(products, 1);
        System.out.println();
    }
}


