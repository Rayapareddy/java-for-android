import java.util.Scanner;
import java.lang.System;
import java.io.*;
public class Logic
{
	public static double rectangleArea(double length, double width)
	{
		return length*width;
	}
	public static double rectanglePerimeter(double length, double width)
	{
		return 2*(length+width);
	}
	public static double circleArea(double radius)
	{
		return Math.PI*Math.pow(radius,2);
	}
	public static double circleCircumference(double radius)
	{
		return 2*Math.PI*radius;
	}
	public static double rightTriangleArea(double base, double height)
	{
		return 0.5*base*height;
	}
	public static double rightTrianglePerimeter(double base, double height)
	{
		double perimeter=Math.sqrt(base*base+height*height);
		return perimeter+base+height;
	}
	public static double boxVolume(double length, double width, double depth)
	{
		return length*width*depth;
	}
	public static double boxSurfaceArea(double length, double width,
										double depth)
	{
		return 2*(length*width+width*depth+length*depth);
	}
	public static double sphereVolume(double radius)
	{
		return ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius,3);
	}
	public static double sphereSurfaceArea(double radius)
	{
		return 4*Math.PI*radius*radius;
	}
	
    public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.Box & 2.Rectangle & 3.sphere & 4.circle & 5.Triangle");
		int i= in.nextInt();
		switch (i) {
            case 1:
                double mLength=in.nextDouble();
                double mWidth=in.nextDouble();
                double mHeight=in.nextDouble();
                System.out.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " by " 
                           + mHeight 
                           + " box has a volume of: ");
                System.out.println("" 
                             + String.format("%.2f",
                                             boxVolume(mLength, mWidth, mHeight)));
                System.out.println("");

                System.out.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " by " 
                           + mHeight 
                           + " box has a surface area of: ");
                System.out.println("" 
                             + String.format("%.2f",
                                             boxSurfaceArea(mLength, mWidth, mHeight)));
                System.out.println("");
                // If you are paying attention, you will notice that
                // there is no 'break;' here like there is in other
                // places, meaning that if 'Box' was selected, it will
                // run the two sets of print statements above and the
                // two statements below until the 'break;' statement.
            case 2:
                double mLength1=in.nextDouble();
                double mWidth2=in.nextDouble();
                
                System.out.print("A " 
                           + mLength1 
                           + " by " 
                           + mWidth2 
                           + " rectangle has a perimeter of: ");
                System.out.println("" + String.format("%.2f", 
                                                rectanglePerimeter(mLength1, mWidth2)));
                System.out.println("");

                System.out.print("A " 
                           + mLength1 
                           + " by " 
                           + mWidth2 
                           + " rectangle has area of: ");
                System.out.println("" + String.format("%.2f", rectangleArea(mLength1, mWidth2)));
                System.out.println("");
                break;
            case 3:
                double mRRadius=in.nextDouble();
                System.out.print("A sphere with radius " + mRRadius + " has a volume of: ");
                System.out.println("" + String.format("%.2f", sphereVolume(mRRadius)));
                System.out.println("");

                System.out.print("A sphere with radius " + mRRadius + " has surface area of: ");
                System.out.println("" + String.format("%.2f", sphereSurfaceArea(mRRadius)));
                System.out.println("");
                // Same here as with 'Box' above. If 'Sphere' is picked, it will run the
                // two sets of print statements above and the two below until the 'break;'
            case 4:
                double mRadius=in.nextDouble();
                System.out.print("A circle with radius " + mRadius + " has a perimeter of: ");
                System.out.println("" + String.format("%.2f", circleCircumference(mRadius)));
                System.out.println("");

                System.out.print("A circle with radius " + mRadius + " has area of: ");
                System.out.println("" + String.format("%.2f", circleArea(mRadius)) );
                System.out.println("");
                break;
            case 5:
                double mLlength=in.nextDouble();
                double mWwidth=in.nextDouble();
                System.out.print("A right triangle with base " 
                           + mLlength 
                           + " and height " 
                           + mWwidth + " has a perimeter of: ");
                System.out.println("" 
                             + String.format("%.2f", rightTrianglePerimeter(mLlength,
                                                                       mWwidth)));
                System.out.println("");

                System.out.print("A right triangle with base " 
                           + mLlength 
                           + " and height " 
                           + mWwidth 
                           + " has area of: ");
                System.out.println("" 
                             + String.format("%.2f", rightTriangleArea(mLlength,
                        mWwidth)));
                System.out.println("");
                break;
            default:
                break;
        }
	}
}
