
public class newCar extends Cars{
  
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int speed;

	public newCar(boolean carType,String carName,String carBrand,String carModel,double price,String bodyType,int speed) {
		super();
		this.speed = speed;
		this.carName = carName;
		this.carBrand= carBrand;
		this.carModel=carModel;
		this.price=price;
		this.bodyType=bodyType;
		this.carType=carType;
	}
	 public String  viewCarDetails() {
		 String result="";
		 result+="Car Name:"+carName+"\n";
		 result+="Car brand"+carBrand+"\n";
		 result+="Car Model:"+carModel+"\n";
		 result+="Car Price:"+price+"\n";
		 result+="Body Type:"+bodyType+"\n";
		 result+="Speed:"+speed+"\n";
		 result+="********************************************************";
		return result;
		 
	 }

   
}
