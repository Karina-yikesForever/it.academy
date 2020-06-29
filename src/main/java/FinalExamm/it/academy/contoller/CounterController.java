package FinalExamm.it.academy.contoller;

import FinalExamm.it.academy.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CounterController {


    @PostMapping("/counter")
    String reportCounter() {


    }
}
