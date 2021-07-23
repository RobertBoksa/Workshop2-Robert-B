package pl.coderslab.entity.DAO;

import java.util.Arrays;

public class MainDao {

    public static void main(String[] args) {
//       User user = new User("kartony22@o2.com", "Piotr Mostowiak", "kartony");
//        UserDao userDao = new UserDao();
//        userDao.create(user);
  //      User  user = userDao.read(2);
   //     System.out.println(user);

  //      UserDao userDao2 = new UserDao();
       // System.out.println(userDao2.read(4));

//        UserDao userDao = new UserDao();
//        User userChange = userDao.read(2);
//        userChange.setUserName("Barbara");
//        userDao.update(userChange);

 //       UserDao newDelete = new UserDao();
   //     newDelete.delete(1);

        UserDao newFindAll = new UserDao();
       newFindAll.findAll();

    }
}
