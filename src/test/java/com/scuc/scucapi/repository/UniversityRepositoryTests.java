package com.scuc.scucapi.repository;

import com.scuc.scucapi.entity.University;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
public class UniversityRepositoryTests {
    @Autowired
    UniversityRepository univRepos;

    @Test
    public void testClass() {
        System.out.println(univRepos.getClass().getName());
    }

//    @Test
    public void testInsertDummies() {
        University univ = University.builder().name("염석대").build();
        univRepos.save(univ);
    }

    @Transactional
    @Test
    public void testSelect() {
        University univ = univRepos.getById(1L);
        System.out.println("===============");
        System.out.println(univ);
        System.out.println("===============");
    }
}
