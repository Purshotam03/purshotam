package purshotam;

public class GuessGame {
	Player p1;
	Player p2;
	public void startgame(){
		p1= new Player();
		p2=new Player();
		int guessp1=0;
		int guessp2=0;
		boolean p1isright=false;
		boolean p2isright=false;
		int targetnm=(int)(Math.random()*10);
		System.out.println("i am thinking of number");
		while(true){
			System.out.print("no to guess"+targetnm);
		p1.guess();
		p2.guess();
		guessp1=p1.number;
		System.out.println("player one guess"+guessp1);
		guessp2=p2.number;
		System.out.println("player one guess"+guessp2);
		if(guessp1==targetnm){
				p1isright=true;}
				if(guessp2==targetnm){
					p2isright=true;}	
			if (p1isright||p2isright){
				System.out.println("we have winner");
				System.out.println("game over");
				break;}
			else{System.out.println("try again");
			}
			}
					
			
	
	}
}


