package ru.job4j.tracker;

public class CreateAction implements UserAction{

    @Override
    public String name( ) {
       return  "=== Create a new Item ==== ";
        }

   @Override
    public boolean execute ( Input input,Tracker tracker ){
        //System.out.print ("Enter name: ");
        String name=input.askStr ("Enter name: ");
        Item<Number> item=new Item<Number>(name) {
            /**
             * Returns the value of the specified number as an {@code int}.
             *
             * @return the numeric value represented by this object after conversion
             * to type {@code int}.
             */
            @Override
            public int intValue( ) {
                return 0;
            }

            /**
             * Returns the value of the specified number as a {@code long}.
             *
             * @return the numeric value represented by this object after conversion
             * to type {@code long}.
             */
            @Override
            public long longValue( ) {
                return 0;
            }

            /**
             * Returns the value of the specified number as a {@code float}.
             *
             * @return the numeric value represented by this object after conversion
             * to type {@code float}.
             */
            @Override
            public float floatValue( ) {
                return 0;
            }

            /**
             * Returns the value of the specified number as a {@code double}.
             *
             * @return the numeric value represented by this object after conversion
             * to type {@code double}.
             */
            @Override
            public double doubleValue( ) {
                return 0;
            }
        };
        tracker.add (item);
        return true;
    }
}
