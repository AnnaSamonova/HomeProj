package by.overone.projectFirst.Repository;

import by.overone.projectFirst.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, String> {
}
