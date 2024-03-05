public class Forest extends Terrain{
    private int l;
    private int w;
    private int t;
    
    public Forest(int _l, int _w, int _t){
        super(_l, _w);
        l = _l;
        _w = w;
        t = _t;
    }

    public String GetNumberTrees(){
        return "Forest" +getTerrainSize()+ " with "+ t + " trees";
    }
}
