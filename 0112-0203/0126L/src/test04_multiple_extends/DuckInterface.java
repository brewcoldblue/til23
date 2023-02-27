package test04_multiple_extends;

//인터페이스의 상속과 다중 상속
public interface DuckInterface extends AbleToFly, AbleToHunt, AbleToSwim {
	void playInnocent(); //오리발 내밀기
}
