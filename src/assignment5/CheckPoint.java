package assignment5;

public class CheckPoint extends GameToken{

	public CheckPoint(Direction facing) {
		super(facing);
		super.setTokenName(Tokens.CHECK_POINT);
	}

	@Override
	public void sendBeamOut() {
		this.setBeamOut(this.getDirectionIn());
		
	}


}