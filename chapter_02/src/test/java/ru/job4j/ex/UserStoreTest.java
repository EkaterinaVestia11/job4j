package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static ru.job4j.ex.UserStore.*;

public class UserStoreTest{

    @Test(expected=ElementNotFoundException.class)
    public  void whenFindUser( ) throws UserNotFoundException{
        UserStore userStore = new UserStore();
        String rsl =findUser(new User[] {},"Мария");
        assertThat(rsl,is("false"));
    }


    @Test(expected= UserInvalidException.class)
    public void whenValidate( ) throws UserInvalidException {
        UserStore userStore = new UserStore();
        User rsl= validate();
        assertThat(rsl,is(" null "));
        }

    private User validate( ) {
        return null;
    }
}
