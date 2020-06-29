package FinalExamm.it.academy.service.impl;

import FinalExamm.it.academy.entity.Counter;
import FinalExamm.it.academy.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CounterServiceImpl implements CounterService {
    @Autowired

    @Override
    public Counter getById(Long id) {
        return null;
    }

    @Override
    public List<Counter> getAll() {
        return null;
    }

    @Override
    public Counter save(Counter item) {
        return null;
    }
}
