package com.BridgePattern.BridgePattern;
public class BlueCircle implements DrawAPI {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("drawing_circle of color: blue, radius:_" + radius + ", x: " + x + ", " + y );
	   }
	}