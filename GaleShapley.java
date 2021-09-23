import java.util.*;
public class GaleShapley {
	
	public static void main(String[] arg) {
		
		Person victor = new Person("Victor");
		Person william = new Person("William");
		Person xavier = new Person("Xavier");
		Person yancey = new Person("Yancey");
		Person zeus = new Person("Zeus");
		
		Person amy = new Person("Amy");
		Person bertha = new Person("Bertha");
		Person claire = new Person("Claire");
		Person diane = new Person("Diane");
		Person erika = new Person("Erika");
		
		victor.setPreferenceList(new Person[]{bertha , amy , diane , erika , claire});
		william.setPreferenceList(new Person[]{diane , bertha , amy , claire , erika});
		xavier.setPreferenceList(new Person[]{bertha , erika , claire , diane , amy});
		yancey.setPreferenceList(new Person[]{amy , diane , claire , bertha , erika});
		zeus.setPreferenceList(new Person[]{bertha , diane , amy , erika , claire});
		
		amy.setPreferenceList(new Person[]{zeus , victor , william , yancey , xavier});
		bertha.setPreferenceList(new Person[]{xavier , william , yancey , victor , zeus});
		claire.setPreferenceList(new Person[]{william , xavier , yancey , zeus , victor});
		diane.setPreferenceList(new Person[]{victor , zeus , yancey , xavier , william});
		erika.setPreferenceList(new Person[]{yancey , william , zeus , xavier , victor});
		
		
		//PREGUNTA 2-A
		/*
		ArrayList<Person> mens = new ArrayList<Person>();
		mens.add(victor);
		mens.add(william);
		mens.add(xavier);
		mens.add(yancey);
		mens.add(zeus);
		
		for(Person m : mens) {
			findAPartenr(m);
		}

		for(int i = 0 ; i < mens.size() ; i++) {
			System.out.println(mens.get(i).getName()+" <==> "+mens.get(i).getPair().getName());
		}
		*/
		
		
		//PREGUNTA 2-B
		/*
		ArrayList<Person> womens = new ArrayList<Person>();
		womens.add(amy);
		womens.add(bertha);
		womens.add(claire);
		womens.add(diane);
		womens.add(erika);
		
		for(Person w : womens) {
			findAPartenr(w);
		}

		for(int i = 0 ; i < womens.size() ; i++) {
			System.out.println(womens.get(i).getName()+" <==> "+womens.get(i).getPair().getName());
		}
		*/
		
		
		//PREGUNTA 3
		/*
		ArrayList<Person> mens = new ArrayList<Person>();
		mens.add(yancey);
		mens.add(xavier);
		mens.add(victor);
		mens.add(william);
		mens.add(zeus);
		
		for(Person m : mens) {
			findAPartenr(m);
		}

		for(int i = 0 ; i < mens.size() ; i++) {
			System.out.println(mens.get(i).getName()+" <==> "+mens.get(i).getPair().getName());
		}
		*/
	}
	
	//METODO QUE EMPAREJA A UNA PERSONA DETERMINADA...
	public static void findAPartenr(Person m) {
		
		for(int i = 0 ; i < m.PreferenceList().length ; i++){
			
			if(m.PreferenceList(i).getPair() == null) {
				match(m , m.PreferenceList(i));
				return;
			}
			
			else{
				for(Person p : m.PreferenceList(i).PreferenceList()) {
					if(p.equals(m.PreferenceList(i).getPair()))
						break;
					if(p.equals(m)){
						Person aux = m.PreferenceList(i).getPair();
						match(m , m.PreferenceList(i));
						findAPartenr(aux);
						return;
					}
				}
			}
		}
	}
	
	//METODO QUE ACTUALIZA LA PAREJA DE DOS PERSONAS
	public static void match(Person men, Person woman){
		men.setPair(woman);
		woman.setPair(men);
	}
	

}
