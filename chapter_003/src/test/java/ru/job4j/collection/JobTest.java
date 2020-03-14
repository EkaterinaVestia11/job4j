package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompactorByNameIncrease() {
        Comparator<Job> cmpName = new JobDescByNameIncrease();
        int rsl = cmpName.compare(
                new Job("Fix bug", 0),
                new Job(" Impl task", 1));
       assertThat(rsl, greaterThanOrEqualTo(0));
    }

    @Test
    public void whenCompactorByNameDescrease() {
        Comparator<Job> cmpName = new JobDescByNameDescrease();
        int rsl = cmpName.compare(
                new Job("Fix bug", 3),
                new Job(" Impl task", 1));
    assertThat(rsl, lessThan(3));
    }

    @Test
    public void whenCompactorByPriorityIncrease() {
        Comparator<Job> cmpPriority = new JobDescByPriorityIncrease();
        int rsl = cmpPriority.compare(
                new Job("Fix bug", 3),
                new Job(" Impl task", 1));
        assertThat(rsl, greaterThanOrEqualTo(1));
    }

    @Test
    public void whenCompactorByPriorityDecrease() {
        Comparator<Job> cmpPriority = new JobDescByPriorutyDescrease();
        int rsl = cmpPriority.compare(
                new Job("Fix bug", 4),
                new Job(" Impl task", 2));
        assertThat(rsl, lessThan(4));
    }

    @Test
    public void whenCompactorByNameAndPriorityIncrease() {
        Comparator<Job> cmpNamePriority = new JobDescByNameIncrease().thenComparing(new JobDescByPriorityIncrease());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(4));
    }

    @Test
    public void whenCompactorByNameAndPriorityDescrease() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDescrease().thenComparing(new JobDescByPriorutyDescrease());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(4));
    }
}
