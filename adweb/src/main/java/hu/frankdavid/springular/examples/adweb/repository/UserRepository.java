package hu.frankdavid.springular.examples.adweb.repository;


import hu.frankdavid.springular.examples.adweb.entity.User;
import hu.frankdavid.springular.core.rpc.EnableFromJavascript;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableFromJavascript
public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    @EnableFromJavascript
    User findOne(Long aLong);
}
