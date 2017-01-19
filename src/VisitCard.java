import java.util.ArrayList;

/**
 * Created by 33558 on 19.01.2017.
 */
public class VisitCard {
    private String name;
    private String surName;
    private ArrayList<String> phones;
    private ArrayList<String> sites;
    private Place place;

    @Override
    public String toString() {
        return "VisitCard{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", phones=" + phones.toString() +
                ", sites=" + sites.toString() +
                ", place=" + place.toString() +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public ArrayList<String> getSites() {
        return sites;
    }

    public void setSites(ArrayList<String> sites) {
        this.sites = sites;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
