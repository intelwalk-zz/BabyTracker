package com.intelwalk.babytracker;

public class Event {

    private int _id;
    private String _eventname;
    private String _eventdate;
    private String _eventtime;
    private String _eventcomments;
    private String _cryingtype;
    private int _wetdirtydiaper;
    private int _diaperrash;
    private int nursingorfood;
    private int _nursinglorr;
    private int _tableorbabyfood;
    private String _temperaturetype;
    private String _temperaturenumber;
    private int _napornightssleep;
    private String _napsleepduration;
    private int _hairwash;

    public Event(){


    }

    /*public Event(String temperaturenumber, String temperaturetype){
        this._temperaturenumber = temperaturenumber;
        this._temperaturetype = temperaturetype;
    }*/

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

    public String get_eventdate() {
        return _eventdate;
    }

    public void set_eventdate(String _eventdate) {
        this._eventdate = _eventdate;
    }

    public String get_eventtime() {
        return _eventtime;
    }

    public void set_eventtime(String _eventtime) {
        this._eventtime = _eventtime;
    }

    public String get_eventcomments() {
        return _eventcomments;
    }

    public void set_eventcomments(String _eventcomments) {
        this._eventcomments = _eventcomments;
    }

    public String get_cryingtype() {
        return _cryingtype;
    }

    public void set_cryingtype(String _cryingtype) {
        this._cryingtype = _cryingtype;
    }

    public int get_wetdirtydiaper() {
        return _wetdirtydiaper;
    }

    public void set_wetdirtydiaper(int _wetdirtydiaper) {
        this._wetdirtydiaper = _wetdirtydiaper;
    }

    public int get_diaperrash() {
        return _diaperrash;
    }

    public void set_diaperrash(int _diaperrash) {
        this._diaperrash = _diaperrash;
    }

    public int get_nursingorfood() {
        return nursingorfood;
    }

    public void set_nursingorfood(int _nursingorfood) {
        this.nursingorfood = _nursingorfood;
    }

    public int get_nursinglorr() {
        return _nursinglorr;
    }

    public void set_nursinglorr(int _nursinglorr) {
        this._nursinglorr = _nursinglorr;
    }

    public int get_tableorbabyfood() {
        return _tableorbabyfood;
    }

    public void set_tableorbabyfood(int _tableorbabyfood) {
        this._tableorbabyfood = _tableorbabyfood;
    }

    public String get_temperaturetype() {
        return _temperaturetype;
    }

    public void set_temperaturetype(String _temperaturetype) {
        this._temperaturetype = _temperaturetype;
    }

    public String get_temperaturenumber() {
        return _temperaturenumber;
    }

    public void set_temperaturenumber(String _temperaturenumber) {
        this._temperaturenumber = _temperaturenumber;
    }

    public int get_napornightssleep() {
        return _napornightssleep;
    }

    public void set_napornightssleep(int _napornightssleep) {
        this._napornightssleep = _napornightssleep;
    }

    public String get_napsleepduration() {
        return _napsleepduration;
    }

    public void set_napsleepduration(String _napsleepduration) {
        this._napsleepduration = _napsleepduration;
    }

    public int get_hairwash() {
        return _hairwash;
    }

    public void set_hairwash(int _hairwash) {
        this._hairwash = _hairwash;
    }
}
