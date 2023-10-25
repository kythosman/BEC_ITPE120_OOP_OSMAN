public enum Colors{
	PINK(255,0,170,"Pink"),WHITE(255,255,255,"White"),ORANGE(255,170,0,"Orange"), BLACK(0,0,0,"Black");
	final int r,g,b;
	final String rgb, name;

	Colors(final int r, final int g, final int b, final String name){
		this.r = r;
		this.g = g;
		this.b = b;
		this.rgb = r+", "+g+", "+b;
		this.name=name;
	}

	public void displayRGB(){
		System.out.println(name+": ("+rgb+")");
	}
}