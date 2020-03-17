public class TV {
    public final int MAX_CHANNEL_COUNT = 99;
    private Channel currentChannel; //текущий выбранный канал
    private String name;
    private Channel channels[];
    private int count = 0;

    public TV(String name) {
        this.name = name;
        this.channels = new Channel[MAX_CHANNEL_COUNT];
    }

    public void addChannel(Channel channel) {
        if (count < MAX_CHANNEL_COUNT) {
            channels[count] = channel;
            channel.setTv(this);
            count++;
        }
    }

    public void chooseChannel(int channelNumber) { //выбрать канал по номеру
        for (int i = 0; i < count; i++) {
            if (channels[i].getChannelNumber() == channelNumber) {
                this.currentChannel = channels[i];
                System.out.println("Выбран канал: " + channels[i].getName());
                System.out.println("Транслируется программа: " + channels[i].getCurrentBroadcast());
                return;
            }
        }
        System.err.println("Канал не зарегистрирован");
    }

    public Channel getCurrentChannel() { //получить текущий канал
        return currentChannel;
    }

}