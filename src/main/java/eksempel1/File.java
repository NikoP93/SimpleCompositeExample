package eksempel1;

public class File implements FileSystemComponent {

    //eksempel1.File er en leaf, kan ikke indholde andre elementer.
    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void showDetails(){
        System.out.println("The name of this file: " + name);
    }
}
