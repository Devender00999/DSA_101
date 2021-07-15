class BiCycle{
    public int gear;
    public int speed;

    //Contructor
    public BiCycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(int decrement){
        this.speed -= decrement;
    }

    public void speedUp(int inc){
        this.speed += inc;
    }

    public String printInfo(){
        return "Speed: "+this.speed+" Gear: "+this.gear+" ";
    }
}

class MountainBike extends BiCycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int height){
        this.seatHeight = height;
    }

    //Printing info of bicycle
    @Override
    public String printInfo(){
        return super.printInfo()+"Seat Height: "+this.seatHeight+" ";
    }
}

public class Program {
    public static void main(String[] args)
    {
        MountainBike mtb = new MountainBike(5, 20, 12);
        //Printing info
        System.out.println(mtb.printInfo());
        mtb.speedUp(3);
        System.out.println(mtb.printInfo());


    }
}
