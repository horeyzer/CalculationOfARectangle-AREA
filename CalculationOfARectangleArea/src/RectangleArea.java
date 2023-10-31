import java.util.Scanner;
public class RectangleArea
{
    private double length;
    private double width;

    public void getData()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of the rectangle in cm: ");
        length = scan.nextDouble();

        System.out.print("Enter width of the rectangle in cm: ");
        width = scan.nextDouble();
    }

    public double computeField()
    {
        return length * width;
    }

    public void fieldDisplay()
    {
        System.out.println("Rectangle Information: ");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + computeField());
    }
}
