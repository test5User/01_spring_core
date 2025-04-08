package by.itclass._05_annotations.mvcbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {
    private ConnManager cm;

    @Autowired
    public void setCm(ConnManager cm) {
        this.cm = cm;
    }

    @Override
    public String toString() {
        return "Dao class, Conn Manager:" + cm;
    }
}
