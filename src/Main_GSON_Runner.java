import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by 33558 on 19.01.2017.
 */
public class Main_GSON_Runner {
    public static void main(String[] args) {
        Gson gson = new Gson();
        VisitCard card = null;
        try {
            FileReader  reader = new FileReader("visitCard.json");
            card = gson.fromJson(reader,VisitCard.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(card.toString());
    }
}
