public enum Shapes{
    CIRCLE(12.0),SQUARE(15.0),TRIANGLE(10.0, 10.0, 10.0, 15.0);

    double r,a,b,c,h;
    private double pi = 3.14;

    Shapes(double val){
    	r = val;
    	a = val;
    }

    Shapes(double val1, double val2, double val3, double val4){
    	a = val1;
    	b = val2;
        c = val3;
        h = val4;
    }


    public double circleArea(){
    	 return pi*r*r;
    }

    public double squareArea(){
    	return a*a;
    }

    public double triangleArea(){
    	return b*h/2;
    }

    public double circlePerimeter(){
        return 2*pi*r;
    }

    public double squarePerimeter(){
        return 4*a;
    }

    public double trianglePerimeter(){
        return a+b+c;
    }
}