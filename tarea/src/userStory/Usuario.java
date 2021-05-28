package userStory;

public class Usuario extends AbstractUserStory{

	@Override
	public void interpreter(ContextUserStory context) {
		if (context.input.startsWith("Como [ usuario ]")){
            context.output= context.output+"Given [user]";
            context.input=context.input.substring(1);
	 }
		
		
	}

}
