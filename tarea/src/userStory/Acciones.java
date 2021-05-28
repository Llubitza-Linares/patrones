package userStory;

public class Acciones extends AbstractUserStory{

	@Override
	public void interpreter(ContextUserStory context) {
		 if (context.input.startsWith("Quiero [accciones]")){
	            context.output= context.output+"When [actions]";
	            context.input=context.input.substring(1);
		 }
	}

}
