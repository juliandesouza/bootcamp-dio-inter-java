public class User {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv ();

        System.out.println("Are the TV on? " + smartTv.on );
        System.out.println("Which channel is now? " + smartTv.channel);
        System.out.println("What is the level of TV volume? " + smartTv.volume);


        smartTv.turnOn();

        System.out.println("New check to TV on: " + smartTv.on);

        smartTv.turnOff();

        System.out.println("New check to TV on: " + smartTv.on);

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.decreaseVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.changeChannel(69);

        System.out.println("Currently channel: " + smartTv.channel);


    }
}
