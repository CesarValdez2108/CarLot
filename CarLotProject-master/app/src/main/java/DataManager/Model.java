package DataManager;
import DataManager.Pool.*;

public class Model extends Component{
    private String modelName = new String();
    private int modelYear=0; 
    
    public Model(Brand brand) throws ComponentNotBoundToPool{
        if(brand == null) return;
        if(!BrandPool.get().componentIsRegisteredAtPool(brand)){
            throw new ComponentNotBoundToPool("The 'brand' object passed to bindToBrand does not exist inside BrandPool");
        }
        brand.addChild(this);
    }
    
    public Brand getBrand(){
        return (Brand)getParent();
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return this.modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    
}
