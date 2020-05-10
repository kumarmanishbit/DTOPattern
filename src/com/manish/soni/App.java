package com.manish.soni;

public class App {

	public static void main(String[] args) {
		Database database = new Database();

		database.insert(new Person("Manish", 30, "male", "Hydrabad"));
		database.insert(new Person("John", 20, "male", "CA"));
		database.insert(new Person("David", 31, "male", "NA"));

		for (Person person : database.getPeople()) {
			System.out.println(person);
		}
	}
}
