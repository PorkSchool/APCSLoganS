public class Desert extends Terrain{
    private int l;
    private int w;
    private int s;
    
    public Desert(int _l, int _w, int _s){
        super(_l, _w);
        l = _l;
        _w = w;
        s = _s;
    }

    public String GetDunes(){
        return "Desert " +getTerrainSize()+ " with "+ s+ " dunes";
    }
}
