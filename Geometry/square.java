package Geometry;

public class square implements Triangle {
    public void draw(){
        System.out.println("Draw "+this.getRectangle() +"squar");
    }

    @Override
    public String getRectangle() {
        return "đơs";
    }
}
