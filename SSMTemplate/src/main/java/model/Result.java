package model;

/**
 * Created By Andrew Duan
 * Date:2020/2/5
 * e-mail:thinfog@126.com
 */
public class Result {

    private int _id;
    private String _name;

    public Result() {
    }

    public Result(int _id, String _name) {
        this._id = _id;
        this._name = _name;
    }

    public int get_id() {
        return _id;
    }

    public Result set_id(int _id) {
        this._id = _id;
        return this;
    }

    public String get_name() {
        return _name;
    }

    public Result set_name(String _name) {
        this._name = _name;
        return this;
    }
}
