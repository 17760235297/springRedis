package csii.xiao.springRedis.Bean;

public abstract class AbstractMale {
	
	public abstract void getName();
	public abstract void getAge();
	public void getSex()
	{
		System.out.println("male");
	}
	public void echoInfo()
	{
		getName();
		getAge();
		getSex();
	}

}
