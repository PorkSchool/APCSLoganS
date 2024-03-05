public class WinterMountain extends Mountain{
    private int l;
    private int w;
    private int m;
    private double t;
    
    public WinterMountain(int _l, int _w, int _m, double _t){
        super(_l, _w, _m);
        l = _l;
        _w = w;
        t = _t;
        m = _m;
    }

    public String GetTemp(){
        return "Winter Mountain " +getTerrainSize()+" with "+ m+ " mountains"+ " at a temperature of " + t;
    }
}
