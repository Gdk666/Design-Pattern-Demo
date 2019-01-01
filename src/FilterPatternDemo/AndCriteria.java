package FilterPatternDemo;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> criteriaList(List<Person> personList) {
        List<Person> first =criteria.criteriaList(personList);
        return otherCriteria.criteriaList(first);
    }
}
