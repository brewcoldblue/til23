package test02;

public interface HdmiInput {
	void setOutput(HdmiOutput device);
	// device가 hdmi output이라는 인터페이스를 구현한 클래스의 객체일 때 이렇게 받아올 수 있음
	void show();
}
