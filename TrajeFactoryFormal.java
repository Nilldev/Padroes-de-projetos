public class TrajeFactoryFormal extends FabricaDeRoupa {
     
    @Override
    public RoupaPernas criaRoupaPernas() {
        // TODO Auto-generated method stub
        return new Calca();
    }
    @Override
    public RoupaPes criaRoupaPes() {
        // TODO Auto-generated method stub
        return new Sapato();
    }
    @Override
    public RoupaTronco criaRoupaTronco() {
        // TODO Auto-generated method stub
        return new Camisa();
    }
    
}
