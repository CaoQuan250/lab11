package Part1;
class RaceCar extends Thread {
    int finish;
    String name;
    RaceCar (int finish,String name){
        this.finish = finish;
        this.name = name;
    }
    public void run(){
        for (int i = 9; i>finish;i--){
            System.out.println(name + " : " +(i+1) + " running...");
            try {
                Thread.sleep(Math.round(Math.random()*5000));
            } catch (Exception e) {}
        }
        System.out.println(name + "finished");
        System.out.println();
    }
}
public class Race {
    public static void main(String[] args) {
        RaceCar[] cars = new RaceCar[5];
        cars[0] = new RaceCar(1,"Mario");
        cars[1] = new RaceCar(1,"Songoku");
        cars[2] = new RaceCar(1,"Herman");
        cars[3] = new RaceCar(1,"Doremon");
        cars[4] = new RaceCar(1,"Hoang Phi Hong");
        for (int i=0; i<5; i++)
            cars[i].start();
    }
}
