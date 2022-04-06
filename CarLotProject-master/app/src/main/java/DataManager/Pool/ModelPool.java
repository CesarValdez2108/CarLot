package DataManager.Pool;

public class ModelPool extends ComponentPool{
    private static ModelPool instance = new ModelPool();

    private ModelPool(){
        nextPool = VehiclePool.get();
    }

    public static ModelPool get(){
        return instance;
    }

}
