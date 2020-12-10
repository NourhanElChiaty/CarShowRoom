
public class usedCar extends Cars {

	public int kilometer;
	public String year;
	public String owner;
	public String ownerName;
	public String ownerNumber;

	
	
	
	public usedCar(boolean carType,String carName,String carBrand,String carModel,double price,String bodyType,int kilometer,
			String year, String owner, String ownerName,String ownerNumber)
	{
        this.carType=carType;
		this.kilometer = kilometer;
		this.year = year;
		this.owner = owner;
		this.ownerName = ownerName;
		this.ownerNumber=ownerNumber;
        this.carName = carName;
        this.carBrand= carBrand;
        this.carModel=carModel;
        this.price=price;
        this.bodyType=bodyType;
        
        
	}


	public String  viewCarDetails() {
		 String result="";
		 result+="Car Name: "+carName+"\n";
		 result+="Car brand: "+carBrand+"\n";
		 result+="Car Model: "+carModel+"\n";
		 result+="Car Price: "+price+"\n";
		 result+="Body Type: "+bodyType+"\n";
		 result+="Body Type: "+bodyType+"\n";
		 result+="Kilometers: "+kilometer+"\n";
		 result+="Year: "+year+"\n";
		 result+="Owner: "+owner+"\n";
		 result+="Owner Name:"+ownerName+"\n";
		 result+="Owner Number:"+ownerNumber+"\n";
		 
		 result+="********************************************************";
		return result;
		 
	 }

	public int getKilometer() {
		return kilometer;
	}




	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}




	public String getYear() {
		return year;
	}




	public void setYear(String year) {
		this.year = year;
	}




	public String getOwner() {
		return owner;
	}




	public void setOwner(String owner) {
		this.owner = owner;
	}




	public String getOwnerName() {
		return ownerName;
	}




	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}




	public String getOwnerNumber() {
		return ownerNumber;
	}




	public void setOwnerNumber(String ownerNumber) {
		this.ownerNumber = ownerNumber;
	}
	
}
