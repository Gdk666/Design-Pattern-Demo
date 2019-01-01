package FilterPatternDemo;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> criteriaList(List<Person> personList) {
        List<Person> first =criteria.criteriaList(personList);
        List<Person> secord = otherCriteria.criteriaList(personList);
        for (Person person:secord){
            if (!first.contains(person)){
                first.add(person);
            }
        }
        return first;
    }
}
