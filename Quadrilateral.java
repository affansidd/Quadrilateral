
public abstract class Quadrilateral {
	private static int numQ = 0;
	public Quadrilateral () {
		numQ++;
	}
	public static int getNumQ () {
		return numQ;
	}
	public abstract String getName();
	public abstract double findArea();
	public abstract double findPerimeter();
}

class Square extends Quadrilateral {
	private static int numS = 0;
	private double length;
	private String name;
	public Square () {
		if (this.getClass() == Square.class) {
			numS++;
		}
		length = 1;
		name = "Square"+numS;
	}
	public Square (double length) {
		if (this.getClass() == Square.class) {
			numS++;
		}
		this.length = length;
		name = "Square"+numS;
	}
	public String getName () {
		return name;
	}
	public double getLength () {
		return length;
	}
	public void setLength (double length) {
		this.length = length;
	}
	public static int getNumS () {
		return numS;
	}
	public double findArea () {
		return length*length;
	}
	public double findPerimeter () {
		return length*4;
	}
	public String toString(){
		return "Name: "+name+"\nLength: "+length+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
	}
	public boolean equals(Object o) {
		if (o instanceof Square) {
			Square s = (Square) o;
			if (this.length==(s.getLength())) return true;
		}
		return false;
	}
}

class Rectangle extends Square {
	private static int numRec;
	private double width;
	private String name;
	public Rectangle () {
		super ();
		if (this.getClass() == Rectangle.class) {
			numRec++;
		}
		width = 1;
		name = "Rectangle"+numRec;
	}
	public Rectangle (double length, double width) {
		super (length);
		if (this.getClass() == Rectangle.class) {
			numRec++;
		}
		this.width = width;
		name = "Rectangle"+numRec;
	}
	public String getName () {
		return name;
	}
	public double getWidth () {
		return width;
	}
	public void setWidth (double width) {
		this.width = width;
	}
	public static int getNumRec () {
		return numRec;
	}
	public double findArea () {
		return super.getLength()*width;
	}
	public double findPerimeter () {
		return 2*(super.getLength()+width);
	}
	public String toString(){
		return "Name: "+name+"\nLength: "+getLength()+"\nWidth: "+width+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
	}
	public boolean equals(Object o) {
		if (o instanceof Rectangle) {
			Rectangle r = (Rectangle) o;
			if (this.getLength() == (r.getLength()) && this.width == (r.getWidth())) return true;
		}
		return false;
	}
}
class Parallelogram extends Rectangle {
	private static int numP;
	private double height;
	private String name;
	public Parallelogram () {
		super ();
		if (this.getClass() == Parallelogram.class) {
			numP++;
		}
		height = 1;
		name = "Parallelogram"+numP;
	}
	public Parallelogram (double length, double width, double height) {
		super (length, width);
		if (this.getClass() == Parallelogram.class) {
			numP++;
		}
		this.height = height;
		name = "Parallelogram"+numP;
	}
	public String getName () {
		return name;
	}
	public double getHeight () {
		return height;
	}
	public void setHeight (double height) {
		this.height = height;
	}
	public static int getNumP () {
		return numP;
	}
	public double findArea () {
		return super.getWidth()*height;
	}
	public String toString(){
		return "Name: "+name+"\nLength: "+getLength()+"\nWidth: "+getWidth()+"\nHeight: "+height+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
	}
	public boolean equals(Object o) {
		if (o instanceof Parallelogram) {
			Parallelogram p = (Parallelogram) o;
			if (this.getLength() == (p.getLength()) && this.getWidth() == (p.getWidth()) && this.height == (p.getHeight())) return true;
		}
		return false;
	}
	
}
class Trapezoid extends Parallelogram {
	private static int numT;
	private double topBase;
	private String name;
	public Trapezoid () {
		super ();
		if (this.getClass() == Trapezoid.class) 
			numT++;
		topBase = 1;
		name = "Trapezoid"+numT;
	}
	public Trapezoid (double length, double width, double height, double topBase) {
		super (length, width, height);
		if (this.getClass() == Trapezoid.class)
			numT++;
		this.topBase = topBase;
		name = "Trapezoid"+numT;
	}
	public String getName () {
		return name;
	}
	public double getTopBase () {
		return topBase;
	}
	public void setTopBase (double topBase) {
		this.topBase = topBase;
	}
	public static int getNumT () {
		return numT;
	}
	public double findArea () {
		return ((topBase+super.getWidth())/2)*super.getHeight();
	}
	public double findPerimeter () {
		return (topBase+super.getWidth()) + 2*super.getLength();
	}
	public String toString(){
		return "Name: "+name+"\nLength: "+getLength()+"\nBase: "+getWidth()+"\nHeight: "+getHeight()+"\nTop Base: "+topBase+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
	}
	public boolean equals(Object o) {
		if (o instanceof Trapezoid) {
			Trapezoid t = (Trapezoid) o;
			if (this.getLength() == (t.getLength()) && this.getWidth() == (t.getWidth()) && this.getHeight() == (t.getHeight()) && this.topBase == (t.getTopBase())) return true;
		}
		return false;
	}
}
class Rhombus extends Square {
	private static int numRhom;
	private double diagnal1;
	private double diagnal2;
	private String name;
	public Rhombus () {
		super ();
		if (this.getClass() == Rhombus.class)
			numRhom++;
		diagnal1 = 1.0;
		diagnal2 = 1.0;
		name = "Rhombus"+numRhom;
	}
	public Rhombus (double length, double diagnal1, double diagnal2) {
		super (length);
		if (this.getClass() == Rhombus.class)
			numRhom++;
		this.diagnal1 = diagnal1;
		this.diagnal2 = diagnal2;
		name = "Rhombus"+numRhom;
	}
	public String getName () {
		return name;
	}
	public double getDiagnal1 () {
		return diagnal1;
	}
	public double getDiagnal2 () {
		return diagnal2;	
	}
	public void setDiagnal1 (double diagnal1) {
		this.diagnal1 = diagnal1;
	}
	public void setDiagnal2 (double diagnal2) {
		this.diagnal2 = diagnal2;
	}
	public static int getNumRhom () {
		return numRhom;
	}
	public double findArea () {
		return ((diagnal1 * diagnal1) / 2);
	}
	public String toString(){
		return "Name: "+name+"\nLength: "+getLength()+"\nDiagnal 1: "+diagnal1+"\nDiagnal 2: "+diagnal2+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
	}
	public boolean equals(Object o) {
		if (o instanceof Rhombus) {
			Rhombus r = (Rhombus) o;
			if (this.getLength()==(r.getLength()) && this.diagnal1 == (r.getDiagnal1()) && this.diagnal2 == (r.getDiagnal2())) return true;
		}
		return false;
	}
}
class Kite extends Rhombus {
	private static int numK;
	private double side2;
	private String name;
	public Kite () {
		super ();
		if (this.getClass() == Kite.class) 
			numK++;
		side2 = 1;
		name = "Kite"+numK;
	}
	public Kite (double length, double diagnal1, double diagnal2, double side2) {
		super (length, diagnal1, diagnal2);
		if (this.getClass() == Kite.class)
			numK++;
		this.side2 = side2;
		name = "Kite"+numK;
	}
	public String getName () {
		return name;
	}
	public double getSide2 () {
		return side2;
	}
	public void setSide2 (double side2) {
		this.side2 = side2;
	}
	public static int getNumK () {
		return numK;
	}
	public double findPerimeter () {
		return 2*(super.getLength()+side2);
	}
	public String toString(){
		return "Name: "+name+"\nLength: "+getLength()+"\nDiagnal 1: "+getDiagnal1()+"\nDiagnal 2: "+getDiagnal2()+"\nSide 2: "+side2+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
	}
	public boolean equals(Object o) {
		if (o instanceof Kite) {
			Kite k = (Kite) o;
			if (this.getLength()==(k.getLength()) && this.getDiagnal1() == (k.getDiagnal1()) && this.getDiagnal2() == (k.getDiagnal2()) && this.side2 == (k.getSide2())) return true;
		}
		return false;
	}
}
