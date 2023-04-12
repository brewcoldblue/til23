package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component(value = "p")
public class Programmer {
	//field
//	@Autowired
//	@Qualifier("laptop")
	private Computer computer;
	
	public Programmer() {}
	//생성자 주입
	//Computer이라는 타입이 bean으로 등록되어 있으면 알아서 생성자 주입시켜줌
	@Autowired
	public Programmer(@Qualifier("laptop")Computer computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 코딩함");
	}
	//설정자 주입
	//@Qualifier을 사용한다면 desktop만을 지정해 mapping할 수 있다
//	@Autowired
//	public void setComputer(@Qualifier("desktop")Computer computer) {
//		this.computer = computer;
//	}
}
