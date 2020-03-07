package ru.job4j.tracker;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class StartUIExamle {
    public void init(Scanner scanner,Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item<Number> item =new Item<Number>(name ,4) {
                    @Override
                    public int intValue( ) {
                        return 0;
                    }

                    @Override
                    public long longValue( ) {
                        return 0;
                    }

                    @Override
                    public float floatValue( ) {
                        return 0;
                    }

                    @Override
                    public double doubleValue( ) {
                        return 0;
                    }
                };
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Get a list of items ====");
                System.out.print("Select name: ");
                Item<Number>[] all =tracker.findAll().toArray(new Item[ 0 ]);
                for(Item<Number> item : all) {
                    System.out.println(item);
                }
            } else if (select == 2){
                System.out.println("=== Change item ====");
                System.out.print("Enter name: ");
                String name=scanner.nextLine();
                String id=scanner.nextLine();
                Item<Number> item=getItem(name ,id);
                if ( tracker.replace(id,(Item) item)) {
                    System.out.println("Item was update");
                } else { System.out.println("Item not found");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter name : ");
                String name = scanner.nextLine();
                String id = scanner.nextLine();
                if ( tracker.delete(id)) {
                    System.out.println("Item was delete");
                } else { System.out.println("Item not found");
                }
            } else if (select == 4) {
                System.out.println("=== Search by id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item<Number> findById =(Item<Number>) tracker.findById(id);
                if ( findById != null){
                    System.out.println(id);
                } else { System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Search by key ====");
                System.out.print("Enter key: ");
                String key = scanner.nextLine();
                Item<Number>[] name =tracker.findByName(key).toArray(new Item[ 0 ]);
                for(Item<Number> item : name) {
                    System.out.println(item);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    @NotNull
    private Item<Number> getItem( String name ,String id ) {
        return new Item<Number>() {
            @Override
            public int intValue( ) {
                return 0;
            }

            @Override
            public long longValue( ) {
                return 0;
            }

            @Override
            public float floatValue( ) {
                return 0;
            }

            @Override
            public double doubleValue( ) {
                return 0;
            }
        };
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUIExamle().init(scanner, tracker);
    }

}
