package ru.yakovenko;

import java.util.ArrayList;
import java.util.Date;
public class Queue implements Updatable{

    class Visitor implements Updatable{
        Applicant visitor;
        Date timeToGo;
        int window = -1;
        Visitor(){

        }

        void update(){

        }

        public void setWindow(int window) {
            this.window = window;
        }
    }

    private ArrayList<Visitor> queue;

    public Queue() {

    }

    public ArrayList<Visitor> getQueue() {
        return queue;
    }

    public void add(Applicant newOne){

    }

    public void update(){

    }

    public Visitor findLatest(int [] options){
        Visitor current = null;
        return current;
    }

}
