package MealBuilder;

/**
 * 指挥者
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder personBuilder){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        return personBuilder.buildPerson();
    }
}
