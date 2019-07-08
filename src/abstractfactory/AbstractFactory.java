package abstractfactory;

import abstractfactory.Color.Color;
import abstractfactory.Shape.Shape;

//Ϊ Color�� Shape���󴴽�����������ȡ����
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
