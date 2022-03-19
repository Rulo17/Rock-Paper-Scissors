package Service;

import Model.Paper;
import Model.Rock;
import Model.Scissors;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RPSService {

    public String ia(){
        int random = (int)(Math.random()*3);
        List<String> iaPlayer = new ArrayList<>();
        iaPlayer.add(0, new Rock().getNombre());
        iaPlayer.add(1, new Paper().getNombre());
        iaPlayer.add(2, new Scissors().getNombre());

        return iaPlayer.get(random);
    }

    public String match(String selection, String pc){

        String result = "Funciona";

        if(selection.equals(pc))
            result = selection + " vs " + pc + " = Tie";

        else if(selection.equals("Rock")) {
            if (pc.equals("Paper"))
                result = selection + " vs " + pc + " = " + pc + " won";
            else if (pc.equals("Scissors"))
                result = selection + " vs " + pc + " = " + selection + " won";
        }

        else if(selection.equals("Paper")) {
            if (pc.equals("Rock"))
                result = selection + " vs " + pc + " = " + selection + " won";
            else if (pc.equals("Scissors"))
                result = selection + " vs " + pc + " = " + pc + " won";
        }

        else if(selection.equals("Scissors")) {
            if (pc.equals("Paper"))
                result = selection + " vs " + pc + " = " + selection + " won";
            else if (pc.equals("Rock"))
                result = selection + " vs " + pc + " = " + pc + " won";
        }

        return result;
    }

    public String play(String selection){
        String pc = ia();
        String result = match(selection, pc);
        return result;
    }

}
