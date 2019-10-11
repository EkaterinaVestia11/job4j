package ru.job4j.tracker;

import java.util.Random;
/**
 * author Ekaterina Kalashnikova
 * @version $Id$
 * @since 0.1
 */
public class Tracker{
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items=new Item[ 100 ];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position=0;
    private Item result; //указываем результат
    private int index;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add (Item item){
        item.setId(this.generateId());
        this.items[ this.position++ ]=item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId ( ){
        Random rm=new Random(); //Реализовать метод генерации.
        return String.valueOf(rm.nextLong()+System.currentTimeMillis());
    }

    /**
     * Метод редактирования заявок, изменение ячейки в массиве
     *
     * @param id, item
     * @return если успешно, то вернуть true
     */
    public boolean replace (String id,Item item){
        item.setId(id);
        for(int i=0; i<this.position; i++) {
            if ( id.equals(this.items[ i ].getId()) ){
                this.items[ i ]=item;
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
        for(int i=0; i<this.position; i++) {
            if ( id.equals(this.items[ i ].getId()) ){
                System.arraycopy(this.items,i+1,this.items,i,position-i-1);
                this.items[ --this.position ]=null;
                return true;
            }
        }
        return false;
    }

    /**
     * Метод возврата копии массива без null
     *
     * @return копию массива без null
     */
    public Item[] findAll ( ){
        Item[] res=new Item[ position ]; //заполняем массив только нужными, указываем указателем
        for(int index=0; index != this.position; index++) { //перебираем по указателю
            res[ position ]=this.items[ index ]; //копируем из основного массива
        }
        return res;
    }

    /**
     * Метод сравнения заявки по ключу
     *
     * @param key ключ
     * @return массив ключей
     */
    public String findByName (String key){
        Item[] items=new Item[ this.position ];
        for(int i=0; i<this.position; i++) {
            if ( key.equals(this.items[ i ].getName()) ){
                items[ index++ ]=this.items[ i ];
            }
        }
        Item[] res=new Item[ Integer.parseInt(key) ];
        for(index=0; index != this.position; index++) {
            res[ Integer.parseInt(key) ]=this.items[ index ];
        }
        return key;
    }

    /**
     * Метод сравнения заявки по номеру
     *
     * @param id
     * @return item, если не найдена null
     */
    public Item findById (String id){
        for(Item item : items) { //проверяем каждую
            if ( item != null && item.getId().equals(id) ){ //сверяем нет ли пустых и одинаковые ли номера
                result=item;
                break;
            }
        }
        return result;
    }

    public static void main (String[] args){
    Tracker tracker = new Tracker();
    tracker.add();
    tracker.delete();
    tracker.replace();
    tracker.findAll();
    tracker.findByName();
    tracker.findById();
    }

    private void findById ( ){
    }

    private void replace ( ){
    }

    private void delete ( ){
    }

    private void add ( ){
    }

    public void add (Item item,Item item1,Item item2){
    }

    void findByName ( ) {
    }
}



