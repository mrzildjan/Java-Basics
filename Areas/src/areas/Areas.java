package areas;

public class Areas {
    
    double area, length, breadth;
    
    public void setDim(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public String getArea(double length, double breadth){
        String result;
        area = length * breadth;
        result = "\nArea of Rectangle: " + area + "\n";
        return result;
    }
}