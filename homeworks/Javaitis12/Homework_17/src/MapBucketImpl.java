public class MapBucketImpl<K, V> implements Map<K, V> {
    private static final int DEFAULT_SIZE = 16; // 16 чтобы корректно сработала конъюнкция

    static class MapEntry<K, V> {
        K key;
        V value;
        MapEntry<K, V> next; //каждый элемент массива - это связанный список (речь об объектах)

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    MapEntry<K, V> entries[];

    public MapBucketImpl() {
        entries = new MapEntry[DEFAULT_SIZE];
    }

    @Override
    public V get(K key) { //cc
        int hashCode = key.hashCode();
        int position = hashCode & (entries.length - 1);
        MapEntry<K, V> current = entries[position];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        MapEntry<K, V> newmapEntry = new MapEntry<>(key, value);
        int hashCode = key.hashCode(); //поскольку он в Object определен, мы можем у любого ключа взять hashCode и
        // т.к. hashCode может прилететь какой угодно, & - конъюнкция, логическое и, оно же AND, перемножить биты
        int position = hashCode & (entries.length - 1); // для того, чтобы урезать hashCode
        if (entries[position] != null) { //если в корзине что-то есть, здесь возможны 2 ситуации:
            //когда у вас совпадает ключ и нужно обновить элемент и //позиция совпала, а ключи нет.
            MapEntry<K, V> current = entries[position]; //получили первый элемент
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value; //если совпал ключ - меняем значение
                    return;
                }
                current = current.next; //бегаем по связанному списку
            } // дошли до конца, совпадений не найдено и
            newmapEntry.next = entries[position]; //теперь новый элемент указывает на самый первый элемент в bucket.
            entries[position] = newmapEntry; // теперь новый элемент становится самым первым в bucket
        }
        entries[position] = newmapEntry; //если корзина была пустая
    }
}
