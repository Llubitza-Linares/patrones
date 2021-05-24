package abstractFactory;

public class FactoryHelado {

	public enum typeHelado{
		HELADO_CREMA, HELADO_AGUA, HELADO_MIXTO
	}
	
	public static IHelado make(typeHelado type) {
		IHelado helado = null;
		switch(type) {
		case HELADO_CREMA:
			helado=new HeladoCrema();
			((HeladoCrema) helado).setTamano("Grande");
			((HeladoCrema) helado).setForma("Cono");
			((HeladoCrema) helado).setFruta(new Fruta("citrico", "naranja", "10 bs", "mediano"));
			((HeladoCrema) helado).setBase(new Base("vainilla", "grande", "dulce", "5 bs"));
			((HeladoCrema) helado).setCrema(new Crema("vainilla", "2 bs", "flavor"));
			break;
		 case HELADO_MIXTO:
             helado= new HeladoMixto();
             ((HeladoMixto) helado).setForma("clasica");
             ((HeladoMixto) helado).setTamano("grande");
             ((HeladoMixto) helado).setCosto("15bs");
             ((HeladoMixto) helado).setBase(new Base("cono","grande","galleta","5bs"));
             ((HeladoMixto) helado).setFruta(new Fruta("dulce","frutilla","1","mediano"));
             ((HeladoMixto) helado).setCrema(new Crema("Naranja","1","PIL"));
             break;
		 case HELADO_AGUA:
             helado= new HeladoAgua();
             ((HeladoAgua) helado).setForma("clasica");
             ((HeladoAgua) helado).setTamano("mediano");
             ((HeladoAgua) helado).setBase(new Base("cono","grande","galleta","5bs"));
             ((HeladoAgua) helado).setFruta(new Fruta("dulce","frutilla","1","mediano"));
         default:
             helado= new HeladoAgua();
             break;
     }
     return helado;
 }
}