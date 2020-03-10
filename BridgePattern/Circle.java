package com.BridgePattern.BridgePattern;
public class Circle extends Shape {
	   private int x, y, r;

	   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.r = radius;
	   }

	   public void draw() {
	      drawAPI.drawCircle(r,x,y);
	   }
	}