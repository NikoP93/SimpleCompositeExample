import java.util.ArrayList;

public class Folder implements FileSystemComponent{

    //Folder er en composite, og kan derfor indeholde andre composites eller leafs.
    private String name;
    private ArrayList<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails(){
        System.out.println("The name of this Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }

}
