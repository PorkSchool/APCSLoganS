/*
 * Logan Santamarina
 * 3/1/24
 * A script that practices inheritance by creating diffrent biomes using one terrain class and extending that class to subclasses
 */
public class Excavator{
    public static void main(String[] args) {

        Terrain terrain = new Terrain(11, 11);
        Forest forest = new Forest(51, 51, 1000);
        DeepJungle deepJungle = new DeepJungle(103, 105, 85, 70);

        Mountain mountain = new Mountain(20, 50, 10);
        WinterMountain winterMountain = new WinterMountain(10,70,5,1.02);

        Desert desert = new Desert(70, 70, 90);

        System.out.println(terrain.getTerrainSize()+"\n");
        System.out.println(forest.GetNumberTrees()+"\n");
        System.out.println(deepJungle.GetMonkeys()+"\n");
        System.out.println(mountain.GetMountains()+"\n");
        System.out.println(winterMountain.GetTemp()+"\n");
        System.out.println(desert.GetDunes()+"\n");

    }
}