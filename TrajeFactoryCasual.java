public class TrajeFactoryCasual extends FabricaDeRoupa{

    @Override
    public RoupaPernas criaRoupaPernas() {
        // TODO Auto-generated method stub
        return new Bermuda();
    }

    @Override
    public RoupaPes criaRoupaPes() {
        // TODO Auto-generated method stub
        return new Chinelo();
    }

    @Override
    public RoupaTronco criaRoupaTronco() {
        // TODO Auto-generated method stub
        return new Camiseta() ;
    }
    
}
