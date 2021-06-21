package csii.xiao.springRedis.Bean;

public class Male extends AbstractMale implements Love{
	

	

	public static void main(String[] args) {
		AbstractMale male=new Male();
		male.echoInfo();
		Male male1=new Male();
		male1.echoInfo();
		Love loveMale=new Male();
		loveMale.loveBuy();
	}
	public void love()
	{
		
	}

	@Override
	public void getName() {
		System.out.println("xiaopei");
		
	}

	@Override
	public void getAge() {

		System.out.println("32");
	}
	public void getSex()
	{
		System.out.println("female");
	}
	@Override
	public void loveBuy() {
		System.out.println("喜欢买东西");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loveSleep() {
		System.out.println("喜欢睡觉");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loveCry() {
		System.out.println("喜欢吵闹");
		// TODO Auto-generated method stub
		
	}

}
