import javax.swing.ImageIcon;

public class Bullet {

	private int x, y, dx, dy, width, height;
		private ImageIcon pic;
		
		public Bullet() {
			x=0;
			y=0;
			dx=0;
			dy=0;
			width=0;
			height=0;
			pic = new ImageIcon();
		}
		
		public Bullet (int xV, int yV, int w, int h, ImageIcon p) {
			x=xV;
			y=yV;
			pic=p;
			dx=0;
			dy=0;
			width=w;
			height=h;
		}

		public int getW() {
			return width;
		}
		
		public int getH() {
			return height;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public ImageIcon getPic() {
			return pic;
		}
		
		public void setdx(int dx1) {
			x+=dx1;
		}
		
		public void setdy(int dy1) {
			y+=dy1;
		}
	}