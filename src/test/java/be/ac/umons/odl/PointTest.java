package be.ac.umons.odl;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointTest {
	@Test
	public void distanceTo_with_same_point() {
		Point a = new Point(1, 1);
		Point b = new Point(1, 1);

		assertThat(a.distanceTo(b)).isEqualTo(0.0);
	}

	@Test
	public void distanceTo_with_positive_distances() {
		Point a = new Point(1, 1);
		Point b = new Point(4, 5);

		assertThat(a.distanceTo(b)).isEqualTo(5.0);
	}

}
