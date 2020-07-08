package testPjt01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TransportationWalk transportatoinWalk = new TransportationWalk();
		// transportatoinWalk.move();
		
		// 스프링 컨테이너에 접근하기위한 방법은 컨테이너를 xml로 사용했기 때문에 GenericApplicationContext을 통해 접근한다.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// 컨테이너에서 id가 tWalk이고 TransportationWalk 클래스를 가져오겠다.
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move(); 
		
		// 자바에서는 외부 리소스를 사용하면 반환을 해줘야한다.
		ctx.close();
	}

}
