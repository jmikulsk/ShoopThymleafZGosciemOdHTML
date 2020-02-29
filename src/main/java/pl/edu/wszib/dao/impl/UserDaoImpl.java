package pl.edu.wszib.dao.impl;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.dao.UserDao;
import pl.edu.wszib.domain.Product;
import pl.edu.wszib.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class UserDaoImpl implements UserDao {

    private Map<Long, User> usertMap;
    private static Long id = 1L;

    public UserDaoImpl() {
        this.usertMap = new HashMap<>();
        prepareUsersList();
    }

    private void prepareUsersList() {
            User user = new User();
            user.setAge(10);
            user.setCountry("Polska");
            user.setEmail("tralala@asd.pl");
            user.setLogin("tralala");
            user.setAvailable(true);
            saveUser(user);

    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(usertMap.values());
    }

    @Override
    public void saveUser(User user) {
        if(user.getId()<1){
            user.setId(id);
            id++;
        }
        usertMap.put(user.getId(),user);
    }



    @Override
    public void removeUser(Long id) {
    usertMap.remove(id);
    }

    @Override
    public User getById(Long id) {
        return usertMap.get(id);
    }
}
