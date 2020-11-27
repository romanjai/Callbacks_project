package com.romanjaik;

import lombok.Setter;
import lombok.Getter;

import java.util.Objects;

@Getter
@Setter
public class Callback {


    private Long id;
    private  String guid;
    private String LastResult;
    private String origCallerNbr;
    private Integer last;
    private String lastresult;
    private String next;
    private String queuename;
    private String start;

    public Callback() {

    }

    public Callback(Long id, String guid, String LastResult, String origCallerNbr,
                    Integer last, String lastresult, String next, String queuename,String start) {
        this.id = id;
        this.guid = guid;
        this.LastResult = LastResult;
        this.origCallerNbr = origCallerNbr;
        this.last = last;
        this.lastresult = lastresult;
        this.next = next;
        this.queuename = queuename;
        this.start = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Callback callback = (Callback) o;
        return Objects.equals(id, callback.id) &&
                Objects.equals(guid, callback.guid) &&
                Objects.equals(LastResult, callback.LastResult) &&
                Objects.equals(origCallerNbr, callback.origCallerNbr) &&
                Objects.equals(last, callback.last) &&
                Objects.equals(lastresult, callback.lastresult) &&
                Objects.equals(next, callback.next)  &&
                Objects.equals(queuename, callback.queuename) &&
                Objects.equals(start, callback.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guid, LastResult, origCallerNbr, last, lastresult, next, queuename, start );
    }
}
