# Shape_Decorator-Pattern

This is my homework about Decorator Pattern in university. To run this code, open folder with Eclipse or IntelliJ IDEA CE


1.

Run eclipse and create a new project named Shapes. Create in this project a package shapes and add the class Rectangle to it. Read the documentation about the abstract class java.awt.geom.Point2D and comment the code of Rectangle. In particular, explain the use of the clone() method in the constructor and the method position().
Add a new class Test in the default package with a main method and use it to create, move and print a rectangle.

2.
Following the example of Rectangle, add a new class Square in the package shapes. To avoid the code duplication, propose two solutions, one based on an abstract class, the second on delegation.

3.
Propose a solution to create a List in Test in which you may put instances of Rectangle or Square, but no other type of object.

4.
Add a new private method movingMessage() to Rectangle which print "moving to x, y" when the position of the rectangle is moved to a new value (x, y). Modify the rest of the code of Rectangle in such a way that movingMessage is called each time the rectangle moves.

Now, we want to modify the method position() in such a way that it returns a view on the position of the rectangle. Note that the method movingMessage must be called when you change the coordinates of the point returned by position().

For example, after the execution of the following instructions :

Rectangle r = new Rectangle(new Point2D.Double(10,10), 5, 5);
Point2D p = r.position();
p.setLocation(20, 20);

the following message will appear on the standard output :

moving to 20, 20

5.
Now, we want to add colors to the shapes, one for the "foreground" (used to draw the perimeter of the shape) and one for the "background" (used inside the shape). Use the pattern Decorator to answer to this question. The result must be in such a way that, when you print a colored shape, its colors are also printed. For example, for a rectangle with red perimeter and yellow background :
Rectangle Point2D.Double[40.0, 40.0], height = 10.0, width = 5.0, colors = java.awt.Color[r=255,g=0,b=0], java.awt.Color[r=255,g=255,b=0]
