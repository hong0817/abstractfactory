package abstractfactory.Shape.impl;

import abstractfactory.Shape.Shape;

//实现Shape的接口的实体类
public class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
