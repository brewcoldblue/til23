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
	
//	public Programmer() {}
	//기본 생성자...가 필요할 때가 있음 (setter/field에 의존성 주입할 때).
	//그래야 computer 없이 만들어서 나중에 지정할수가 있어!!!
	
	//생성자 주입
	//Computer이라는 타입이 bean으로 등록되어 있으면 알아서 생성자 주입시켜줌
	@Autowired
	public Programmer(@Qualifier("desktop")Computer computer) {
		this.computer = computer;
	}
	
	public Programmer() {};
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 코딩함");
	}
	//설정자 주입
	//@Qualifier을 사용한다면 desktop만을 지정해 mapping할 수 있다
	@Autowired
	public void setComputer(@Qualifier("desktop")Computer computer) {
		this.computer = computer;
	}
}
