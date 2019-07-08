package abstractfactory;

import abstractfactory.Color.Color;
import abstractfactory.Shape.Shape;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		
		//通过形状获取工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//通过形状获取工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		//获取形状为Circle的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		//调用Circle的draw方法
		shape1.draw();
		
		//获取形状为Rectangle的对象
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		//调用Rectangle的draw方法
		shape2.draw();

		//获取形状为Square的对象
		Shape shape3 = shapeFactory.getShape("SQUARE");
		//调用Square的draw方法
		shape3.draw();

		//通过颜色获取对象
		Color color1 = colorFactory.getColor("RED");
		//调用fill方法
		color1.fill();
		
		//通过颜色获取对象
		Color color2 = colorFactory.getColor("BLUE");
		//调用fill方法
		color2.fill();
		
		//通过颜色获取对象
		Color color3 = colorFactory.getColor("GREEN");
		//调用fill方法
		color3.fill();
	}
}
