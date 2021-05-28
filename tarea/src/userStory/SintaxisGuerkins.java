package userStory;

import java.util.ArrayList;
import java.util.List;

public class SintaxisGuerkins extends AbstractUserStory{

	private List<AbstractUserStory> parseTree= new ArrayList<>();
    private ContextUserStory context;

    public SintaxisGuerkins(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new ContextUserStory(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "Como [ usuario ]":
                    parseTree.add(new Usuario());
                    break;
                case "Quiero [accciones]":
                    parseTree.add(new Acciones());
                    break;
                case "Para [valor de la story]":
                    parseTree.add(new ValorDeLaStory());
                    break;
                default:
                    break;
            }

        }
    }


    public String interpretar(){
        for (AbstractUserStory terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    public void interpreter(ContextUserStory context) {

    }
}
