package com.example.testwork;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = User.class)
class TestWorkApplicationTests {

        @Autowired
        private User user;

        @Test
        public void testUser() {
                String expectedLogin = "name";
                String expectedEmail = "arasa@yandex.ru";

                assertEquals(expectedLogin, user.getLogin());
                assertEquals(expectedEmail, user.getEmail());
        }
        @Test
        public  void  testCorrectEmail(){

                User user = new User();

                assertNull(user.getEmail());

                String expectedEmail ="arasa@yandex.ru";
                user.setEmail(expectedEmail);
                assertEquals(expectedEmail, user.getEmail());

                String invalidEmail = "arasayandex.ru";
                user.setEmail(invalidEmail);

                assertEquals("", user.getEmail());

                String invalidEmail2 = "arasa@yandexru";
                user.setEmail(invalidEmail2);


                assertEquals("", user.getEmail());


                String emptyEmail = "";
                user.setEmail(emptyEmail);


                assertEquals("", user.getEmail());


        }
        @Test
        public  void  loginNotEqialEmail(){
                User user = new User();
                user.setLogin("name");
                user.setEmail("arasa@yandexru");
                assertNotEquals(user.getLogin(), user.getEmail());
        }

        @Test
        public void userCreatNull(){
                User user = new User();
                assertNotNull(user);
                assertNull(user.getLogin());
                assertNull(user.getEmail());
                }



}