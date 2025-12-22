package practice19.practice19_1;



public class INN {

    private String name;
    private String inn;

    public INN(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {return name;}
    public String getInn() {return inn;}
    public void setName(String name) {this.name = name;}
    public void setInn(String inn) {this.inn = inn;}

    @Override
    public String toString() {
        return name + " - " + inn;
    }

}