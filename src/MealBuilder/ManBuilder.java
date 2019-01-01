package MealBuilder;

import SingletonDemo.MyObject;

/**
 * 具体建造者
 */
public class ManBuilder implements PersonBuilder {
    private Person person;

    public ManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("构造头部");

    }

    @Override
    public void buildBody() {
        person.setBody("构造身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("构造四肢");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
