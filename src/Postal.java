/*
* File: Postal.java
* Author: Kurucz János
* Copyright: 2024, Kurucz János
* Group: Szoft II/1/E
* Date: 2024-01-14
* Github: https://github.com/KuruczJanos/KuruczJanosPaClientDoli.git
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class Postal {
    
    TodoService todoService;

    public Postal() {
        todoService = new TodoService();
        getPosts();
        addPost();
    }

    public void getPosts() {        
        String posts = todoService.getPosts();        
        ArrayList<Post> postList = Convert.toListObject(posts, Post.class);
        for(Post post: postList) {
            System.out.println(post.id);
        }
    }

    public void addPost() {
        Post post = new Post(1, 201, "false" , true);
        String json = Convert.toJson(post);

        String result = todoService.addPost(json);
        System.out.println(result);
    }
}