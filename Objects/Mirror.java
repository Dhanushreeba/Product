public class Mirror{
	String clean;
	String smudged;
	String cracked;
	String foggy;
	boolean framed;
	boolean frameless;
	
	static void reflecting(){
		System.out.println("mirror is reflecting");
	}
	static void cleaning(){
		System.out.println("mirror is clean");
	}
	static void hanging(){
		System.out.println("hanging mirror");
	}
	
	
	 Mirror(String clean,String smudged,String cracked,String foggy,boolean framed,boolean frameless){
	
		this.clean=clean;
		this.smudged=smudged;
		this.cracked=cracked;
		this.foggy=foggy;
		this.framed=framed;
		this.frameless=frameless;
	
	}
	public void displayMirror(){
			System.out.println("Clean :" +clean);
			System.out.println("Smudged :" +smudged);
			System.out.println("Cracked :" +cracked);
			System.out.println("Foggy :" +foggy);
			System.out.println("Framed :" +framed);
			System.out.println("Frameless :" +frameless);
	
	}
	public static void main(String [] args){
	

		Mirror mirror=new Mirror("Clarity","Simperfection","vulnerability","unclear",false,true);
		mirror.displayMirror();
		Mirror.reflecting();
		Mirror.cleaning();
		Mirror.hanging();
	
	}	

}



	
	
		
