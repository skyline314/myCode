public class Author {
    private String Name;
    private String Description;

    public Author(String Name, String Description){
        this.Name = Name;
        this.Description = Description;
    }

    public String getName(){
        return this.Name;
    }

    public String getDesc(){
        return this.Description;
    }
}
