public class Product {
    private String productName;
    private int productCode;
    private double unitCost;
    private boolean inCurrentProductLine;
    //C o N s T r U c T o R
    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {
        this.productName = productName;
        this.productCode = productCode;
        this.unitCost = unitCost;
        this.inCurrentProductLine = inCurrentProductLine;
    }
    //G e T t E r S
    public double getUnitCost() {
        return unitCost;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public boolean getInCurrentProductLine() {
        return inCurrentProductLine;
    }
    //S e T t e R s


    public void setInCurrentProductLine(boolean inCurrentProductLine) {
        this.inCurrentProductLine = inCurrentProductLine;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    public String toString(){
        return "Product "+getProductName() +"\n Product Code "+getProductCode()+"\n Unit cost "
                +getUnitCost()+"\nIs it in production? "+getInCurrentProductLine();
    }
}
