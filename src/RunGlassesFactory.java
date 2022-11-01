public class RunGlassesFactory {
    public static void main(String[] args) {
    RunGlassesFactory runGlasses = new RunGlassesFactory();
    }
public RunGlassesFactory(){
Glasses one;
one = new Glasses("circle",255,255,0,'l',"transition","yellow");
one.printInfo();

Glasses two;
two = new Glasses("square",128,0,128,'m',"clear","purple");
two.printInfo();
}
}
