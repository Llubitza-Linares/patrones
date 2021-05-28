package userStory;

public class ClienteUserStory {
	
	public static void main(String[] args) {
		String interpretar="Como [ usuario ]\r\n"
				+ "Quiero [accciones]\r\n"
				+ "Para [valor de la story]";
		
		SintaxisGuerkins parser=new SintaxisGuerkins(interpretar);
		
		String interpretado=parser.interpretar();
		System.out.println("interpretar: "+interpretar);
		System.out.println("interpretado:"+ interpretado);
	}

}
