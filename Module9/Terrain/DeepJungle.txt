public class DeepJungle extends Forest{
    private int l;
    private int w;
    private int m;
    private int t;
    
    public DeepJungle(int _l, int _w, int _m, int _t){
        super(_l, _w, _t);
        l = _l;
        _w = w;
        t = _t;
        m = _m;
    }

    public String GetMonkeys(){
        return "Deep Jungle" +getTerrainSize()+ " with "+ t + " trees"+ " and " + m + " monkeys";
    }
}
