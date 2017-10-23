package be.ac.umons.odl;

import java.awt.*;

public class ConvexPolygon implements Drawable {
	private final Point[] vertices;

	public ConvexPolygon(Point[] vertices) {
		this.vertices = vertices;
	}

	public Point[] getVertices() {
		return vertices;
	}

	@Override
	public void draw(Graphics g) {
		int[] xPoints = new int[vertices.length];
		int[] yPoints = new int[vertices.length];
		for (int i = 0; i < vertices.length; i++) {
			Point vertex = vertices[i];
			xPoints[i] = vertex.getX();
			yPoints[i] = vertex.getY();
		}
		g.drawPolygon(xPoints, yPoints, vertices.length);
	}
}
