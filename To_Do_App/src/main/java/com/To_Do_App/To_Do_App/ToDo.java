package com.To_Do_App.To_Do_App;

public class ToDo {
    private Integer todoId;
    private String todoName;
    private boolean todoStatus;

    public ToDo(Integer todoId, String todoName, boolean todoStatus) {
        this.todoId = todoId;
        this.todoName = todoName;
        this.todoStatus = todoStatus;
    }

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public boolean isTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(boolean todoStatus) {
        this.todoStatus = todoStatus;
    }

}
