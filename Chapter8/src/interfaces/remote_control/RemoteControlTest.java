package interfaces.remote_control;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl rcTV = new Television();
		RemoteControl rcAudio = new Audio();
		
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.setVolume(12);  //최대 10으로 설정
		rcTV.setMute(true);
		rcTV.setMute(false);
		RemoteControl.changeBattery(); // static 메서드이므로 인터페이스 이름으로 직접 접근
		rcTV.turnOff(); 
		System.out.println();
		
		rcAudio.turnOn();
		rcAudio.setVolume(-1);
		rcAudio.turnOff();
	}

}
