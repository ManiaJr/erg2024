package Computer;

public class Network {
    
    private String description="This network carries bits and bytes";


    public Network() {
        System.out.println("This is a Data Network");
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
