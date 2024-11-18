import eksempel1.File;
import eksempel1.Folder;
import eksempel2.Box;
import eksempel2.Product;

public class Main {

    public static void main(String[] args) {

        System.out.println("Eksempel 1");
        //Her laver vi leafs
    File file1 = new File("File1");
    File file2 = new File("File2");
    File file3 = new File("File3");

    //Her laver vi Composite
    Folder folder1 = new Folder("Folder1");
    Folder folder2 = new Folder("Folder2");

    //Laver "træ strukturen"
    folder1.addComponent(file1);
    folder1.addComponent(file2);
    folder2.addComponent(file3);
    folder2.addComponent(folder1);

    //Kalder showDetails på folder2, og det kommer til at vise hele træ strukturen
    folder2.showDetails();
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Eksempel 2");


        Product iphone = new Product("Iphone",7000);
        Product airpods = new Product("airpods",1500);
        Product charger = new Product("Keyboard",500);
        Product macbook = new Product("Mouse",10000);
        Product mouse = new Product("Monitor",500);

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();

        box1.addItem(iphone);
        box1.addItem(charger);
        box2.addItem(airpods);
        box3.addItem(macbook);
        box3.addItem(mouse);
        box4.addItem(box1);
        box4.addItem(box2);
        box4.addItem(box3);

        System.out.println("Boks 4 totale pris, inkluderet alle bokse: " + box4.getPrice());

        System.out.println("boks 1 totale pris: "+ box1.getPrice());
    }
}
