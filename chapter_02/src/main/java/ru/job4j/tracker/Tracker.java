package ru.job4j.tracker;

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
    private final List<Item> items = new ArrayList<>(100);
    // private final Item[] items=new Item[ 100 ];

    /**
     * Указатель ячейки для новой заявки.
     */
    // private int position=0;//указатель ячейки для новой заявки
    private static final Random rm=new Random();
    private int index;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     * @return
     */
    public Item add( Item item) {
        item.setId(this.generateId());
        items.add(item); // вставка в коллекцию.
        //item = items.get(index);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId () {
        Random rm=new Random(); //Реализовать метод генерации.
        return String.valueOf(rm.nextLong()+System.currentTimeMillis());
    }

    /**
     * Метод редактирования заявок, изменение ячейки в массиве
     *
     * @param id, item
     * @return если успешно, то вернуть true
     */
    public boolean replace (String id, Item item){
        item.setId(id);
        for(int i=0; i < items.size(); i++) {
            if ( id.equals(items.get(i).getId()) ){
                items.set(i , item);
                return true;
            }
        }
        return false;
    }

    /**
     * Метод удаление заявок
     *
     * @return если успешно, то вернуть true
     */
    public boolean delete (String id){
        for(int i=0; i < items.size(); i++) {
            if ( id.equals(this.items.get(i).getId()) ){
                items.remove(i);
               // System.arraycopy(this.items,i+1, this.items,i , items.size());
              //  this.delete(id);
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
    public List<Item> findAll() {
       // return Arrays.copyOf(items, position);
        List<Item> items1= new ArrayList<>();
        List<Item> items = new ArrayList<Item>();
        items.addAll(0, items);
        return this.items;
    }


    /**
     * Метод сравнения заявки по имени
     *
     * @param key имя заявки
     * @return массив имен заявок
     */
    public List<Item> findByName ( String key) {
        List<Item> res  = new ArrayList<>();//заполняем массив указанными элементами
        int count = 0;
        for (Item item : items){
        //for(int i=0; i < items.size(); i++) {//перебираем по указателю
            if ( Objects.equals(key , item.getName())) {//сравниваем все элементы массива с key
                res.add(item);//складываем совпавшие элементы
            }
        }
        return res;
    }

    /**
     * Метод сравнения заявки по ключу
     *
     * @param id ключ
     * @return item, если не найдена null
     */
    public List<Item> findById ( String id) {
        Item result = null;
        for(Item item : items){
       // for(int i=0; i < items.size(); i++) { //проверяем каждую
            if ( Objects.equals(id ,item.getId())) { //сверяем одинаковые номера
                result = items.get(Integer.parseInt(id));//выводим совпавшие
                break;
            }
        }
        return (List<Item>) result;
    }
}
