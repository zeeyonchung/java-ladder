package ladder;

import java.util.Random;

public class RandomDrawingPointStrategy implements DrawingPointStrategy {

	private final Random random = new Random();

	@Override
	public LadderLinePoint drawPoint() {
		return LadderLinePoint.of(random.nextBoolean());
	}
}
