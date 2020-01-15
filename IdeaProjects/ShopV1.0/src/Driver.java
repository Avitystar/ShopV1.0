import java.util.Scanner;

public class Driver {
private Scanner input =new Scanner(System.in);
private Product product;

void addProduct(){
    System.out.print("Enter the Product Name:  ");
    String productName = input.nextLine();
    System.out.print("Enter the Product Code:  ");
    int productCode = input.nextInt();
    System.out.print("Enter the Unit Cost:  ");
    double unitCost = input.nextDouble();
    System.out.print("Is this product in your current line (y/n): ");
    char currentProduct = input.next().charAt(0);
    boolean inCurrentProductLine = false;
    if ((currentProduct == 'y') || (currentProduct == 'Y'))
        inCurrentProductLine = true;

    product = new Product(productName, productCode, unitCost, inCurrentProductLine);
}
void printProduct(){
System.out.println(this.product);
}
    public static void main(String[] args) {
        Driver c = new Driver();
        c.addProduct();
        c.printProduct();
    }

}

