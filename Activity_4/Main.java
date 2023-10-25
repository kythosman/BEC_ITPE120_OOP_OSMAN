public class Main{
	public static void main(String[] args){
		Shapes shapes[] = new Shapes[3];
		shapes[0] = Shapes.CIRCLE;
		shapes[1] = Shapes.SQUARE;
		shapes[2] = Shapes.TRIANGLE;

		for(Shapes shape: shapes){
			if(shape==Shapes.CIRCLE){
				System.out.println("area of circle: "+shape.circleArea());
				System.out.println("perimeter of circle: "+shape.circlePerimeter());
			}else if(shape==Shapes.SQUARE){
				System.out.println("area of square: "+shape.squareArea());
				System.out.println("perimeter of square: "+shape.squarePerimeter());
			}else if(shape==Shapes.TRIANGLE){
				System.out.println("area of triangle: "+shape.triangleArea());
				System.out.println("perimeter of triangle: "+shape.trianglePerimeter());
			}
		}
	}
}