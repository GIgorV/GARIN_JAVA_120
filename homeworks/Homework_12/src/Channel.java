import java.util.Random;

public class Channel {
    public final int MAX_BROADCAST_COUNT = 3;
    private int channelNumber; //номер канала
    private String name; //название канала
    private Broadcast broadcasts[]; //список передач у канала
    private TV tv; // чтобы в телевизор можно было добавить каналы
    //private RemoteController remoteController;
    private int count = 0; // счетчик для добавления программ в канал

    public Channel(int channelNumber, String name) {
        this.channelNumber = channelNumber;
        this.name = name;
        this.broadcasts = new Broadcast[MAX_BROADCAST_COUNT];
    }

    public void addBroadcast(Broadcast broadcast) {
        if (count<MAX_BROADCAST_COUNT){
           broadcasts[count]=broadcast;
           broadcast.setChannel(this);
           count++;
        }
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public String getName() {
        return name;
    }

    public Broadcast getCurrentBroadcast() { //рандомно выбираем передачу
        if (broadcasts.length > 0) {
            Random random = new Random();
            return broadcasts[random.nextInt(count - 1)];
        }
        return null;
    }
}
