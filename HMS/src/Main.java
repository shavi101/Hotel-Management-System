import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String availability1 = "Empty";
		// TODO Auto-generated method stub
		System.out.println("Choose from the menu what the program should do");
		System.out.println("_________________________________________________________________________________________________________________________________________________");
		System.out.println("A-Add customer|V-View rooms|E-Display empty rooms|D-Delete customer from room|F-Find room|S-Store program Data"
				+ "|L-Load Data|O-View rooms in order");
		System.out.println("_________________________________________________________________________________________________________________________________________________");
		
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<10;i++){ 
		System.out.print("Select:");
        String menu = sc.nextLine();
        while (menu.matches("^[b-cB-Cg-kG-Km-nM-Np-rP-Rt-uT-Uw-zW-Z0-9]*$")) {
        	System.out.print("Invalid input Please Re-enter:");
	        menu = sc.nextLine();
       }
        
      //  availability=Room.availability;
		Room r=new Room("","",availability1);
		r.Array();
        
    		if(menu.equalsIgnoreCase("a")){
    	        r.addCustomer();
    		}
    		else if(menu.equalsIgnoreCase("v")){
    			r.viewRooms();
    		}
    		else if(menu.equalsIgnoreCase("e")){
    			r.isAvailable();

    	}
    		else if(menu.equalsIgnoreCase("d")){
    			r.addCustomer();

        	}
    		else if(menu.equalsIgnoreCase("f")){
    			r.addCustomer();

        	}
    		else if(menu.equalsIgnoreCase("s")){
    			
    			r.addCustomer();
        	}
    		else if(menu.equalsIgnoreCase("l")){
    			r.addCustomer();
        	}
    		else {
    			r.addCustomer();
        	}
    		
		}
	}

}
