package Interface;

public class PooToyImpl implements ILight, IMoveArmLeg{
	
	public PooToyImpl() {
		System.out.println("푸우 장난감 입니다.");
		canLight();
		canMoveArmLeg();
		System.out.println("===============================");
		
	}

	@Override
	public void canMoveArmLeg() {
		System.out.println("미사일 발사가 가능합니다.");
	}
	
	@Override
	public void canLight() {
		System.out.println("불빛을 반짝입니다.");
	}
	

}
