public class Broadcast { //передача, радиопередача, радиовещание, телепередача

    private String name; //наименование передачи
    private Channel channel;

    public Broadcast(String name) { //задать имя передачи
        this.name = name;
    }
    public void setChannel(Channel channel){
        this.channel=channel;
    }

    public String getName() { //получить имя передачи
        return name;
    }
}
