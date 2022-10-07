
public class clienteMain {


public static void main(String[] args) {
    
//FabricaDeRoupa trajeRoupaFormal = new TrajeFactoryCasual.getFactory("Casual");
FabricaDeRoupa trajeRoupa=FabricaDeRoupa.getFactory("Casual");
Manequim manequim = new Manequim ();
manequim.colocarRoupa(trajeRoupa);
trajeRoupa=FabricaDeRoupa.getFactory("Formal");
manequim.colocarRoupa(trajeRoupa);

    
}
}
