package abstractfactory;

import abstractfactory.Color.Color;
import abstractfactory.Shape.Shape;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		
		//ͨ����״��ȡ����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//ͨ����״��ȡ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		//��ȡ��״ΪCircle�Ķ���
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		//����Circle��draw����
		shape1.draw();
		
		//��ȡ��״ΪRectangle�Ķ���
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		//����Rectangle��draw����
		shape2.draw();

		//��ȡ��״ΪSquare�Ķ���
		Shape shape3 = shapeFactory.getShape("SQUARE");
		//����Square��draw����
		shape3.draw();

		//ͨ����ɫ��ȡ����
		Color color1 = colorFactory.getColor("RED");
		//����fill����
		color1.fill();
		
		//ͨ����ɫ��ȡ����
		Color color2 = colorFactory.getColor("BLUE");
		//����fill����
		color2.fill();
		
		//ͨ����ɫ��ȡ����
		Color color3 = colorFactory.getColor("GREEN");
		//����fill����
		color3.fill();
	}
}
