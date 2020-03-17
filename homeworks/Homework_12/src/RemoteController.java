

public class RemoteController {

    public void chooseChannel(int channelNumber) {
        tv.chooseChannel(channelNumber);
    }

    private TV tv; // ссылка на tv

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    //private Channel channel;

//    void setTV (TV tv){
////        this.tv = tv;
////    }
    //    public TV getTv() {
//        return tv;
//    }
//
//    public Channel getChannel() {
//        return channel;
//    }
//    public void onTV(){
//        tv.onChannel();
//    }
}
