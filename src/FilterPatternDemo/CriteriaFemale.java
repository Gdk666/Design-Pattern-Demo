package FilterPatternDemo;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> criteriaList(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
