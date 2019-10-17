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
    private int position=0;//указатель ячейки для новой заявки
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
     * Метод возврата копии массива без null элементов
     *
     * @return копию массива без null элементов
     */
    public Item[] findAll() {
        Item[] res=new Item[ this.position ]; //заполняем массив только нужными, указываем указателем
        for(int index=0; index != this.position; index++) { //перебираем по указателю
            res[ index ]=this.items[ index ]; //копируем из основного массива
        }
        return res;
    }

    /**
     * Метод сравнения заявки по имени
     *
     * @param key имя заявки
     * @return массив имен заявок
     */
    public Item[] findByName (String key) {
       Item[] res=new Item[ this.position ];//заполняем массив указанными элементами
       for(int i=0; i<this.position; i++) {//перебираем по указателю
            if (key.equals(this.items[ i ].getName())){//сравниваем все элементы массива с key
                items[ index++ ]=this.items[ i ];//складываем совпавшие элементы
            }
        }
        Item[] resAnother = new Item[ index ];//заполняем ими массив
       System.arraycopy(res, 0, resAnother, 0, index);//копируем в результирующий массив
        return resAnother;
    }

    /**
     * Метод сравнения заявки по ключу
     *
     * @param id ключ
     * @return item, если не найдена null
     */
    public Item findById (String id) {
        result = null;
       for(int i = 0; i < this.position; i++) { //проверяем каждую
            if ( id.equals(this.items[ i ].getId())) { //сверяем одинаковые номера
                result = this.items[ i ];//выводим совпавшие
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



