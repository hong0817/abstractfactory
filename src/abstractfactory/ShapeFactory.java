package abstractfactory;

import abstractfactory.Color.Color;
import abstractfactory.Shape.Shape;
import abstractfactory.Shape.impl.Circle;
import abstractfactory.Shape.impl.Rectangle;
import abstractfactory.Shape.impl.Square;

//根据AbstractFactory生成实体类对象
public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
