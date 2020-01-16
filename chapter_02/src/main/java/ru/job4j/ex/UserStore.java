package ru.job4j.ex;

import static jdk.nashorn.internal.objects.NativeString.indexOf;

public class UserStore {

    public static String findUser(User[] users,String login) throws UserNotFoundException {
        String rsl=String.valueOf(false);
        if ( users == null){
            throw new UserNotFoundException(" Username could not be null");
        }
        return rsl;
    }

    public static boolean validate(String user) throws UserInvalidException {
        return false;
    }

    public static void compare(User user,User[] users,String login) throws UserInvalidException {
        try {
            if ( indexOf(user,login) != 3 ){
                validate(login);
                System.out.println("This user is not valid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void main ( String[]args) throws UserNotFoundException {
            User[] users={
                    new User("Ekaterina Kalashnikova",true)
            };
            String user=findUser(users,"Ekaterina Kalashnikova");
            try {
                if ( validate(user)){
                    System.out.println("This user has an access");
                }
            } catch (UserInvalidException e) {
                e.printStackTrace();
            }
        }
    }