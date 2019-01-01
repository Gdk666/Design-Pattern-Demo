package MealBuilder;

/**
 * 建造者接口
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();//组装
}
