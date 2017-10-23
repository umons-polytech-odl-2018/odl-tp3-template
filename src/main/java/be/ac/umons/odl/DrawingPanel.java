package be.ac.umons.odl;

import java.awt.*;

public class DrawingPanel extends javax.swing.JPanel {
	private Drawable[] drawables = new Drawable[]{
		new Square(new Point(100, 100), 100)
	};

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Drawable drawable : drawables) {
			drawable.draw(g);
		}
	}

	public void addDrawable(Drawable drawable) {
		Drawable[] drawables = new Drawable[this.drawables.length + 1];
		System.arraycopy(this.drawables, 0, drawables, 0, this.drawables.length);
		drawables[this.drawables.length] = drawable;
		this.drawables = drawables;
	}
}
