package com.intelwalk.babytracker;

public class Event {

    private int _id;
    private String _eventname;

    public Event(){

    }

    public Event(String eventname){
        this._eventname = eventname;
    }

    public int get_id() {
        return _id;
    }

    public String get_eventname() {
        return _eventname;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_eventname(String _eventname) {
        this._eventname = _eventname;
    }
}
