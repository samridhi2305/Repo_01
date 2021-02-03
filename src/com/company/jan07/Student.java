package com.company.jan07;

public class Student {
    int id;
    String name;
    boolean blocked;

    Student(int id,String name,boolean blocked){
        this.id = id;
        this.name = name;
        this.blocked = blocked;
    }

   public void setId(int id){
      this.id = id;
    }

    public int getId(){
        return(id);
    }

     public void setName(String name) {
        this.name = name;
     }

    public String getName() {
        return name;
    }

    public void setBlocked(boolean blocked){
        this.blocked = blocked;
    }

    public boolean getBlocked(){
        return blocked;
    }
}
