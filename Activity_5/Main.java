public class Main{
	public static void main(String[] args){
		Colors[] colors = new Colors[4];
		colors[0] = Colors.PINK;
		colors[1] = Colors.WHITE;
		colors[2] = Colors.ORANGE;
		colors[3] = Colors.BLACK;

		for(Colors color: colors){
			color.displayRGB();
		}
	}
}