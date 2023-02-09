package average;

public class Average {
    int n1, n2, n3;
    double average;
    
    Average(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public String getAverage(int n1, int n2, int n3){
        String result;
        average = (n1 + n2 + n3) / 3;
        result = "\nAverages of Three Numbers: " + average + "\n";
        return result;
    }
}
