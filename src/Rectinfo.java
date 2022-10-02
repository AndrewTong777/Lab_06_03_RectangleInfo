import java.util.Scanner;
public class Rectinfo {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        double perimeter;
        double diagonal;
        String trash;

        //area = length * breadth
        //perimeter = 2* length + 2 * breadth
        //diagonal = SquareRoot( length * length + breadth * breadth)


        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");

        if(in.hasNextDouble()){
            length = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the width of the rectangle");

            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();


                diagonal = Math.sqrt(length * length + width * width);

                area = length * width;
                perimeter = 2 * length + 2 * width;

                System.out.printf("The area of the rectangle %.2f ", area);
                System.out.printf("The perimeter of the rectangle %.2f ", perimeter);
                System.out.printf("The diagonal of the rectangle %.2f ", diagonal);

            }else{
                trash = in.nextLine();
                System.out.println("You entered an invalid width value: " + trash);
            }

        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid length value: " + trash);

        }

    }
}
