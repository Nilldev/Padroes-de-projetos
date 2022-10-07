public abstract class FabricaDeRoupa {
    FabricaDeRoupa fabricaDeRoupa;
    public static FabricaDeRoupa getFactory(String tiporoupa) {
        if(tiporoupa.equals("Formal"))
           return new TrajeFactoryFormal();
        if(tiporoupa.equals("Casual")) 
           return new TrajeFactoryCasual();
        return null;    
        
    }

    public abstract RoupaTronco criaRoupaTronco();
    public abstract RoupaPernas criaRoupaPernas();
    public abstract RoupaPes criaRoupaPes();
}
