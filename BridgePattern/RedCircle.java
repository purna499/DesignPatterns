package com.BridgePattern.BridgePattern;
public class RedCircle implements DrawAPI {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("drawing Circle of  color: red, radius:_" + radius + ", x: " + x + ", " + y );
	   }
	}