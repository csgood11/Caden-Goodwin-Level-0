import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.penDown();
		drawsquare();

	}

	public static void drawsquare() {

		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);

		}

	}
}
