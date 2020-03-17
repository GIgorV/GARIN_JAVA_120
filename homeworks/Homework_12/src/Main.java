/* Реализовать предметную область "Программа передач"
Есть телевизор, В телевизоре есть набор каналов
Канал имеет набор передач, У канала есть название и номер, закрепленный на пульте.
Есть пульт, который может выбирать каналы. Канал может показать текущю передачу.
У передачи есть название, которое выводится на экран. */

public class Main { //не корректный вывод
    public static void main(String[] args) {
        TV tv = new TV("Sony");
        RemoteController remoteController = new RemoteController(tv);
        Channel channel1 = new Channel(1, "Моя планета");
        Broadcast broadcast101 = new Broadcast("Новая земля. Погружение в неизвестность");
        Broadcast broadcast102 = new Broadcast("Кавказский пленник");
        Broadcast broadcast103 = new Broadcast("Страшно интересно");
        Channel channel2 = new Channel(2, "Культура");
        Broadcast broadcast201 = new Broadcast("Правила жизни");
        Broadcast broadcast202 = new Broadcast("Настоящая война престолов");
        Broadcast broadcast203 = new Broadcast("Легенды мирового кино");
        Channel channel3 = new Channel(3, "Россия 1");
        Broadcast broadcast301 = new Broadcast("Судьба человека");
        Broadcast broadcast302 = new Broadcast("60 минут");
        Broadcast broadcast303 = new Broadcast("Аншлаг");
        Channel channel4 = new Channel(4, "Первый");
        Broadcast broadcast401 = new Broadcast("Вести");
        Broadcast broadcast402 = new Broadcast("КВН");
        Broadcast broadcast403 = new Broadcast("Что? Где? Когда?");
        Channel channel5 = new Channel(5, "НТВ");
        Broadcast broadcast501 = new Broadcast("Сегодня");
        Broadcast broadcast502 = new Broadcast("Место встречи");
        Broadcast broadcast503 = new Broadcast("Детектив Пес");

        tv.addChannel(channel1);
        tv.addChannel(channel2);
        tv.addChannel(channel3);
        tv.addChannel(channel4);
        tv.addChannel(channel5);
        channel1.addBroadcast(broadcast101);
        channel1.addBroadcast(broadcast102);
        channel1.addBroadcast(broadcast103);
        channel2.addBroadcast(broadcast201);
        channel2.addBroadcast(broadcast202);
        channel2.addBroadcast(broadcast203);
        channel3.addBroadcast(broadcast301);
        channel3.addBroadcast(broadcast302);
        channel3.addBroadcast(broadcast303);
        channel4.addBroadcast(broadcast401);
        channel4.addBroadcast(broadcast402);
        channel4.addBroadcast(broadcast403);
        channel5.addBroadcast(broadcast501);
        channel5.addBroadcast(broadcast502);
        channel5.addBroadcast(broadcast503);

        remoteController.chooseChannel(1);
    }
}
//tv.setRemoteController(remoteController);
//remoteController.setTV(tv);

//       Broadcast broadcasts[]=new Broadcast[10];
//        for (int i = 0; i < broadcasts.length; i++){
//            broadcasts[i]=new Broadcast("Телетрансляция № " + i);
//
//        }
//        for (int i = 0; i < broadcasts.length; i++){
//            System.out.println("Тест " + broadcasts[i].getName());
//        }

//        channel1.getCurrentBroadcast();
//        channel2.getCurrentBroadcast();
//        channel3.getCurrentBroadcast();
//        channel4.getCurrentBroadcast();
//        channel5.getCurrentBroadcast();
