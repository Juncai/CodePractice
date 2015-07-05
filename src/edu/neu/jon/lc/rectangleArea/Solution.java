package edu.neu.jon.lc.rectangleArea;

public class Solution {

	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		return getArea(A, B, C, D) + getArea(E, F, G, H) - getOverlap(A, B, C, D, E, F, G, H);
	}

	private int getArea(int A, int B, int C, int D) {
		return (C - A) * (D - B);
	}

	private int getOverlap(int A, int B, int C, int D, int E, int F, int G, int H) {
		// check overlap
		double olArea = 0;
		double centX1 = (A + C) / 2.0;
		double centY1 = (B + D) / 2.0;
		double centX2 = (E + G) / 2.0;
		double centY2 = (F + H) / 2.0;
		int w1 = C - A;
		int h1 = D - B;
		int w2 = G - E;
		int h2 = H - F;
		double deltaCentX = Math.abs(centX1 - centX2);
		double deltaCentY = Math.abs(centY1 - centY2);
		
		if ((deltaCentX < (w1 + w2) / 2.0) && (deltaCentY < (h1 + h2) / 2.0)) {
			double olW = (w1 + w2) / 2.0 - deltaCentX;
			olW = (olW > Math.min(w1, w2)) ? Math.min(w1, w2) : olW;
			
			double olH = (h1 + h2) / 2.0 - deltaCentY;
			olH = (olH > Math.min(h1, h2)) ? Math.min(h1, h2) : olH;
			
			olArea = olW * olH;
		}
		return (int)olArea;
	}
}
