/*
* File: Post.java
* Author: Kurucz János
* Copyright: 2024, Kurucz János
* Group: Szoft II/1/E
* Date: 2024-01-14
* Github: https://github.com/KuruczJanos/KuruczJanosPaClientDoli.git
* Licenc: GNU GPL
*/

public class Post {
    int userId;
    int id;
    String title;
    boolean completed;
    public Post() {}
    public Post(String title) {
        this.title = title;
    }
    public Post(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
    public Post(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
    
}