package FinalExamm.it.academy.service;

import FinalExamm.it.academy.entity.Report;

import java.util.List;

public interface BaseService{
    void setPost();

    Long getCount();

    List<Report> getLogs();
}
