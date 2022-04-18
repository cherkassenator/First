package exercise2_1;

public class Sound {
    private double dist;
    private double sound;

    public Sound(double sound) {
        this.sound = sound;
    }

    public void DistSound(){

        dist = sound * 1100;

        System.out.println("Расстояние до места вспышки молнии " + dist + " футов");
    }

}
