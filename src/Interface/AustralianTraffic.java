package Interface;

public class AustralianTraffic implements CentralTrafficControl {

	public static void main(String[] args) {

		CentralTrafficControl a = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.FlashYellow();

		AustralianTraffic at = new AustralianTraffic();
		at.walkingsymbol();
	}
	@Override
	public void greenGo() {
		System.out.println("greenGo implementation");
	}
	@Override
	public void redStop() {
		System.out.println("redstop implementation");
	}

	public void walkingsymbol() {
		System.out.println("walking");
	}
	@Override
	public void FlashYellow() {
		System.out.println("FlashYellow implementation");
	}
}
