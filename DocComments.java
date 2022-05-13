public class DocComments {
    public static void main(String[] args) {

        double measure1 = measureRectangle(4.3,2.2,"area");
        double measure2 = measureRectangle(3.2,4.1,"perimeter");

        System.out.println("measure 1 " + measure1 + "measure 2 " + measure2);
        
    }

    /**
     * Function name greet
     * 
     * Inside the function:
     * 1. prints: 'Hi'
     */
    public static void greet() {
        System.out.println("hi");
    }

    /**
     * 
     * Function name: PrintText
     * @param name (String)
     * @param age (String)
     * 
     * Insde the function:
     * 1. Prints the name and age as part of a text
     */

    public static void printText(String name, String age) {
        System.out.println("hi, Im " + name + " and Im " + age + " years old.");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length
     * @param width
     * @return
     * 
     * Inside the function:
     * 1. Calcualates the area and returns it.
     * 
     */
    public static double measureRectangle(double length, double width, String option) {
        switch (option) {
            case "area": return length*width;
            case "perimeter": return 2*(length + width);
            default: return 404;
        }
    }

}
