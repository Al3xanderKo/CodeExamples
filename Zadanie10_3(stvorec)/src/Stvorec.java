import java.awt.Rectangle;

public class Stvorec extends Rectangle {
	int x;
	int y;
	int dlzkaStrany;

	public Stvorec(int x, int y, int dlzkaStrany) {
		this.x = x;
		this.y = y;
		this.dlzkaStrany = dlzkaStrany;
		new Rectangle();
		this.setSize(dlzkaStrany, dlzkaStrany);

		// vypocet stredu X a Y osi
		int stredX = x - dlzkaStrany / 2;
		int stredY = y - dlzkaStrany / 2;
		this.setLocation(stredX, stredY);

	}

	public int getPlocha() {

		return dlzkaStrany * dlzkaStrany;
	}

}
