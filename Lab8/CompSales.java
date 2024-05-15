interface Item{
    double calculate_sales();
}

class Hardware implements Item{
    private String category;
    private String manufacturer;
    private double sales;

    public Hardware(String cat, String man, double sal){
        this.category = cat;
        this.manufacturer = man;
        this.sales = sal;
    }

    public double calculate_sales(){
        return sales;
    }
}

class Software implements Item{
    private String type;
    private String OperSys;
    private double sales;

    public Software(String type, String op, double sal){
        this.type = type;
        this.OperSys = op;
        this.sales  =sal;
    }

    public double calculate_sales(){
        return sales;
    }
}

public class Comp_Sales{
    public static void main(String[] args) {
        Hardware hardware1 = new Hardware("Processor", "Intel", 5000);
        Hardware hardware2 = new Hardware("RAM", "Corsair", 8000);

        Software software1 = new Software("Antivirus", "Windows", 3000);
        Software software2 = new Software("Office Suite", "Mac OS", 6000);

        Item[] items = {hardware1, hardware2, software1, software2};

        double totalHSales = 0;
        double totalSSales = 0;

        for(Item item : items){
            if(item instanceof Hardware){
                totalHSales += item.calculate_sales();
            }
            else if(item instanceof Software){
                totalSSales += item.calculate_sales();
            }
        }

        System.out.println("Total Hardware Sales:"+totalHSales);
        System.out.println("Total Software Sales:"+totalSSales);
    }
}
