public class Mountain extends Terrain{
    private int l;
    private int w;
    private int m;
    
    public Mountain(int _l, int _w, int _m){
        super(_l, _w);
        l = _l;
        _w = w;
        m = _m;
    }

    public String GetMountains(){
        return "Mountain " +getTerrainSize()+" with "+ m+ " mountains";
    }
}
