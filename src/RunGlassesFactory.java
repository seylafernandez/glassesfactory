public class RunGlassesFactory {
    public static void main(String[] args) {
    RunGlassesFactory runGlasses = new RunGlassesFactory();
    }
public RunGlassesFactory(){
Glasses yellow;
yellow = new Glasses("circle",255,255,0,'b',"transition");
yellow.printInfo();

Glasses purple;
purple = new Glasses("square",128,0,128,'m',"clear");
purple.printInfo();
}
}
