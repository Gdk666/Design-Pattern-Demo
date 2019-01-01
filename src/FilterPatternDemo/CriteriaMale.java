package FilterPatternDemo;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> criteriaList(List<Person> personList) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
