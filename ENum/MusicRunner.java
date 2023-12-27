public class MusicRunner{

	public static void main(String[] args)
	{
		
		Plantes planet=Plantes.EARTH;
		System.out.println(planet);
		System.out.println(planet.value);
		
		FoodType food=FoodType.NON_VEGITATRIAN;
		System.out.println(food);
		System.out.println(food.value);
		
		Directions direction=Directions.SOUTH;
		System.out.println(direction);
		System.out.println(direction.value);
		
		MusicType music=MusicType.ROCK;
		System.out.println(music);
		System.out.println(music.value);
		
		Vowels vowels=Vowels.A;
		System.out.println(vowels);
		System.out.println(vowels.value);
		
		Months months=Months.JULY;
		System.out.println(months);
		System.out.println(months.value);
		
		Semister semister=Semister.FOURTH;
		System.out.println(semister);
		System.out.println(semister.value);
		
		Gender gender=Gender.FEMALE;
		System.out.println(gender);
		System.out.println(gender.value);
		
		ClassType type=ClassType.OFFLINE;
		System.out.println(type);
		System.out.println(type.value);
		
		DanceType dance=DanceType.HIPPOP;
		System.out.println(dance);
		System.out.println(dance.value);
	
	}
	

}