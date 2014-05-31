package hu.frankdavid.springular.examples.adweb.repository;

import hu.frankdavid.springular.core.rpc.EnableFromJavascript;
import hu.frankdavid.springular.examples.adweb.entity.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@EnableFromJavascript
@Service
@Transactional
public class TestService {
    @PersistenceContext
    EntityManager entityManager;

    @EnableFromJavascript
    public String getHello() {
        return "hello";
    }

    @EnableFromJavascript
    public int add(int a, int b) {
        return a + b;
    }

    @EnableFromJavascript
    @Async
    public User getUser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        return entityManager.find(User.class, 2L);
    }

    @EnableFromJavascript
    @Transactional
    public void createUser() {
        User user = new User();
        user.setName("Zsolt");
        entityManager.persist(user);
    }
}
