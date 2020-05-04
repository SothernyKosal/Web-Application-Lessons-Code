interface shape{
    void draw(int x, int y, int z, int j);
}
class line{
    public void draw(int x1, int x2, int y1, int y2){
        System.out.println("line from point A("+x1+","+y1+"), to point B("+x2+","+y2+")");
    }
}
class rectangle{
    public void draw(int x, int y,int width, int height){
        System.out.println("rectangle with coordinate left-down point("+x+","+y+"), width: "+width+", height: "+height+"");
    }
}

class lineAdapter implements shape{
    private line adaptee;
    public lineAdapter(line line){
        this.adaptee = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1,y1,x2,y2);
    }
}
class rectangleAdapter implements shape{
    private rectangle adaptee;
    public rectangleAdapter(rectangle rectangle){

    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1,x2);
        int y = Math.min(y1,y2);
        int width = Math.abs(x2-x1);
        int height = Math.abs(y2-y1);
        adaptee.draw(x,y,width,height);
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        shape[] shapes = {new lineAdapter(new line()), new rectangleAdapter(new rectangle())};
//        int x1 = 10;
//        int x2 = 20;
//        int y1 = 20;
//        int y2 = 60;
//        for(shape shape1: shapes){
//            shape1.draw(x1,x2,y1,y2);
//        }
//    }
//}
