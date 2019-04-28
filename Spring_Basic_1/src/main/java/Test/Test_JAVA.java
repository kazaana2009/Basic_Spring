package Test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test_JAVA {

	public static void main(String[] args) {
		//JAVA사용
		//TransportationWalk transportationWalk = new TransportationWalk();
		//transportationWalk.move();
		
		//Spring 모듈 사용
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:applicationContext.xml");//컨테이너 생성
		
		TransportationWalk transportationWalk=ctx.getBean("tWalk",TransportationWalk.class); //Bean ID값을 가져온다.
		transportationWalk.move();
		
		ctx.close(); //항상 Open 하면 close를 한다.
		

	}
}
