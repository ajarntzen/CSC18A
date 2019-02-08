/* * Author: Alyssa Arntzen
   * Created on: February 1, 2019
   * Purpose: Menu Ordering System for Small Cafe/Boba Shop "Aroma Corner"
   */

import java.util.Scanner;

class Drinks { //Class "drinks"
	double size;
	double toppings;
double dPrice(){ //Method to get price of drink.
	return (size + toppings);
	}
}

class Foods { //Class "food"
	double type;
double fPrice(){ //Price of food
	return type;
	}
}

class Desserts {
	double type;
	double toppings;
double dePrice() {
	return (type + toppings);
	}
}

class AromaCorner {
	public static void main(String args[]){
	Scanner reader=new Scanner(System.in);
	Scanner input=new Scanner(System.in);

	//Declaring Variables
	int choice=0;           //Choose Category from Menu. 
        char drink;             //Drink choice
	char food;              //Entree choice
	char dessert;           //Dessert choice
	char more=0;            //Continue Ordering
	double subtotal=0;      //Total before tax
	double total=0;          //Total after tax
	int[] stringArray={};
	String[] stringarray = new String[20];

	//Welcome page
	System.out.println();
	for (int i=0;i<=27;i++){
		System.out.print("*");
	}
	System.out.println();
	System.out.println("* Welcome to Aroma Corner! *");
	for (int i=0;i<=27;i++){
		System.out.print("*");
	}
	System.out.println();
	

	do{
	//MenuStarts
	System.out.println();
	System.out.println("What would you like to order?");
	System.out.println("Type '1' for drinks");
	System.out.println("Type '2' for entrees");
	System.out.println("Type '3' for desserts");
	System.out.println("Type anything else to exit.");
	choice=input.nextInt();

	switch(choice) {
		case(1): //Prices for drinks
		System.out.println("What kind of drink would you like?");
		System.out.println("Type 'T' for tea, 'M' for Milk Tea or 'S' for Smoothie.");
		drink=reader.next().charAt(0);

		//This validates the user input, ensuring the either press 't', 'm' or 's'
		while (drink!='t' && drink !='T'&& drink !='m' && drink !='M' && drink !='S' && drink!='s'){
			System.out.println("That is not a valid drink option.");
			System.out.println("Type 'T' for tea, 'M' for Milk Tea or 'S' for Smoothie.");
			drink=reader.next().charAt(0);
		}
		
		//Price for regular tea
		if (drink=='T' || drink=='t'){
		Drinks tea = new Drinks ();
		System.out.println("Would you like a small size of large size?");
		System.out.println("Type 'S' for small or 'L' for large.");
		char size=reader.next().charAt(0);
		while (size !='s' && size !='S' && size!='L' && size!='l'){
			System.out.println("That is not a valid size.");
			System.out.println("Type 'S' for small or 'L' for large.");
			size=reader.next().charAt(0);
		}			
			if (size=='S' || size=='s'){ //if size is small, it is $2.75
				tea.size=2.75;       //else, price will be $3.50
			  } else tea.size=3.5;	
		System.out.println("Would you like any toppings?");	
		System.out.println("Type 'Y' for yes or 'N' for no");
		char toppings=reader.next().charAt(0);
		while (toppings !='Y' && toppings !='y' && toppings !='n' && toppings !='N'){
			System.out.println("That is not a valid input.");
			System.out.println("Type 'Y' for toppings or 'N' for no toppings.");
			toppings=reader.next().charAt(0);
		}	
			if(toppings=='Y' || toppings=='y'){ //toppings additional charge of 0.50
				tea.toppings=.50;
		          }else tea.toppings=0;

		subtotal+=tea.dPrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}
		
		//Price for Milk Tea
		if (drink=='M' || drink=='m'){
		Drinks milktea = new Drinks ();
		System.out.println("Would you like a small size of large size?");
		System.out.println("Type 'S' for small or 'L' for large.");
		char size=reader.next().charAt(0);
			if (size=='S' || size=='s'){
				milktea.size=2.75;
			  }else milktea.size=3.50;
		System.out.println("Would you like any toppings?");
		System.out.println("Type 'Y' for yes or 'N' for no");
		char toppings=reader.next().charAt(0);
			if(toppings=='Y' || toppings=='y'){
				milktea.toppings=.50;
			  }else milktea.toppings=0;
		subtotal+=milktea.dPrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}

		//Price for Smoothie
		if (drink=='S' || drink=='s'){
		Drinks smoothie = new Drinks ();
		System.out.println("Would you like a small size of large size?");
		System.out.println("Type 'S' for small or 'L' for large.");
		char size=reader.next().charAt(0);
			if (size=='S' || size=='s'){
				smoothie.size=3.75;
			  }else smoothie.size=4.5;
		System.out.println("Would you like any toppings?");
		System.out.println("Type 'Y' for yes or 'N' for no");
		char toppings=reader.next().charAt(0);
			if(toppings=='Y' || toppings =='y'){
				smoothie.toppings=.5;
			  }else smoothie.toppings=0;		
		subtotal+=smoothie.dPrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}
                break;

		case(2): //Prices for entrees
		System.out.println("Would you like a sandwich, wrap, or noodles?");
		System.out.println("Type 'S' for sandwich or type 'W' for wrap of 'N' for noodles.");
		food=reader.next().charAt(0);

		//Price for sandwich
		if (food=='S' || food=='s'){
		Foods sandwich = new Foods();
		System.out.println("What kind of sandwich would you like?");
		System.out.println("Type 'T' for tuna, 'H' for ham, or 'P' for shredded pork.");
		char type=reader.next().charAt(0);
			if (type=='T' || type =='t'){
				sandwich.type=3.95;
				}
			else if(type=='H'||type=='h'){
				sandwich.type=3.85;
				}else sandwich.type=4.05;
		subtotal+=sandwich.fPrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}

		//Price for wrap
		if (food=='W'||food=='w'){
		Foods wrap = new Foods();
		System.out.println("What kind of wrap would you like?");
		System.out.println("Type 'E' for egg and cheese, 'B' for bacon, or 'P' for shredded pork.");
		char type=reader.next().charAt(0);
			if (type=='E'||type=='e'){
				wrap.type=3.25;
				}
			else if(type=='B'||type=='b'){
				wrap.type=3.85;
				}else wrap.type=3.95;
		subtotal+=wrap.fPrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}
                
                //Price for noodles
		if (food=='N' || food=='n'){
		Foods noods= new Foods();
		System.out.println("What would you like with your noodles?");
		System.out.println("Type 'V' for vegetables or 'C' for chicken");
		char type=reader.next().charAt(0);
			if (type =='V'||type=='v'){
				noods.type=4.75;
			  }else noods.type=5.95;
		subtotal+=noods.fPrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}
		break;

		case(3): //Prices for desserts
		System.out.println("What kind of dessert would you like?"); 
		System.out.println("Type 'S' for a slice of cake, 'C' for cookie, or 'I' for ice cream");
		dessert=reader.next().charAt(0);
                //Price for Slice of Cake and different types of cake
		if (dessert=='S'||dessert=='s'){
		Desserts cake = new Desserts();
		System.out.println("Which cake would you like?");
		System.out.println("Type 'C' for chocolate or 'R' for red velvet of 'S' for strawberry.");
		char type=reader.next().charAt(0);
			if(type=='C'||type=='c'){
				cake.type=3.25;
			  }
			else if(type=='R'||type=='r'){
				cake.type=3.30;
			  }else cake.type=3.20;
		System.out.println("Would you like any fruits (strawberries, bananas) or drizzle (caramel or chocolate) on top?");
		System.out.println("Type 'F' for fruit, 'D' for drizzle of 'B' for both.");
		char top=reader.next().charAt(0);
			if (top=='F'||top=='f'){
				cake.toppings=0.5;
			}else if(top=='D'||top=='d'){
				cake.toppings=0.25;
			}else cake.toppings=0.75;
		subtotal+=cake.dePrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}
                //Price for cookie
		if(dessert=='C'||dessert=='c'){
		Desserts cookie=new Desserts();
		System.out.println("What kind of cookie would you like?");
		System.out.println("Type 'C' for chocolate chip, 'O' for oatmeal, or 'W' for white chocolate");
		char type=reader.next().charAt(0);
			if(type=='C'||type=='c'){
				cookie.type=1.00;
			}else if(type=='O'||type=='o'){
				cookie.type=.90;
			}else   cookie.type=1.15;
		System.out.println("Would you like any whipped topping?");
		System.out.println("Type 'Y' for yes or 'N' for no");
		char top=reader.next().charAt(0);
			if(top=='Y'||top=='y'){
				cookie.toppings=0.25;
			}else cookie.toppings=0;
		subtotal+=cookie.dePrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}
		//Price for ice cream
		if(dessert=='I' || dessert=='i'){
		Desserts icecream=new Desserts();
		System.out.println("Would you like your ice cream in a bowl or cone?");
		System.out.println("Type 'B' for bowl or 'C' for cone");
		char type=reader.next().charAt(0);
			if(type=='B' || type=='b'){
				icecream.type=3.00;
			  }else icecream.type=3.25;
		System.out.println("Would you like any fruits (strawberries, bananas) or drizzle (caramel or chocolate) on top?");
		System.out.println("Type 'F' for fruit, 'D' for drizzle of 'B' for both.");
		char top=reader.next().charAt(0);
			if (top=='F'||top=='f'){
				icecream.toppings=0.5;
			}else if(top=='D'||top=='d'){
				icecream.toppings=0.25;
			}else icecream.toppings=0.75;
		subtotal+=icecream.dePrice();
		System.out.printf("Your subtotal so far is $%.2f", subtotal);
		System.out.println();
		System.out.println("Would you like to order more? Type Y for yes or N for no");
		more=reader.next().charAt(0);
		}
		break;

		default:
		System.out.println("Thank you, come again!");
		}
	}while (more=='Y' || more =='y');

		//Display total and exit
		total=subtotal*1.07;
		System.out.println();

		for (int i=0;i<=39;i++){
		System.out.print("*");
		}
		System.out.println();
		System.out.println("* Thank you for coming to Aroma Corner *");
		System.out.println("*                                      *");
		System.out.printf ("*         Your total is $%.2f",total);
		System.out.println("         *");
		System.out.println("*            Come again soon!          *");
		for (int i=0;i<=39;i++){
		System.out.print("*");
		}
		System.out.println();

	}
}
	