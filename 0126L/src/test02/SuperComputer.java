package test02;

public class SuperComputer implements HdmiInput {

	private HdmiOutput device;
	@Override
	public void setOutput(HdmiOutput device) {
		this.device = device;
	}

	@Override
	public void show() {
		System.out.println("슈퍼한 컴퓨터 화면을");
		device.output();
	}
	
}
