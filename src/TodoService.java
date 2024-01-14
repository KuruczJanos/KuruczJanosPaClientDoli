/*
* File: TodoService.java
* Author: Kurucz János
* Copyright: 2024, Kurucz János
* Group: Szoft II/1/E
* Date: 2024-01-14
* Github: https://github.com/KuruczJanos/KuruczJanosPaClientDoli.git
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;
    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getPosts() {
        return client.get(url);
    }
    public String addPost(String json) {
        return client.post(url, json);        
    }
}
