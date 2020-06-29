package FinalExamm.it.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.css.Counter;

@Repository
public interface CounterRepo extends JpaRepository<Counter,Long> {
}
