import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Parser;

public class showRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String carCountString =JOptionPane.showInputDialog(null, "How many cars?");
		int carCount = Integer.parseInt(carCountString);
		Cars [] cars = new Cars[carCount];
		
		
		 
		   while(JOptionPane.OPTIONS_PROPERTY!=null) {  
			   
			   
		        String selection =JOptionPane.showInputDialog(null, "Welcome Please Select: \n  (+) to add Car "
		        		+ "\n  ($) to Sell car \n  (#) to show all cars");
		        if(selection.equals("+")) {
		        	String carType = JOptionPane.showInputDialog(null,"1-New Cars  2-Used Cars");
		        	for(int i=0;i<cars.length;i++) {
		        	if(carType.equals("1")) {
		        		
		        		boolean state =true;
		        		String carName = JOptionPane.showInputDialog(null,"Please Enter Car Name");
		        		String carBrand =JOptionPane.showInputDialog(null,"Please Enter Car brand");
		        		String carModel =JOptionPane.showInputDialog(null,"Please Enter Car Model");
		        		String price= JOptionPane.showInputDialog(null,"Please Enter Car Price");
		        		double carPrice=Double.parseDouble(price);
		        		String bodyType =JOptionPane.showInputDialog(null,"Please Enter bodyType");
		        		String carSpeedString =JOptionPane.showInputDialog(null,"Please Enter Car speed");
		        		int carSpeed=Integer.parseInt(carSpeedString);
		        	
		        		newCar newCars = new newCar(state,carName, carBrand, carModel, carPrice, bodyType, carSpeed);
		        		cars[i]= newCars;
		        		
		        		}
		        	
		        	else if(carType.equals("2")) {
		        		boolean state = false;
		        		String carName = JOptionPane.showInputDialog(null,"Please Enter Car Name");
		        		String carBrand =JOptionPane.showInputDialog(null,"Please Enter Car brand");
		        		String carModel =JOptionPane.showInputDialog(null,"Please Enter Car Model");
		        		String price= JOptionPane.showInputDialog(null,"Please Enter Car Price");
		        		double carPrice=Double.parseDouble(price);
		        		String bodyType =JOptionPane.showInputDialog(null,"Please Enter bodyType");
		        		String kilometerString = JOptionPane.showInputDialog(null,"Please Enter kilometers");
		        		int kilometer = Integer.parseInt(kilometerString);
		        		String year = JOptionPane.showInputDialog(null,"Please Enter Car year");
		        		String owner = JOptionPane.showInputDialog(null,"Please Enter Car owner");
		        		String ownerName = JOptionPane.showInputDialog(null,"Please Enter owner Name");
		        		String ownerNumber = JOptionPane.showInputDialog(null,"Please Enter owner number");
		        		
		        		usedCar usedCars = new usedCar(state, carName, carBrand, carModel, carPrice, 
		        				bodyType, kilometer, year, owner, ownerName, ownerNumber);
		        	
		        		cars[i]=usedCars;
		        	}
		        	else {
		        		JOptionPane.showMessageDialog(null, "please enter a valid choice!");
		        	}
		        	}
		        }
		        else if(selection.equals("$")) {
		        	String priceRangeString=JOptionPane.showInputDialog(null,"Please Enter your price Range");
		        	double rangePrice=Double.parseDouble(priceRangeString);
		        	String carStateString =JOptionPane.showInputDialog(null,"if it is new type true else type false");
		            boolean carstate = Boolean.parseBoolean(carStateString);
		        	for(int j=0;j<cars.length;j++) {
		        		if(cars[j].price<=rangePrice&&cars[j].carType==carstate) {
		        			
		        				JOptionPane.showMessageDialog(null, cars[j].viewCarDetails());
		        						        			
		        				
		        		}
		        		
		        	}
		        	
		        }
		        
		        else if(selection.equals("#")) {
		        	for(int z=0;z<cars.length;z++) {
		        		if(cars[z].carType==true) {
		        			
		        			JOptionPane.showMessageDialog(null, "**New Car** \n"+cars[z].viewCarDetails());
		        		}
		        		else {
		        			JOptionPane.showMessageDialog(null, "**OLD Car** \n"+cars[z].viewCarDetails());
		        		}
		        	}
		        }
		        
		   }
		}
	}


