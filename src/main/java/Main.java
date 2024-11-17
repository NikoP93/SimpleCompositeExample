public class Main {

    public static void main(String[] args) {

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

    }
}
