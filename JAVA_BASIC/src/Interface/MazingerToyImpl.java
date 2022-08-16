package Interface;

public class MazingerToyImpl implements IMissile, IMoveArmLeg{
	
	public MazingerToyImpl() {
		System.out.println("마징가 입니다.");
		canMissile();
		canMoveArmLeg();
		System.out.println("===========================");
	}

	@Override
	public void canMoveArmLeg() {
		System.out.println("미사일 발사가 가능합니다.");
	}
	
	@Override
	public void canMissile() {
		System.out.println("팔다리 움직임이 가능합니다.");
	}

}
