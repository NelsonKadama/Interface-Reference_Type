import java.util.ArrayList;
import java.util.List;

/**
 * NoisyPetStore (un-generified) given to students for Assignment 7 Question 3
 *
 * @version 0.1
 */
public class NoisyPetStore {

    //Stores pets
    private List <MakesSound> list;

    public NoisyPetStore() {
       list = new ArrayList<MakesSound>();
    }

    //add a pet to the pet store
    public void addPet(MakesSound o) {
        list.add(o);
    }

    //get the last pet from the store
    public MakesSound buyNewestPet() {
        Object ans = null;
        if (list.size() > 0) {
            ans = list.remove(list.size() - 1);
        }
        return (MakesSound) ans;
    }

    public String makeHugeNoise() {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            ans.append(((MakesSound) list.get(i)).makeNoise());
        }
        return ans.toString();
    }
}