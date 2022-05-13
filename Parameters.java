public class Parameters {

    public static void main(String[] args) {
        measureRectangle(5, 3);
    }
    

    public static void measureRectangle(double length, double width){
        double area = length*width;
        System.out.println("The area is " + area + "\n");
    }
}
