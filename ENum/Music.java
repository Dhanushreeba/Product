public class Music{

	Plantes plantes;
	FoodType foodtype;
	Directions directions;
	Months months;
	MusicType musictype;
	Vowels vowels;
	Semister semister;
	Gender gender;
	ClassType classtype;
	DanceType dancetype;
	
		Music(Plantes plantes,FoodType foodtype,Directions directions,Months months,MusicType musictype,Vowels vowels,Semister semister,Gender gender,ClassType classtype,DanceType dancetype);
		{
			this.plantes=plantes;
			this.foodtype=foodtype;
			this.directions=directions;
			this.months=months;
			this.musictype=musictype;
			this.vowels=vowels;
			this.semister=semister;
			this.gender=gender;
			this.classtype=classtype;
			this.dancetype=dancetype;
		}
		public void displayMusicDetails()
		{
			System.out.println("Plantes :" +plantes);
			System.out.println("FoodType :" +foodtype);
			System.out.println("Directions :" +directions);
			System.out.println("Months :" +months);
			System.out.println("MusicType :" +musictype);
			System.out.println("Vowels :" +vowels);
			System.out.println("Semister :" +semister);
			System.out.println("Gender :" +gender);
			System.out.println("ClassType :" +classtype);
			System.out.println("DanceType :" +dancetype);
		}
}