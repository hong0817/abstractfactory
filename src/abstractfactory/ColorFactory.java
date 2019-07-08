package abstractfactory;

import abstractfactory.Color.Color;
import abstractfactory.Color.impl.Blue;
import abstractfactory.Color.impl.Green;
import abstractfactory.Color.impl.Red;
import abstractfactory.Shape.Shape;

//根据AbstractFactory生成实体类对象
public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if(color == null){
	         return null;
	      }        
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	      } else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	      } else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
