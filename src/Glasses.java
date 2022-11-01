public class Glasses {

    public String shape;
    public int red;
    public int green;
    public int blue;
    public char size;
    public String lenses;
    public String color;

    public Glasses(String pShape,int pRed, int pGreen, int pBlue, char pSize,String pLenses, String pColor){
    shape = pShape;
    red = pRed;
    green = pGreen;
    blue = pBlue;
    size = pSize;
    lenses = pLenses;
    color = pColor;
    }

    public void printInfo(){
        System.out.println("The glasses are " + color);
        System.out.println("The glasses are " + shape + " shaped");
        System.out.println("The glasses are size " + size);
        System.out.println("The glasses have " + lenses + " lenses");
        System.out.println();
    }

}
