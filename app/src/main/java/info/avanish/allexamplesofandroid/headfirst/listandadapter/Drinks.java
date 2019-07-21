package info.avanish.allexamplesofandroid.headfirst.listandadapter;

/**
 * Created by kunwa on 3/8/2018.
 */
import info.avanish.allexamplesofandroid.R;

public class Drinks {

    String name;
    String description;
    int resource;

    //drinks is an array of Drinks
    public static final Drinks[] drinks = {
            new Drinks("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drinks("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drinks("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    public Drinks(String name, String description, int resource) {
        this.name = name;
        this.description = description;
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    /*@Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", resource=" + resource +
                '}';
    }*/
    @Override
    public String toString() {
        return this.name;
    }
}
