package healspan.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import healspan.login.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long >{
    User findByUsernameAndPassword(String um_username,String um_password);
}
