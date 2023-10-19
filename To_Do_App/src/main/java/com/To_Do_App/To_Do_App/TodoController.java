package com.To_Do_App.To_Do_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    List<ToDo> toDoList;

    //create todos  Post APIS

    //add a todo
    @PostMapping("todo")
    public String addTodo(@RequestBody ToDo myTodo){
    toDoList.add(myTodo);
    return "todo is added";
    // API is created
    }

    // get API
    // get  all todos;

    @GetMapping("todos")
    public List<ToDo> getAllTodos(){
        return toDoList;
    }

    // updating todo;

    // send a todo ID and Status;

    @PutMapping("todo/id/{id}/status")
    public String setTodoStatusById(@PathVariable Integer id, @RequestParam boolean flag){
        for (ToDo toDo : toDoList){
            if(toDo.getTodoId().equals(id)){
                toDo.setTodoStatus(flag);
                return "todo: "+ id + "updated to "+ flag;
            }
        }
        return "Invalid id";
    }

    // delete id

    @DeleteMapping("todo/id/{id}")
    public String removeById(@PathVariable Integer id){
        for(ToDo toDo : toDoList){
            if(toDo.getTodoId().equals(id)){
                toDoList.remove(toDo);
                return "todo" + id + "removed";
            }
        }
        return "invalid Id";
    }
    @PostMapping("more")
    public String addTodos(@RequestBody List<ToDo> myTodos){
//        for(ToDo toDo : myTodos){
//
//            toDoList.add(toDo);
//        }
        toDoList.addAll(myTodos);

        return myTodos.size() + " are added";
    }

    @GetMapping("unDoneTodos")
    public List<ToDo> getAllUndoneTodos(){
        List<ToDo> unDoneTodos = new ArrayList<>();
        for (ToDo toDo : toDoList){
            if (!toDo.isTodoStatus()){
                unDoneTodos.add(toDo);
            }
        }
        return unDoneTodos;
    }

}
