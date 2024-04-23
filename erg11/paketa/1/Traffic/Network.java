package Traffic;

public class Network {
    
    private String description="Τhis network is used by vehicles";


    public Network() {
        System.out.println("This is a Traffic Network");
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getDescription();
    }

}