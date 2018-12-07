package com.jointheleauge.springinst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by league on 12/6/18.
 */
@Service
public class DataLoader {

    private PostRepository postRepo;

    @Autowired
    public DataLoader(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @PostConstruct
    private void loadData() {

    }
}
