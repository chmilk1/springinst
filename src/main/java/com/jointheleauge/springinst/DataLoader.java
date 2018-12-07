package com.jointheleauge.springinst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

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
        postRepo.save(new Post(1l,"first","i was first",new Date()));
        postRepo.save(new Post(2l,"second","just the man in the middle",new Date()));
        postRepo.save(new Post(3l,"last","sucks to be last",new Date()));
    }

    protected Iterable<Post> getPosts(){
        return postRepo.findAll();
    }
}
