package userStory;

public class ValorDeLaStory extends AbstractUserStory{

	@Override
	public void interpreter(ContextUserStory context) {
		if (context.input.startsWith("Para [valor de la story]")){
            context.output= context.output+"Then [value story]";
            context.input=context.input.substring(1);
	 }
		
	}

}
