public class Archer
{
    /**
     * Variables
     */
    private float g; //Engine-Beschleuningung m/s^2 (height == 20m)
    private float v; //Geschwindigkeit der Kugel m/s
    private float wind; //Wind m/s



    /**
     * 
     * @return
     */
    public float getG() {
        return g;
    }

    public float getWind() {
        return wind;
    }



    /**
     * 
     * @param g
     */
    public void setG(float g) {
        this.g = g;
    }

    public void setWind(float wind) {
        this.wind = wind;
    }



    /**
     * Start Generation
     */
    public static void start()
    {

    }
}