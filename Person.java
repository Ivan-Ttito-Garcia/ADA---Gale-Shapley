public class Person {
	
	private String name;
	private Person[] PreferenceList;
	private Person pair;
	
	Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPreferenceList(Person[] arr) {
		this.PreferenceList = arr;
	}
	public Person PreferenceList(int i) {
		return this.PreferenceList[i];
	}
	public Person[] PreferenceList() {
		return this.PreferenceList;
	}
	public Person getPair() {
		return this.pair;
	}
	public void setPair(Person pair) {
		this.pair = pair;
	}
}
