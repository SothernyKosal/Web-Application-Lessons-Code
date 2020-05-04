//there are 3 types of proxy dp
/*
    remote proxy: local execution of a remote service
    virtual proxy
    protection proxy
* */

//20.12.2019

interface Image{
    void displayImage();
}
class RealImage implements Image{
    private String filename;
    public RealImage(String filename){
        this.filename = filename;
        loadImageFromDisk(filename);
    }
    private void loadImageFromDisk(String filename){
        System.out.println("load "+filename);
    }
    @Override
    public void displayImage() {
        System.out.println("display "+filename);
    }
}
class ProxyImage implements Image{
    private String filename;
    private RealImage realImage;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public void displayImage() {
        if (realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.displayImage();
    }
}

public class Main {

    public static void main(String[] args) {
	    Image img = new ProxyImage("Photo.jpg");
	    img.displayImage();
    }
}
