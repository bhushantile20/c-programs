//Write a program to read the First Name and Last Name of a person, his weight and height using command line arguments. Calculate the BMI Index which is defined as the individual's body mass divided by the square of their height. (Hint : BMI = Wts. In kgs / (ht)2 )

class demo
{
 public static void main(String args[]) 
{
 String fname = args[0];
 String lname = args[1];
 double weight = Double.parseDouble(args[2]);
 double height = Double.parseDouble(args[3]);
 double BMI = weight / (height * height);
 System.out.println("First name is:" +fname);
 System.out.println("Last Name is:" + lname);
 System.out.println("weight is:" + weight);
 System.out.println("height is:"+ height);
 System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
 }
}
