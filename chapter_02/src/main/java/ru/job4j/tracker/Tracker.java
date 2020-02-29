package ru.job4j.tracker;

import jdk.internal.org.objectweb.asm.tree.AbstractInsnNode;

import java.util.*;

/**
 * author Ekaterina Kalashnikova
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>(100);
    // private final Item[] items=new Item[ 100 ];

    /**
     * Указатель ячейки для новой заявки.
     */
    // private int position=0;//указатель ячейки для новой заявки
    private static final Random rm=new Random();
    private AbstractInsnNode i;


    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item<Number> add ( Item<Number> item){
        items.add(item); // вставка в коллекцию.
        int index = 0;
        Item i = items.get(index); // получение данных из массива.
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId () {
        // Random rm=new Random(); //Реализовать метод генерации.
        return String.valueOf(rm.nextLong()+System.currentTimeMillis());
    }

    /**
     * Метод редактирования заявок, изменение ячейки в массиве
     *
     * @param id, item
     * @return если успешно, то вернуть true
     */
    public boolean replace (String id, Item<Number> item){
        item.setId(id);
        for(int i=0; isaBoolean(i); i++) {
            if ( id.equals(this.items.get(i).getId()) ){
                this.items.set(i ,item);
                return true;
            }
        }
        return false;
    }

    private boolean isaBoolean( int i ) {
        return false;
    }

    /**
     * Метод удаление заявок
     *
     * @return если успешно, то вернуть true
     */
    public boolean delete (String id){
        Iterator<Item> itemIterator = items.iterator();
        while(itemIterator.hasNext()){
            Item nextItem = itemIterator.next();
            if ( nextItem.getId().equals(id) ){
                itemIterator.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Метод возврата копии массива без null элементов
     *
     * @return копию массива без null элементов
     */
    public ArrayList<Item> findAll() {
       // return Arrays.copyOf(items, position);
        ArrayList<Item> items1=new ArrayList<>();
        ArrayList<Item> items = new ArrayList<Item>();
        items.addAll(0, items1);
        return items1;
    }


    /**
     * Метод сравнения заявки по имени
     *
     * @param key имя заявки
     * @return массив имен заявок
     */
    public ArrayList<Item> findByName ( String key) {
        ArrayList<Item> res  = new ArrayList<>();//заполняем массив указанными элементами
        int count = 0;
        for(int i=0; i < items.size(); i++) {//перебираем по указателю
            if ( Objects.equals(key ,this.items.get(i).getName()) ){//сравниваем все элементы массива с key
                res.set(count++ ,this.items.get(i));//складываем совпавшие элементы
            }
        }
        ArrayList<Item> resAnother =getResAnother(count);//заполняем ими массив
        System.arraycopy(res, 0, resAnother, 0, count);//копируем в результирующий массив
        return resAnother;
    }

    private ArrayList<Item> getResAnother( int count ) {
        return getItems(count);
    }

    private ArrayList<Item> getItems( int count ) {
        return new ArrayList<>(count);
    }

    /**
     * Метод сравнения заявки по ключу
     *
     * @param id ключ
     * @return item, если не найдена null
     */
    public Item<Number> findById ( String id) {
        Item result = null;
        for(int i=0; i < items.size(); i++) { //проверяем каждую
            if ( id.equals(items.get(i).getId())) { //сверяем одинаковые номера
                result = items.get(i);//выводим совпавшие
                break;
            }
        }
        return result;
    }
}
