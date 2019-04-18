package hello.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import hello.dao.HelloDao;
import hello.dao.Student;

@Service
public class HelloService{

    HelloDao helloDao = new HelloDao();

    public int add(String data){
        Gson gson = new Gson();
        return helloDao.add(gson.fromJson(data, Student.class));
    }

    public String get(){
        Gson gson = new Gson();
        return gson.toJson(helloDao.get());
    }

}