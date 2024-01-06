class Catclass {
    String color;
	String sex;
	String mood;
}
public class Cat {
    public static void main(String[] args) {
        Catclass cat = new Catclass();
		cat.color = "bialy";
		cat.sex = "samica";
		cat.mood = "szczesliwy";
		
		System.out.println("Moj kot jest "+ cat.color + ",jest " + cat.sex + " i jest " + cat.mood);
	}
}